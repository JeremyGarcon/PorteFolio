import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

public class TaskManagerEventHandlers {

    private JButton addButton;
    private JButton removeButton;
    private JButton openButton;
    private JButton completButton;
    private JTextField userInputField;
    private DefaultListModel<Task> listModel;
    private JList<Task> taskList;
    private TaskManagerJson jsonHandler;
    private JComboBox categoryFiltreButton;
    private JComboBox priorityFiltreButton;

    // Constructeur de la classe TaskManagerEventHandlers, qui prend en paramètre les éléments de l'interface graphique
    public TaskManagerEventHandlers(JButton addButton, JButton removeButton, JButton openButton,  
                                    JTextField userInputField, DefaultListModel<Task> listModel, JList<Task> taskList, 
                                    TaskManagerJson jsonHandler, JButton completButton, JComboBox categoryFiltreButton, JComboBox priorityFiltreButton ) {
        this.addButton = addButton;
        this.removeButton = removeButton;
        this.openButton = openButton;
        this.completButton = completButton;
        this.userInputField = userInputField;
        this.listModel = listModel;
        this.taskList = taskList;
        this.jsonHandler = jsonHandler;
        this.categoryFiltreButton = categoryFiltreButton;
        this.priorityFiltreButton = priorityFiltreButton;
    }

    public void setupEventHandlers() {

        addButton.addActionListener(new ActionListener() { // Méthode pour ajouter une tâche
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskName = userInputField.getText();
                if (!taskName.isEmpty()) {
                    TaskManagerCreateTasks priorityDialog = new TaskManagerCreateTasks(null);
                    priorityDialog.setVisible(true);
                    String priority = priorityDialog.getSelectedPriority();
                    String category = priorityDialog.getSelectedCategory();
                    Task newTask = new Task(Task.taskid(),taskName, "Description de la tache", false, priority, category, category, category); // Ajout de la tâche sans marquer comme complétée
                    listModel.addElement(newTask);
                    userInputField.setText("");
                    jsonHandler.writeJsonFile(newTask);
                    TaskManagerJson.refreshTaskList();
                }
            }
        });

        removeButton.addActionListener(new ActionListener() { // Méthode pour supprimer une tâche
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                   // jsonHandler.removeTask(selectedIndex);
                    TaskManagerJson.refreshTaskList();
                }
            }
        });
        
        openButton.addActionListener(new ActionListener() { // Méthode pour ouvrir une tâche
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                Task taskToOpen = listModel.getElementAt(selectedIndex);
                TaskManagerOpenTask TaskOpen = new TaskManagerOpenTask(null, taskToOpen, jsonHandler);
                TaskOpen.setVisible(true);  
            }
        });

        completButton.addActionListener(new ActionListener() { // Méthode pour marquer une tâche comme complétée
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex(); // Récupérer l'index de la tâche sélectionnée
                Task taskselect = listModel.getElementAt(selectedIndex); // Récupérer la tâche sélectionnée
                
                if (taskselect.getcompleted() == true) {
                    TaskManagerJson.updateTaskCompleted(taskselect.getName(), false);
                    taskselect.setCompleted(false); // Marquer la tâche comme complétée
                    System.out.println("Task completed : " + taskselect.getName() + "Completed :" +taskselect.getcompleted());
                } else if (taskselect.getcompleted() == false) {
                    TaskManagerJson.updateTaskCompleted(taskselect.getName(), true);
                    taskselect.setCompleted(true); // Marquer la tâche comme non complétée
                    System.out.println("Task completed : " + taskselect.getName() + "Completed :" +taskselect.getcompleted());
                } else if (selectedIndex == -1) {
                    System.err.println("No task selected!");
                }
                TaskManagerJson.refreshTaskList();
            }
        });
        
        categoryFiltreButton.addActionListener(new ActionListener() { // Méthode pour filtrer les tâches par catégorie
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) categoryFiltreButton.getSelectedItem();
                String selectedPriority = (String) priorityFiltreButton.getSelectedItem();
                filterTasks(selectedCategory, selectedPriority);
            }
        });
        
        priorityFiltreButton.addActionListener(new ActionListener() { // Méthode pour filtrer les tâches par priorité
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) categoryFiltreButton.getSelectedItem();
                String selectedPriority = (String) priorityFiltreButton.getSelectedItem();
                filterTasks(selectedCategory, selectedPriority);
            }
        });

        
    }
    private void filterTasks(String selectedCategory, String selectedPriority) { // Méthode pour filtrer les tâches
        if (selectedCategory.equals("All") && selectedPriority.equals("All")) {
            TaskManagerJson.refreshTaskList();
            return;
        } else {
            // Filtrer les tâches par priorité uniquement
            listModel.clear();
            TaskManagerJsonFilter.loadTasksFilter(selectedCategory, selectedPriority, listModel);
        }
    }    
}
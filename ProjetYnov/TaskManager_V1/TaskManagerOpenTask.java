import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskManagerOpenTask extends JDialog {

    private JTextArea descriptionTextArea;
    
    public TaskManagerOpenTask(JFrame parent, Task task, TaskManagerJson jsonHandler) {
        super(parent, "Description Task", true); 
        setSize(400, 300); // Définition de la taille de la fenêtre
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Fermer la fenêtre sans fermer l'application
        setLocationRelativeTo(parent); // Centrer la fenêtre par rapport à la fenêtre parent

        // Création d'une icône pour la fenêtre
        ImageIcon icon = new ImageIcon("Images/Icone.jpg");
        setIconImage(icon.getImage());

        // Création des composants
        JLabel nameLabel = new JLabel("Task Name:");
        JLabel dateLabel = new JLabel("Date Created:");
        JLabel timeLabel = new JLabel("Time Created:");
        JLabel priorityLabel = new JLabel("Priority:");
        JLabel categoryLabel = new JLabel("Category:");
        JLabel descriptionLabel = new JLabel("Description:");
        JLabel completed = new JLabel("Completed:");

        

        JLabel nameValueLabel = new JLabel(task.getName());
        JLabel dateValueLabel = new JLabel(task.getDates());
        JLabel timeValueLabel = new JLabel(TaskManagerJson.getTimeTask(task.getName()));
        JLabel priorityValueLabel = new JLabel(task.getPriority());
        JLabel categoryValueLabel = new JLabel(task.getCategory());
        JLabel completedValueLabel = new JLabel(task.getcompletedstring());

        descriptionTextArea = new JTextArea(8, 30);
        descriptionTextArea.setText(task.getDescription());

        JButton saveButton = new JButton("Save Task");
        JButton cancelButton = new JButton("Cancel");
        JButton categoryButton = new JButton("Change Category");

        // Création des panneaux
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.add(createLabelValuePanel(nameLabel, nameValueLabel));
        infoPanel.add(createLabelValuePanel(dateLabel, dateValueLabel));
        infoPanel.add(createLabelValuePanel(timeLabel, timeValueLabel));
        infoPanel.add(createLabelValuePanel(priorityLabel, priorityValueLabel));
        infoPanel.add(createLabelValuePanel(categoryLabel, categoryValueLabel));
        infoPanel.add(createLabelValuePanel(completed, completedValueLabel));

        JPanel descPanel = new JPanel(new BorderLayout());
        descPanel.add(descriptionLabel, BorderLayout.NORTH);
        descPanel.add(new JScrollPane(descriptionTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(categoryButton);

        descPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Ajout des panneaux au contenu de la fenêtre
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(infoPanel, BorderLayout.NORTH);
        getContentPane().add(descPanel, BorderLayout.CENTER);

        // Définition des actions des boutons pour enregistrer ou annuler
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newDescription = descriptionTextArea.getText();
                task.setDescription(newDescription);
                TaskManagerJson.updateTaskDescription(task.getName(), task.getDescription());
                TaskManagerJson.refreshTaskList();
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        categoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TaskManagerCategory OpenCategory = new TaskManagerCategory(null, task, jsonHandler);
                OpenCategory.setVisible(true);
            }
        });
    }

    // Méthode utilitaire pour créer un panneau avec une étiquette et une valeur
    private JPanel createLabelValuePanel(JLabel label, JLabel valueLabel) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(valueLabel);
        return panel;
    }
}

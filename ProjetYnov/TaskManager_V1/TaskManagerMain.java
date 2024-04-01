import javax.swing.*;
import tableaux_priority_and_category.Category;
import tableaux_priority_and_category.Priority;

public class TaskManagerMain extends JFrame {

    protected static Object main;
    public static DefaultListModel<Task> listModel;
    public static JList<Task> taskList;
    private JButton addButton;

    // Déclaration des labels pour les filtres de catégorie et de priorité
    static JLabel CategoryFiltre;
    private JComboBox CategoryFiltreButton;
    static JLabel PriorityFiltre;
    private JComboBox PriorityFiltreButton;

    // Déclaration des boutons pour les actions sur les tâches
    private JButton removeButton;
    private JButton openButton;
    private JButton completButton;

    // Déclaration du champ de texte pour l'entrée utilisateur
    private JTextField userInputField;
    private TaskManagerJson jsonHandler;
    private TaskManagerEventHandlers eventHandlers;

    public TaskManagerMain() {
        super("Task Manager"); // Titre de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fermer l'application lors de la fermeture de la fenêtre

        ImageIcon icon = new ImageIcon("Images/Icone.jpg"); // Création d'une icône pour la fenêtre
        setIconImage(icon.getImage());

        // Initialisation des composants graphiques
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        completButton = new JButton("Complete Task");
        addButton = new JButton("Add Task");

        CategoryFiltre = new JLabel("List of all taks");
        CategoryFiltreButton = new JComboBox(Category.categoryFilter);
        PriorityFiltre = new JLabel("List of all Priority");
        PriorityFiltreButton = new JComboBox(Priority.priorityFilter);

        removeButton = new JButton("Remove Task");
        openButton = new JButton("Open Task");
        userInputField = new JTextField(15);


        // Création des instances  de TaskManagerJson et TaskManagerEventHandlers
        jsonHandler = new TaskManagerJson();
        eventHandlers = new TaskManagerEventHandlers(addButton,removeButton, openButton, userInputField, listModel, taskList, jsonHandler, completButton, CategoryFiltreButton, PriorityFiltreButton);

        // Configuration des gestionnaires d'événements pour les boutons
        eventHandlers.setupEventHandlers();

        // Chargement des tâches depuis le fichier JSON
        TaskManagerJson.loadTasksFromFile(listModel);

        // Configuration de la mise en page et affichage de la fenêtre
        getContentPane().add(new TaskManagerPanel(addButton, CategoryFiltre,removeButton, openButton, userInputField, taskList, completButton, CategoryFiltreButton, PriorityFiltreButton, PriorityFiltre)); // Ajouter le panneau principal à la fenêtre
        setSize(600, 400); // Définir la taille de la fenêtre
        setLocationRelativeTo(null); // Centrer la fenêtre sur l'écran
    }

    public static void main(String[] args) {
        TaskManagerMain main = new TaskManagerMain();
        main.setVisible(true);
    }
}

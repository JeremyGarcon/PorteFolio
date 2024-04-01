import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.jdesktop.swingx.JXDatePicker;
import tableaux_priority_and_category.Category;
import tableaux_priority_and_category.Priority;
import java.util.Date;

public class TaskManagerCreateTasks extends JDialog {

    private static String selectedPriority; // Variable pour stocker la priorité sélectionnée
    private static String selectedCategory; // Variable pour stocker la catégorie sélectionnée
    private static Date selectedDate; // Variable pour stocker la date sélectionnée

    public TaskManagerCreateTasks(JFrame parent) {
        super(parent, "Create the Task", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Fermer la fenêtre sans fermer l'application
        setSize(300, 250); // Définition de la taille de la fenêtre
        setLocationRelativeTo(parent); // Centrer la fenêtre par rapport à la fenêtre parent
        ImageIcon icon = new ImageIcon("Images/Icone.jpg"); // Création d'une icône pour la fenêtre
        setIconImage(icon.getImage()); // Définition de l'icône de la fenêtre

        // Combobox pour la priorité
        JComboBox<String> priorityComboBox = new JComboBox<>(Priority.priorityOptions);
        priorityComboBox.setSelectedIndex(0);

        // Combobox pour la catégorie
        JComboBox<String> categoryComboBox = new JComboBox<>(Category.categoryOptions);
        categoryComboBox.setSelectedIndex(0);

        // JXDatePicker pour sélectionner la date
        JXDatePicker datePicker = new JXDatePicker();
        datePicker.setDate(new Date()); // Définir la date actuelle comme date sélectionnée par défaut

        // Bouton OK
        JButton okButton = new JButton("OK");
        
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedPriority = (String) priorityComboBox.getSelectedItem(); // Récupérer la priorité sélectionnée
                selectedCategory = (String) categoryComboBox.getSelectedItem(); // Récupérer la catégorie sélectionnée
                selectedDate = datePicker.getDate(); // Récupérer la date sélectionnée
                dispose();
            }
        });

        // Panneau principal
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Priority:"));
        panel.add(priorityComboBox);
        panel.add(new JLabel("Category:"));
        panel.add(categoryComboBox);
        panel.add(new JLabel("Dead Time:"));
        panel.add(datePicker);
        panel.add(okButton);

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    // Méthode pour récupérer la priorité sélectionnée
    public static String getSelectedPriority() {
        return selectedPriority;
    }

    // Méthode pour récupérer la catégorie sélectionnée
    public static String getSelectedCategory() {
        return selectedCategory;
    }

    // Méthode pour récupérer la date sélectionnée
    public static Date getSelectedDate() {
        return selectedDate;
    }
}

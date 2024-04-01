import javax.swing.*;
import java.awt.*;

public class TaskManagerPanel extends JPanel {

    public TaskManagerPanel(JButton addButton, JLabel CategoryFiltre, JButton removeButton, JButton openButton,
                            JTextField userInputField, JList<Task> taskList, JButton completeButton,
                            JComboBox categoryFiltreButton, JComboBox priorityFiltreButton, JLabel priorityFiltre) {
        // Configuration du layout principal et de la couleur de fond
        setLayout(new BorderLayout());

        // Panel pour l'ajout de nouvelles tâches et les filtres
        JPanel inputAndFilterPanel = new JPanel(new BorderLayout());

        // Panel pour l'ajout de nouvelles tâches
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(userInputField, BorderLayout.CENTER); // Champ de texte pour l'entrée utilisateur
        inputPanel.add(addButton, BorderLayout.EAST); // Bouton pour ajouter une nouvelle tâche
        inputAndFilterPanel.add(inputPanel, BorderLayout.NORTH); // Ajout du panneau d'entrée en haut

        // Panel pour les boutons de catégorie et de priorité
        JPanel categoryPriorityPanel = new JPanel(new GridLayout(1, 2));
        categoryPriorityPanel.add(categoryFiltreButton); // Combobox pour filtrer les catégories
        categoryPriorityPanel.add(priorityFiltreButton); // Combobox pour filtrer par priorité
        inputAndFilterPanel.add(categoryPriorityPanel, BorderLayout.SOUTH); // Ajout des boutons de catégorie et de priorité en bas

        // Panel pour la liste de tâches
        JPanel taskListPanel = new JPanel(new BorderLayout());
        taskListPanel.add(new JScrollPane(taskList), BorderLayout.CENTER); // Ajout de la liste de tâches avec défilement

        // Panel pour les boutons d'action
        JPanel actionButtonPanel = new JPanel(new GridLayout(1, 3));
        actionButtonPanel.add(completeButton); // Bouton pour marquer les tâches comme complétées
        actionButtonPanel.add(removeButton); // Bouton pour supprimer les tâches sélectionnées
        actionButtonPanel.add(openButton);    // Bouton pour ouvrir une tâche sélectionnée

        // Ajout des panneaux principaux à la fenêtre principale
        add(inputAndFilterPanel, BorderLayout.NORTH); // Ajout du panneau avec les boutons de création de tâche et de filtres en haut
        add(taskListPanel, BorderLayout.CENTER); // Ajout de la liste de tâches au centre
        add(actionButtonPanel, BorderLayout.SOUTH); // Ajout des boutons d'action en bas

        // Personnalisation du rendu des cellules dans la JList pour centrer le texte
        taskList.setCellRenderer(new TaskListCellRenderer());
    }

    // Classe interne pour le rendu personnalisé des tâches dans la JList
    private static class TaskListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Task) {
                Task task = (Task) value;
                setText("Name: " + task.getName() + ", Category: " + task.getCategory() + ", Priority: " + task.getPriority() + " Completed :" + task.getcompleted());
                setHorizontalAlignment(SwingConstants.CENTER);

                // Définir la couleur de fond en fonction de la priorité
                Color color = getColorForPriority(task.getPriority());
                setBackground(color);
            }
            return this;
        }

        // Méthode pour obtenir la couleur en fonction de la priorité
        private Color getColorForPriority(String priority) {
            if (priority.equals("High")) {
                return Color.RED; // Priorité élevée en rouge
            } else if (priority.equals("Medium")) {
                return Color.YELLOW; // Priorité moyenne en jaune
            } else if (priority.equals("Low")) {
                return Color.GREEN; // Priorité faible en vert
            } else {
                return Color.WHITE; // Par défaut, couleur blanche
            }
        }
    }
}

import javax.swing.*;

public class TaskManagerCategory extends JDialog {

    public TaskManagerCategory(JDialog parent, Task task, TaskManagerJson jsonHandler) {
        
        super(parent, "Category: " + task, true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(350, 200);
        ImageIcon icon = new ImageIcon("Images/Icone.jpg");
        setIconImage(icon.getImage());

    }
    
}
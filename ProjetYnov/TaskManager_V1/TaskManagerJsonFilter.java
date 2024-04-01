import javax.swing.*;
import org.json.*;
import java.io.*;

public class TaskManagerJsonFilter {

    private static final File jsonFile = new File("tasks.json");

    public static void loadTasksFilter(String selectedCategory, String selectedPriority, DefaultListModel<Task> taskListModel) {
        if (!TaskManagerJson.verifyJsonFile()) {
            System.err.println("JSON file does not exist!");
            return;
        }
    
        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
    
            JSONArray jsonArray = new JSONArray(jsonContent.toString());
    
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String taskCategory = jsonObject.getString("Category");
                String taskPriority = jsonObject.optString("Priority", "");
    
                boolean categoryMatch = selectedCategory.equals("All") || taskCategory.equals(selectedCategory);
                boolean priorityMatch = selectedPriority.isEmpty() || taskPriority.equals(selectedPriority);
    
                if (categoryMatch && priorityMatch) {
                    int ID = jsonObject.getInt("ID");
                    String name = jsonObject.getString("Name");
                    String description = jsonObject.getString("Description");
                    boolean completed = jsonObject.getBoolean("Completed");
                    String time = jsonObject.getString("Time");
                    String dates = jsonObject.getString("Dates");
    
                    Task task = new Task(ID, name, description, completed, taskPriority, taskCategory, dates, time);
                    task.setTime(time);
                    task.setDates(dates);
                    taskListModel.addElement(task);
                    System.out.println("Task loaded from JSON file: " + task + task.getCategory() + task.getPriority());
                }
            }
            System.out.println("Tasks loaded based on filter criteria successfully!");
    
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            System.err.println("Error loading tasks from JSON file!");
        }
    }
    
}

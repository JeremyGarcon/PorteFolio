
import javax.swing.*;
import org.json.*;
import java.io.*;

public class TaskManagerJson {

    // Déclaration du fichier JSON pour stocker les tâches sous forme de variables de classe
    private static final File jsonFile = new File("tasks.json");

    // Vérification de l'existence du fichier JSON
    public static boolean verifyJsonFile() {
        return jsonFile.exists();
    }

    // Création d'un fichier JSON vide
    public void createEmptyJsonFile() {
        if (!verifyJsonFile()) {
            try (FileWriter writer = new FileWriter(jsonFile)) {
                writer.write("[]"); // Écriture d'un tableau JSON vide
                System.out.println("Empty JSON file created successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("JSON file already exists!");
            System.out.println("Loading tasks from JSON file...");
        }
    }
    // Chargement des tâches depuis le fichier JSON
    public static void loadTasksFromFile(DefaultListModel<Task> taskListModel) {
        if (verifyJsonFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile))) {
                StringBuilder jsonContent = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    jsonContent.append(line);
                }
                JSONArray jsonArray = new JSONArray(jsonContent.toString());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    int ID = jsonObject.getInt("ID");
                    String name = jsonObject.getString("Name");
                    String description = jsonObject.getString("Description");
                    boolean completed = jsonObject.getBoolean("Completed");
                    String time = jsonObject.getString("Time");
                    String dates = jsonObject.getString("Dates");
                    String category = jsonObject.getString("Category");
                    String priority = jsonObject.getString("Priority");
    
                    Task task = new Task(ID, name, description, completed, priority, category, priority, priority);
                    task.setTime(time);
                    task.setDates(dates);
                    taskListModel.addElement(task);
    
                    System.out.println("Task loaded from JSON file: " + task);
                }
                System.out.println("Tasks loaded from JSON file successfully!");
            } catch (IOException | JSONException e) {
                e.printStackTrace();
                System.err.println("Error loading tasks from JSON file!");
            }
        } else {
            System.err.println("JSON file does not exist!");
        }
    }
    
    
    // Ajout d'une tâche
    public static void writeJsonFile(Task task) {
        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JSONArray jsonArray = new JSONArray(jsonContent.toString());
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ID", Task.taskid());
            jsonObject.put("Category", task.getCategory());
            jsonObject.put("Name", task.getName());
            jsonObject.put("Description", task.getDescription());
            jsonObject.put("Dates", task.getDates());
            jsonObject.put("Time", task.getTime());
            jsonObject.put("Completed", task.getcompletedstring());
            jsonObject.put("Priority", task.getPriority());
            jsonArray.put(jsonObject);
    
            try (FileWriter writer = new FileWriter(jsonFile)) {
                writer.write(jsonArray.toString(7));
                System.out.println("Task added to JSON file successfully!");
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error writing to JSON file!");
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            System.err.println("Error reading JSON file!");
        }
    }

    // Supprimer une tâche
    public void removeTask(int selectedIndex) {
        if (verifyJsonFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter("temp.json"))) {
                String line;
                int index = 0;
                while ((line = reader.readLine()) != null) {
                    if (index != selectedIndex) {
                        writer.write(line);
                        writer.write("\n");
                    }
                    index++;
                }
                System.out.println("Task removed from JSON file successfully!");
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error removing task from JSON file!");
            }

            if (jsonFile.delete()) {
                File tempFile = new File("temp.json");
                if (!tempFile.renameTo(jsonFile)) {
                    System.err.println("Error renaming the temporary file!");
                }
            } else {
                System.err.println("Error deleting the JSON file!");
            }
        } else {
            System.err.println("JSON file does not exist!");
        }
    }

    // Mettre à jour la description de la tâche
    public static void updateTaskDescription(String taskName, String newDescription) {
        if (verifyJsonFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter("temp.json"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    JSONObject jsonObject = new JSONObject(line);
                    String name = jsonObject.getString("name");
                    if (name.equals(taskName)) {
                        // Mettre à jour la description de la tâche
                        jsonObject.put("description", newDescription);
                    }
                    writer.write(jsonObject.toString());
                    writer.write("\n");
                }
                System.out.println("Task description updated successfully!");
            } catch (IOException | JSONException e) {
                e.printStackTrace();
                System.err.println("Error updating task description in JSON file!");
            }

            if (jsonFile.delete()) {
                File tempFile = new File("temp.json");
                if (!tempFile.renameTo(jsonFile)) {
                    System.err.println("Error renaming the temporary file!");
                }
            } else {
                System.err.println("Error deleting the JSON file!");
            }
        } else {
            System.err.println("JSON file does not exist!");
        }
    }
    
    // Mettre à jour le champ "completed" d'une tâche
    public static void updateTaskCompleted (String taskName, boolean b) {
        if (verifyJsonFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter("temp.json"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    JSONObject jsonObject = new JSONObject(line);
                    String name = jsonObject.getString("name");
                    if (name.equals(taskName)) {
                        // Mettre à jour le champ "completed" de la tâche
                        jsonObject.put("completed", b);
                    }
                    writer.write(jsonObject.toString());
                    writer.write("\n");
                }
                System.out.println("Task completion status updated successfully!");
            } catch (IOException | JSONException e) {
                e.printStackTrace();
                System.err.println("Error updating task completion status in JSON file!");
            }

            if (jsonFile.delete()) {
                File tempFile = new File("temp.json");
                if (!tempFile.renameTo(jsonFile)) {
                    System.err.println("Error renaming the temporary file!");
                }
            } else {
                System.err.println("Error deleting the JSON file!");
            }
        } else {
            System.err.println("JSON file does not exist!");
        }
    }

    public static String getTimeTask(String taskName) {
        if (verifyJsonFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    JSONObject jsonObject = new JSONObject(line);
                    String name = jsonObject.getString("name");
                    if (name.equals(taskName)) {
                        // Récupérer et retourner le temps de la tâche
                        return jsonObject.getString("Time");
                    }
                }
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("JSON file does not exist!");
        }
        // Retourner une chaîne vide si la tâche n'est pas trouvée ou s'il y a une erreur
        return "";
    }

    // Rafraîchir la liste des tâches dans l'interface graphique
    public static void refreshTaskList() {
        TaskManagerMain.listModel.clear();
        loadTasksFromFile(TaskManagerMain.listModel);
    }
    
}

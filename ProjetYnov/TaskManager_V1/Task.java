import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDate;

public class Task {
    private int ID;
    private String name;
    private String description;
    private boolean completed;
    private String time;
    private String dates;
    private String category;
    private String priority;
    private String DeadTime;

    public Task(int ID, String name, String description, boolean completed, String priority, String category, String time, String dates) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.time = obtenirHeureActuelle();
        this.dates = obtenirDateActuelle();
        this.category = category;
        this.priority = priority;
        this.DeadTime = null;
    }
    // Getters et setters pour DeadTime
    public String getDeadTime() {
        return DeadTime;
    }
    public void setDeadTime(String newDeadTime) {
        this.DeadTime = newDeadTime;
    }

    // Getters et setters pour name
    public String getName() {
        return name;
    }
    public void setName(String newname) {
        this.name = newname;
    }

    // Getters et setters pour description
    public String getDescription() {
        return description;
    }
    public void setDescription(String newdescription) {
        this.description = newdescription;
    }

    // Getter et setter pour completed
    public boolean getcompleted() {
        return completed;
    }
    public String getcompletedstring() {
        if (completed == true) {
            return "true";
        } else {
            return "false";
        }
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Getter et setter pour time
    public String getTime() {
        return time;
    }
    public void setTime(String newtime) {
        this.time = newtime;
    }
    
    // Getter et setter pour dates
    public String getDates() {
        return dates;
    }
    public void setDates(String newDates) {
        this.dates = newDates;
    }

    // Getter et setter pour category
    public String getCategory() {
        return category;
    }
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public String toString() { // Méthode toString() pour afficher les tasks, dans l'interface graphique
        return name;
    }
        // Getter et setter pour priority
        public String getPriority() {
            return priority;
        }
    
        public void setPriority(String newPriority) {
            this.priority = newPriority;
        }
    
    // Méthode statique pour obtenir l'heure actuelle
    public static String obtenirHeureActuelle() {
        // Obtient l'heure actuelle
        LocalTime heure = LocalTime.now();

        // Crée un formateur de date-heure pour formater l'heure
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Formate l'heure en utilisant le formateur
        String heureFormatee = heure.format(formatter);

        // Retourne l'heure formatée
        return heureFormatee;
    }

    // Méthode statique pour obtenir la date actuelle
    public static String obtenirDateActuelle() {
        // Obtient la date actuelle
        LocalDate date = LocalDate.now();

        // Crée un formateur de date pour formater la date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Formate la date en utilisant le formateur
        String dateFormatee = date.format(formatter);

        // Retourne la date formatée
        return dateFormatee;
    }
    /* 
    public static int taskid(int[] ID_Used) {
        Random random = new Random();
        int ID_ramdom = random.nextInt(100);
        
            boolean ID_Exist = false;
            for (int i = 0; i < ID_Used.length; i++) {
                if (ID_Used[i] == ID_ramdom) {
                    ID_Exist = true;
                    return ID_ramdom;
                }
            }
            if (ID_Exist == false) {
            } else {
                ID_ramdom = random.nextInt(100);
            }
        return ID_ramdom;

    }
    */
    public static int taskid() {
        Random random = new Random();
        int ID_ramdom = random.nextInt(100);
        return ID_ramdom;

    }

}

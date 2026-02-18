//The main program that runs all this
import java.util.ArrayList;
import java.util.List;

public class CampusLifeApp {
    public static void main(String[] args) {
        // 1. Creating course objects
        Course pl = new Course("Programming language", "Azhar Kazakbaeva", 6);
        Course math = new Course("Discrete Math", "Liliia Abdieva", 6);
        Course phil = new Course("Philosophy", "Cholpon Alieva", 3);

        // 2. Creating a list of the tasks anf filling it in
        List<AssignmentTask> tasks = new ArrayList<>();
        tasks.add(new AssignmentTask("GitHub Practice", pl, 3, 4));
        tasks.add(new AssignmentTask("Group Assigment", math, 5, 3));
        tasks.add(new AssignmentTask("Essay", phil, 2, 0));
        tasks.add(new AssignmentTask("Project", pl, 10, 18));

        // 3. Creating a list of training session
        List<StudySession> sessions = new ArrayList<>();
        sessions.add(new StudySession(pl, 90));
        sessions.add(new StudySession(math, 120));
        sessions.add(new StudySession(pl, 60));

        //Data output
        System.out.println("--- All Courses ---");
        System.out.println(pl);
        System.out.println(math);
        System.out.println(phil);

        System.out.println("\n--- All Assignments (Highlighting Urgent) ---");
        int totalRemainingHours = 0; //sum of hours
        for (AssignmentTask t : tasks) { //if true --> mark
            String urgentTag = t.isUrgent() ? " [URGENT!]" : "";
            System.out.println(t + urgentTag);

            //If the task is not completed add its hours to the total
            if (!t.isCompleted()) {
                totalRemainingHours += t.getEstimatedHours();
            }
        }

        System.out.println("\nTotal estimated hours remaining: " + totalRemainingHours);

        System.out.println("\n--- Study Time Per Course ---");
        //go through each course to calculate the time for it
        Course[] allCourses = {pl, math, phil};
        for (Course c : allCourses) {
            double totalHours = 0;
            for (StudySession s : sessions) {
                //if session is related --> add hours
                if (s.getCourse().getName().equals(c.getName())) {
                    totalHours += s.hours();
                }
            }
            System.out.println(c.getName() + ": " + totalHours + " hours");
        }

        // State Change
        System.out.println("\n--- Marking one assignment as completed ---");
        tasks.get(0).markCompleted(); // Take the first task from the list and change the status

        System.out.println("Updated task: " + tasks.get(0)); //printing the updated status

        // Counting the hours again
        int newRemainingHours = 0;
        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                newRemainingHours += t.getEstimatedHours();
            }
        }
        System.out.println("New remaining estimated hours: " + newRemainingHours);
    }
}
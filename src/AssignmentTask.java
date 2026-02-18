//The main logic of the task
public class AssignmentTask {
    private String title; //Name of the task
    private Course course; //Link to the Course object
    private int estimatedHours; //How many hours
    private int daysUntilDue;//How many days before the deadline
    private boolean completed; //completed (true) or not (false)

    //Constructor
    public AssignmentTask(String title, Course course, int estimatedHours, int daysUntilDue) {
        this.title = title;
        this.course = course;
        this.estimatedHours = estimatedHours;
        this.daysUntilDue = daysUntilDue;
        this.completed = false; // Initially, any task is considered unfulfilled
    }
//Method for "Completed"
    public void markCompleted() {
        this.completed = true;
    }
//Logiv of urgency check
    public boolean isUrgent() {
        // Returns true if the deadline is 2 days or less away and it hasn't been completed yet
        return daysUntilDue <= 2 && !completed;
    }

    public String getTitle() { return title; }
    public Course getCourse() { return course; }
    public int getEstimatedHours() { return estimatedHours; }
    public int getDaysUntilDue() { return daysUntilDue; }
    public boolean isCompleted() { return completed; }

    @Override
    public String toString() { //we take the course name from first class???
        return "AssignmentTask{title='" + title + "', course='" + course.getName() +
                "', estHours=" + estimatedHours + ", dueIn=" + daysUntilDue +
                ", completed=" + completed + "}";
    }
}
//Class to keep track of study time
public class StudySession {
    private Course course; //which course does the session belong to
    private int minutes; //how many minutes did you study

    public StudySession(Course course, int minutes) {
        this.course = course;
        this.minutes = minutes;
    }
//Method of converting minutes to hours
    public double hours() {
        return minutes / 60.0;
    }

    public Course getCourse() { return course; }
    public int getMinutes() { return minutes; }

    @Override
    public String toString() {
        return "StudySession{course='" + course.getName() + "', minutes=" + minutes + "}";
    }
}
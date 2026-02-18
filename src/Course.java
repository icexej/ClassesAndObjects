//this class for data storage
public class Course {
    //Fields:
    private String name; //name of course
    private String instructor; //name of instructor
    private int credits; //amount of credits

    public Course(String name, String instructor, int credits) {
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }
//methods for getting data (since the fields are private)
    public String getName() { return name; }
    public String getInstructor() { return instructor; }
    public int getCredits() { return credits; }

    @Override
    public String toString() {
        return "Course{name='" + name + "', instructor='" + instructor + "', credits=" + credits + "}";
    }
}
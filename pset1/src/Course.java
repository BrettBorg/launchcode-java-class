/**
 * Created by Brett on 5/4/2015.
 */
// Course Class
public class Course {
    private String name;
    private float credits;
    private int seats;
    private Student[] roster;

    // Course Constructor
    public Course(String name, float credits, int seats) {
        this.name = name;
        this.credits = credits;
        this.seats = seats;
        this.roster = new Student[seats];
    }


    // Getters and Setters - some of them are not really needed
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) { this.credits = credits; }

    public float getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) { this.seats = seats; }

    public Student[] getRoster() {
        return this.roster;
    }

    public void setRoster(Student[] roster) {
        this.roster = roster;
    }

    // toString method to return course name and credits for course
    public String toString() {
        return this.name + " " + this.credits;
    }

    // addStudent method - returns boolean - insure student does not already exist
    public boolean addStudent(Student a) {

       for (int i = 0; i  < seats; i++) {
           if (this.roster[i] != null) {
               if (a.getName().equals(this.roster[i].getName())) {
                   return false;
               }
           } else {
               this.roster[i] = a;
               seats = seats - 1;
               return true;
           }
       }
        return false;
    }

    // printRoster method - prints list of sutdents
    public void printRoster() {

        for (int i = 0; i  < seats; i++) {
            if (this.roster[i] != null) {
                System.out.println(this.roster[i].getName());
            }
        }
    }

    // averageGPA method - returns average GPA for all students in class
    public float averageGPA() {

        float totalGPA = 0;
        float studentTotal = 0;

        for (int i = 0; i  < seats; i++) {
            if (this.roster[i] != null) {
                totalGPA = totalGPA + (this.roster[i].getGPA());
                studentTotal = studentTotal + 1;
            }
        }
        return totalGPA / studentTotal;
    }

    // runs all methods and displays results
    public static void main(String args[]) {
        // Create a course and run toString method
        Course c = new Course("Java", 1, 20);
        System.out.println(c.toString());

        // add students to the course
        Student s = new Student("Pink Floyd", 1, 90, 4);
        System.out.println(c.addStudent(s));
        Student t = new Student("Black Sabbath", 1, 90, 3);
        System.out.println(c.addStudent(t));
        System.out.println(c.addStudent(s));

        // print the list of students
        c.printRoster();

        // compute the average GPA for all students
        System.out.println(c.averageGPA());

    }

}


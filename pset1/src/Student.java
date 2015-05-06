/**
 * Created by Brett on 4/30/2015.
 */
// Student class
public class Student {
    private String name;
    private int studentID;
    private float credits;
    private float gpa;

    // Student Constructor
    public Student(String name, int studentID, float credits, float gpa) {
        this.name = name;
        this.studentID = studentID;
        this.credits = credits;
        this.gpa = gpa;
    }

    // Getters and Setters - some of them are not really needed
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public int getstudentID() {
        return this.studentID;
    }

    public void setstudentID(int studentID) { this.studentID = studentID; }

    public float getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) { this.credits = credits; }

    public float getGPA() {
        return this.gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    // toString method - returns student name and ID
    public String toString() {
        return this.name + " " + this.studentID;
    }

    // getClassStanding method - returns students class based on credit hours
    public String getClassStanding() {
        String ClassStanding = "Freshman";

        if (credits > 29 && credits < 60) {
                ClassStanding = "Sophomore";
        } else {
              if (credits > 59 && credits < 90) {
                 ClassStanding = "Junior";
              } else {
                    if (credits > 89) {
                        ClassStanding = "Senior";
                    }
                }
          }
          return ClassStanding;
    }

    // submitGrade method - returns students new GPA
    public float submitGrade(float courseCredit, float grade) {

        return gpa = ((gpa * credits) + (courseCredit * grade)) / (credits + courseCredit);
    }

    // computeTuition method - returns total spent on classes
    public float computeTuition() {

        float cost = 20000;
        float hours = 15;
        return (cost / hours) * credits;
    }

    // createLegacy method - creates new student based on two existing students
    public Student createLegacy(Student t) {

        String name = this.getName() + " " + t.getName();

        int id =  (int)(Math.random() * 900000 + 100000);

        float gpa = (this.getGPA() + t.getGPA()) / 2;

        if (this.getCredits() > t.getCredits()) {
            credits = this.getCredits();
        } else{
            credits = t.getCredits();
          }

        Student u = new Student(name, id, credits, gpa);
        System.out.println(u.getCredits());

        return u;

    }

    public static void main(String args[]) {
        // create a Student and run toString method
        Student s = new Student("Pink Floyd", 1, 90, 4);
        System.out.println(s.toString());

        // assign a Class for a student
        System.out.println(s.getClassStanding());

        // assign a grade for the class the student took
        System.out.println(s.submitGrade(3, 4));

        // print the total cost of college for the student
        System.out.println("$" + String.format("%.2f", s.computeTuition()));

        // create a second student and then create new student based on two students
        // then print information for new student
        Student t = new Student("Black Sabbath", 2, 80, 3);
        Student ss = s.createLegacy(t);
        System.out.println(ss.getName());
        System.out.println(ss.getstudentID());
        System.out.println(ss.getCredits());
        System.out.println(ss.getGPA());

    }

}

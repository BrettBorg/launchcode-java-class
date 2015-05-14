import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * JUnit tests for Student and Course
 * @author dshook
 *
 */
public class StudentAndCourseTest extends TestCase {
	@Test
	public void testStudentInit() {
		Student s = new Student("Pink Floyd", 1, 3, 4);
		assertEquals("Pink", s.getName());
		assertEquals(1, s.getstudentID());
		//No credits, no GPA
		assertEquals(0.0, s.getGPA());
		assertEquals(0, s.getCredits());

        //Generate some random students, and test
		for (int i = 0; i < 20; ++i) {
			double a =  (Math.random() * 5000);
			int b =  (int)(Math.random() * 5000);
			int c = (int)(Math.random() * 5000);
			Student s3 = new Student("" + a, b, c, 4);
			assertEquals(a + " " + b, s3.getName());
			assertEquals(0.0, s3.getGPA());
			assertEquals(0, s3.getCredits());
		}
	}

	public static void main(String args[]) {
		//create a course and student
		Course c = new Course("Java", 1, 20);
		Student s = new Student("Pink Floyd", 1, 29, 4);

		// test addStudent method
		System.out.println(c.addStudent(s));

		// test the toString method for a student
		System.out.println(s.toString());

		// create more students
		Student t = new Student("Ted Nugent", 1, 30, 4);
		Student u = new Student("Led Zeppelin", 1, 60, 4);
		Student v = new Student("Aerosmith Rush", 1, 90, 4);
		System.out.println(c.addStudent(t));
		System.out.println(c.addStudent(u));
		System.out.println(c.addStudent(v));

		// test getClassStanding method for all different classes
		System.out.println(s.getClassStanding());
		System.out.println(t.getClassStanding());
		System.out.println(u.getClassStanding());
		System.out.println(v.getClassStanding());

		// add another student and test the submitGrade method
		Student w = new Student("Van Halen", 1, 90, 4);
		System.out.println(c.addStudent(w));
		System.out.println(w.submitGrade(3, 3));

		// add another student and test the computeTuition method
		Student x = new Student("Blue Oyster", 1, 90, 4);
		System.out.println(c.addStudent(x));
		System.out.println("$" + String.format("%.2f", x.computeTuition()));

		// add two students and test createLegacy method
		// print info for new student
		Student y = new Student("Supertramp Queen", 1, 90, 4);
		System.out.println(c.addStudent(y));
		Student z = new Student("Black Sabbath", 2, 80, 3);
		System.out.println(c.addStudent(z));
		Student ss = y.createLegacy(z);
		System.out.println(ss.getName());
		System.out.println(ss.getstudentID());
		System.out.println(ss.getCredits());
		System.out.println(ss.getGPA());

		// test the toString method for the course
		System.out.println(c.toString());

		// get the seats, add a student, and get the seats again
		System.out.println(c.getSeats());
		Student a = new Student("Lynyrd Skynyrd", 1, 90, 4);
		System.out.println(c.addStudent(a));
		System.out.println(c.getSeats());

		// add a student twice - should return true and then false
		Student b = new Student("Wishbone Ash", 1, 90, 3);
		System.out.println(c.addStudent(b));
		System.out.println(c.addStudent(b));

		// print the list of students
		c.printRoster();

		// compute the average GPA for all students
		System.out.println(c.averageGPA());

		// test the exception
		Student e = new Student("Nitty Gritty", 1, 0, 4);
		System.out.println(c.addStudent(e));
		System.out.println(e.getClassStanding());

	}

    //More tests should go here

}



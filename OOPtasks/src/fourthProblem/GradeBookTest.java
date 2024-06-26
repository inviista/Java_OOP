package fourthProblem;

import practive2.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Course{
	private String name;
	private String description;
	private int credits;
	private String prerequisite;
	
	public Course(String name, String description, int credits,String prerequisite) {
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.prerequisite = prerequisite;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getCredits() {
		return credits;
	}
	public String getPrerequisite() {
		return prerequisite;
	}
}
class GradeBook{
	private Course course;
	private List<Student> students;
	private Map<Integer,Integer> gradeDistribution;
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
		this.gradeDistribution = new HashMap<>();
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void inputGrades() {
		Scanner input = new Scanner(System.in);
		for (Student student:students) {
			System.out.print("Enter grade for " + student.getName()+ ": ");
			int grade = input.nextInt();
			student.setGrade(grade);
			
			gradeDistribution.put(grade / 10 * 10, gradeDistribution.getOrDefault(grade / 10 * 10, 0) + 1);
			
		}
	}
	public void Message() {
		System.out.println("Welcome to the grade book for " + course.getName());
        System.out.println("Instructor: " + course.getDescription());
        System.out.println();
	}
	public void displayGradeReport() {
        System.out.println("Please, input grades for students:\n");

        inputGrades();

        double totalGrade = 0;
        int lowestGrade = Integer.MAX_VALUE;
        int highestGrade = Integer.MIN_VALUE;
        int lowestStudentId = -1;
        int highestStudentId = -1;

        for (Student student : students) {
            totalGrade += student.getGrade();
            int grade = student.getGrade();
            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestStudentId = student.getId();
            }
            if (grade > highestGrade) {
                highestGrade = grade;
                highestStudentId = student.getId();
            }
        }

        double classAverage = totalGrade / students.size();

        System.out.println("\nClass average is " + String.format("%.2f", classAverage));
        System.out.println("Lowest grade is " + lowestGrade + " (Student " + (char) ('A' + lowestStudentId) + ", id: " + lowestStudentId + ")");
        System.out.println("Highest grade is " + highestGrade + " (Student " + (char) ('A' + highestStudentId) + ", id: " + highestStudentId + ")");
        System.out.println("\nGrades distribution:");

        for (int i = 0; i < 100; i += 10) {
            int count = gradeDistribution.getOrDefault(i, 0);
            System.out.print(i + "-" + (i + 9) + ": ");
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 Object-oriented Programming", "Introduction to OOP", 3, "None");

        GradeBook gradeBook = new GradeBook(course);

        for (int i = 0; i < 10; i++) {
            Student student = new Student("Student " + (char) ('A' + i), i);
            gradeBook.addStudent(student);
        }
        gradeBook.Message();
        gradeBook.displayGradeReport();
    }
}





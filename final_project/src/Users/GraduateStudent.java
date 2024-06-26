package Users;

import Items.Course;
import Items.DiplomaProject;
import Items.ResearchPaper;

import java.util.Vector;

public class GraduateStudent extends Student {
    private String researchTopic;
    private Vector<ResearchPaper> researchPapers;
    private Course graduateCourse;
    private DiplomaProject diplomaProject;
    private Teacher tutorTeacher;

    // Constructor for GraduateStudent
    public GraduateStudent(String name, String lastname, String id, String password, Faculties faculty, int yearOFStudy, Boolean grant) {
        super(name, lastname, id, password, faculty,yearOFStudy,grant);
        this.researchPapers = new Vector<>();
    }

    // Method to enroll in a graduate course
    public void enrollInGraduateCourse(Course course) {
        graduateCourse = course;
        //System.out.println("Graduate student enrolled in the course: " + course.getCourseName());
    }

    // Method to propose a research topic
    public void proposeResearchTopic(String newResearchTopic) {
        researchTopic = newResearchTopic;
        System.out.println("Graduate student proposed a new research topic: " + newResearchTopic);
    }

    // Method to initiate a diploma project
    public void initiateDiplomaProject() {
        //diplomaProject = new Project("Diploma Project");
        System.out.println("Graduate student initiated a diploma project.");
    }

    // Method to request a teacher to become a tutor
    public void requestTutorTeacher(Teacher teacher) {
        System.out.println("Graduate student " + getName() + " requested " + teacher.getName() + " to be the tutor.");

        // Assume the teacher processes the request asynchronously
        //teacher.getTutorRequests().add(this);
        System.out.println("Teacher " + teacher.getName() + " received a tutor request from " + getName());
        System.out.println("Teacher " + teacher.getName() + " will process the request.");
    }

    // Additional methods for GraduateStudent if needed

    // Override toString method for better representation
    @Override
    public String toString() {
        return "GraduateStudent{" +
                "researchTopic='" + researchTopic + '\'' +
                ", researchPapers=" + researchPapers +
                ", graduateCourse=" + graduateCourse +
                ", diplomaProject=" + diplomaProject +
                ", tutorTeacher=" + (tutorTeacher != null ? tutorTeacher.getName() : "None") +
                ", GPA=" + getGPA() +
                '}';
    }
}
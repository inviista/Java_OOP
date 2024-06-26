package Users;
import Items.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import java.util.HashMap;

import java.util.Vector;

/**
 * Student class
 */
public class Student extends User {

    /**
     * Student`s year of study
     */
    private int yearOFStudy;

    /**
     * Student`s transcript
     */
    private Transcript transcript;

    /**
     * Student`s faculty
     */
    private Faculties faculty;

    /**
     * Student`s vector of subjects
     */
    public Vector<Subject> subjects;

    /**
     * Student`s admission date
     */
    private Date dateOfJoin;

    /**
     * Flag showing if student has grant
     */
    private Boolean grant;

    /**
     * Empty student constructor
     */
    public Student(){super();}

    /**
     * Student constructor
     */
    public Student(String name, String lastname, String id, String password, Faculties faculty, int yearOFStudy, Boolean grant) {
        super(id, name, lastname, password);
        this.faculty = faculty;
        this.yearOFStudy = yearOFStudy;
        this.grant = grant;
        this.subjects = new Vector<>();
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculties faculty) {
        this.faculty = faculty;
    }

    public Vector<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Vector<Subject> courses) {
        this.subjects = courses;
    }

    public int getYearOFStudy() {
        return yearOFStudy;
    }

    public void setYearOFStudy(int yearOFStudy) {
        this.yearOFStudy = yearOFStudy;
    }

    public Boolean getGrant() {
        return grant;
    }

    public void setGrant(Boolean grant) {

        this.grant = grant;

    }

    /**
     * Method showing student`s GPA
     */
    public String getGPA() {
        return this.transcript.showGPA();
    }

    /**
     * Method calculating student`s GPA
     */
    public double getDoubleGPA() {
        return this.transcript.showDoubleGPA();
    }

    /**
     * Student`s comparator by GPA
     */
    public int compareTo(Student otherStudent) {

        if (this.getDoubleGPA() > otherStudent.getDoubleGPA()) {

            return 1;

        } else if (this.getDoubleGPA() < otherStudent.getDoubleGPA()) {

            return -1;

        } else {

            return 0;

        }

    }

    /**
     * Method showing student`s information
     */
    public String viewPrivateInformation() {

        return "Name: " + this.getName() + " " + this.getSurname()

                + "\nID: " + this.getId() + "\nFaculty: " + this.faculty + "\nGPA: " + this.getGPA();

    }

    /**
     * Method returning student`s transcript
     */
    public String getTranscript() {

        return this.transcript.toString();

    }

    /**
     * Method to register for subject
     */
    public void registerForSubject() {
        String cipher;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter subject cipher: ");
            cipher = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Subject subject = Store.getSubjectByCipher(cipher);
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            assert subject != null;
            System.out.println("Student registered for the subject: " + subject.getSubjectName());

        } else {

            assert subject != null;
            System.out.println("Student is already registered for the subject: " + subject.getSubjectName());

        }

    }

    /**
     * Method showing student`s transcript
     */
    public void viewTranscript()
    {
        System.out.println(transcript.toString());
    }

    /**
     * Method for rating teachers
     */
    public String rateTeacher() {
        String teacherId, rate;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter teacher`s id: ");
            teacherId = reader.readLine();

            System.out.print("Enter teacher`s points: ");
            rate = reader.readLine();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Teacher teacher = (Teacher) Store.getUserById(teacherId);
        int ratingValue = Integer.parseInt(rate);
        if (ratingValue < 1 || ratingValue > 5) {
            return "Invalid rating value. Rating should be between 1 and 5.";
        } else {

            assert teacher != null;
            teacher.updateRating(ratingValue);

            return "Teacher " + teacher.getName() + " rated with " + ratingValue + " stars.";
        }
    }
}
package Users;


import Items.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
* Teacher class
*/
public class Teacher extends Employee {
    
    /**
    * Vector of all teacher`s subjects
    */
    public Vector<Subject> subjects;
    
    /**
    * Teacher`s faculty(school)
    */
    private Faculties faculty;
    
    /**
    * Teacher`s timetable
    */
    private Timetable timetable;
    
    /**
    * Flag, showing if teacher is researcher
    */
    private Boolean isResearcher;

    /**
     * Teacher`s rating
     */
    private double rating;

    /**
     * Sum of teacher`s points
     */
    private double sumOfPoints;

    /**
     * Number of teacher`s rates
     */
    private double numRates;

    /**
    * Method returning vector of teacher`s subject
    */
    public Vector<Subject> getSubjects() {
        return this.subjects;
    }

    /**
     * Empty teacher class constructor
     */
    public Teacher(){}

    /**
     * Teacher class constructor
     */
    public Teacher(Faculties faculty, Timetable timetable, boolean isResearcher){
        this.faculty = faculty;
        this.timetable = timetable;
        this.isResearcher = isResearcher;
        this.sumOfPoints = 0;
        this.numRates = 0;
        this.subjects = new Vector<>();
    }

    /**
    * Method setting vector of subjects to teacher
    */
    public void setSubjects(Vector<Subject> subjects) {
        this.subjects = subjects;
    }
    
    /**
    * Method returning teacher`s faculty
    */
    private Faculties getFaculty() {
        return this.faculty;
    }
    
    /**
    * Method setting teacher`s faculty
    */
    private void setFaculty(Faculties faculty) {
        this.faculty = faculty;
    }
    
    /**
    * Method returning teacher`s timetable
    */
    public Timetable getTimetable() {
        return this.timetable;
    }
    
    /**
    * Method setting timetable to teacher
    */
    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }
    
    /**
    * Method showing if teacher researcher or not
    */
    public Boolean getIsResearcher() {
        return this.isResearcher;
    }
    
    /**
    * Method to mark teacher as researcher(or not a researcher)
    */
    public void setIsResearcher(Boolean isResearcher) {
        this.isResearcher = isResearcher;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }

    /**
    * Method sending complaint to dean
    */
    public void sendComplaint() {
        String studentId, deanId;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter student`s id: ");
            studentId = reader.readLine();
            System.out.print("Enter dean`s id: ");
            deanId = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        User student = Store.getUserById(studentId);
        User dean = Store.getUserById(deanId);
        if (student instanceof Student && dean instanceof Dean) {
            String text, lev;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
            {
                System.out.print("Enter text of the complaint: ");
                text = reader.readLine();
                System.out.print("Enter urgency level(l - low, m - medium, h - high): ");
                lev = reader.readLine();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            UrgencyLevel level = null;
            if (lev.charAt(0) == 'l'){level = UrgencyLevel.LOW;}
            else if (lev.charAt(0) == 'm'){level = UrgencyLevel.MEDIUM;}
            else if (lev.charAt(0) == 'h'){level = UrgencyLevel.HIGH;}
            else {System.out.println("Incorrect input.");}
            if (level != null) {
                ((Dean) dean).complaints.add(new Complaint(text, (Student) student, level));
                Store.logFiles.add("Complaint against " + studentId + " was sent to dean " + deanId + ".\n");
            }
        }
    }

    /**
     * Method showing teacher`s subjects
     */
    public void viewSubjects(){}

    /**
     * Method managing subjects
     */
    public void manageSubjects(){}

    /**
     * Method showing students` information
     */
    public void viewStudentsInfo(){}

    /**
     * Method putting marks
     */
    public void putMarks(){}

    /**
     * Method updating teacher`s rating
     */
    public void updateRating(int rating){
        sumOfPoints += rating;
        numRates ++;
        this.rating = sumOfPoints / numRates;
    }



    

    
    
}

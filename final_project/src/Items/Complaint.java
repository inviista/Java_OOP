package Items;

import Users.Student;
import Users.Teacher;

public class Complaint {
    
    private UrgencyLevel level;
    private String reasonOfComplaint;
	public Student student;

    public Complaint() {}
    
    public Complaint(String reasonOfComplaint, Student student, UrgencyLevel level) {
		this.level = level;
		this.reasonOfComplaint = reasonOfComplaint;
	}

	/**
	 * @generated
	 */
	public UrgencyLevel getLevel() {
        return this.level;
    }
    
	/**
	 * @generated
	 */
    public void setLevel(UrgencyLevel level) {
        this.level = level;
    }
    
    /**
     * @generated
     */
    public String getReasonOfComplaint() {
        return this.reasonOfComplaint;
    }
    
    /**
     * @generated
     */
    public void setReasonOfComplaint(String reasonOfComplaint) {
        this.reasonOfComplaint = reasonOfComplaint;
    }
    
    /**
     * @generated
     */
	public Student getStudent() {
		return student;
	}

	/**
	 * @generated
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
    
}

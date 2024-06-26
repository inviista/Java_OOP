package Items;

import java.util.Vector;

import Users.Student;

public class Organization {

	private String organizationName;
    private Student president;
    private Vector<Student> stuff;
    private String sphereOfActivity;
    private Student student;
    
    public Organization() {}
    
    public Organization(String organizationName, Student president, Vector<Student> stuff, String sphereOfActivity, Student student) {
    	this.organizationName = organizationName;
    	this.sphereOfActivity = sphereOfActivity;
    	this.president = president;
    	this.stuff = stuff;
    	this.student = student;
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

	/**
	    * @generated
	    */
	public String getOrganizationName() {
        return this.organizationName;
    }
    
	/**
	    * @generated
	    */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    /**
     * @generated
     */
    public Student getPresident() {
        return this.president;
    }
    
    /**
     * @generated
     */
    public void setPresident(Student president) {
        this.president = president;
    }
    
    /**
     * @generated
     */
    public Vector<Student> getStuff() {
        return this.stuff;
    }
    
    /**
     * @generated
     */
    public void setStuff(Vector<Student> stuff) {
        this.stuff = stuff;
    }
    
    /**
     * @generated
     */
    public String getSphereOfActivity() {
        return this.sphereOfActivity;
    }
    
    /**
     * @generated
     */
    public void setSphereOfActivity(String sphereOfActivity) {
        this.sphereOfActivity = sphereOfActivity;
    }
    
}

package Items;

import java.util.Vector;

import Users.Teacher;

public class Course {
    private String cipher;
    public Vector<Subject> Major;
    public Vector<Subject> minor;
    public Vector<Subject> freeElective;

    public Course() {}
    
    public Course(String cipher,Vector<Subject> Major, Vector<Subject> minor, Vector<Subject> freeElective, Teacher teacher) {
    	this.cipher = cipher;
        this.freeElective = freeElective;
    	this.Major = Major;
    	this.minor = Major;
    }

    /**
     * @generated
     */
    public String getCipher() {
        return cipher;
    }
    /**
     * @generated
     */
    public void setCipher(String cipher) {
        this.cipher = cipher;
    }
	/**
	    * @generated
	    */
	public Vector<Subject> getMajor() {
        return Major;
    }

	/**
	    * @generated
	    */
    public void setMajor(Vector<Subject> Major) {
        this.Major = Major;
    }
        
    /**
     * @generated
     */
    public Vector<Subject> getMinor() {
        return this.minor;
    }
    
    /**
     * @generated
     */
    public void setMinor(Vector<Subject> minor) {
        this.minor = minor;
    }
    
    
    /**
     * @generated
     */
    public Vector<Subject> getFreeElective() {
        return this.freeElective;
    }
    
    /**
     * @generated
     */
    public void setFreeElective(Vector<Subject> freeElective) {
        this.freeElective = freeElective;
    }
}

package Items;

public class Subject {
    
    private String subjectName;
    private Integer credit;
    private String cipher;
    
    public Subject() {}
    
    public Subject(String subjectName, Integer credit, String cipher) {
    	this.subjectName = subjectName;
    	this.credit = credit;
    	this.cipher = cipher;
    }

	/**
	    * @generated
	    */
	public String getSubjectName() {
        return this.subjectName;
    }
    
	/**
	    * @generated
	    */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    
    /**
     * @generated
     */
    public Integer getCredit() {
        return this.credit;
    }
    
    /**
     * @generated
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }
    
    /**
     * @generated
     */
    public String getCipher() {
        return this.cipher;
    }
    
    /**
     * @generated
     */
    public void setCipher(String cipher) {
        this.cipher = cipher;
    }
    
    public String toString() {
        return "| Cipher: " + getCipher() + " | subject: " + getSubjectName() + " | credit: " + getCredit() + " | ";
      }
}

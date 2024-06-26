package Items;

import java.util.Vector;

import Users.GraduateStudent;

public class DiplomaProject {
    
    private String theme;
    private Vector<ResearchPaper> papers;
    private GraduateStudent author;

    public DiplomaProject() {}
    
    public DiplomaProject(String theme, Vector<ResearchPaper> papers, GraduateStudent author) {
    	this.author = author;
    	this.papers = papers;
    	this.theme = theme;
    }
    
    /**
     * @generated
     */
    public String getTheme() {
        return this.theme;
    }
    
    /**
     * @generated
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @generated
     */
    public Vector<ResearchPaper> getPapers() {
        return this.papers;
    }
    
    /**
     * @generated
     */
    public void setPapers(Vector<ResearchPaper> papers) {
        this.papers = papers;
    }

    /**
     * @generated
     */
	public GraduateStudent getAuthor() {
		return author;
	}

	/**
	    * @generated
	    */
	public void setAuthor(GraduateStudent author) {
		this.author = author;
	}
    
}

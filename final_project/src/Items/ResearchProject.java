package Items;

import java.util.Vector;

public class ResearchProject {

	
	private String topic;
    private String publishedPapers;
    private Vector<ResearchPaper> papers;
    private ResearchPaper researchPaper;
    
    public ResearchProject( ) {}

    public ResearchProject(String topic, String publishedPapers, Vector<ResearchPaper> papers, ResearchPaper researchPaper) {
    	this.papers = papers;
    	this.publishedPapers = publishedPapers;
    	this.topic = topic;
    	this.researchPaper = researchPaper;
    }
    
    /**
     * @generated
     */
    public ResearchPaper getResearchPaper() {
		return researchPaper;
	}
    
    /**
     * @generated
     */
	public void setResearchPaper(ResearchPaper researchPaper) {
		this.researchPaper = researchPaper;
	}

	/**
	    * @generated
	    */
	public String getTopic() {
        return this.topic;
    }
    
	/**
	    * @generated
	    */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    /**
     * @generated
     */
    public String getPublishedPapers() {
        return this.publishedPapers;
    }
    
    /**
     * @generated
     */
    public void setPublishedPapers(String publishedPapers) {
        this.publishedPapers = publishedPapers;
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
    

    //                          Operations                                  

    /**
     * @generated
     */
    public String Exception() {
        return "Sorry, wrong project participant.";
    }
    
    
}

package Items;

import Users.Researcher;

import java.text.Format;
import java.util.Date;

public class ResearchPaper{
    
    private Integer citations;
    private String name;
    private Researcher authors;
    private Journal journal;
    private String pages;
    private Date date;
    
    public ResearchPaper() {}
    
    public ResearchPaper(Integer citations, String name, Researcher authors, Journal journal, String pages, Date date, ResearchProject researchProject) {
    	this.citations = citations;
    	this.name = name;
    	this.authors = authors;
    	this.journal = journal;
    	this.pages = pages;
    	this.date = date;
    }
    
    /**
     * @generated
     */
    public Integer getCitations() {
        return this.citations;
    }
    
    /**
     * @generated
     */
    public Integer setCitations(Integer citations) {
        this.citations = citations;
    }
    
    /**
     * @generated
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * @generated
     */
    public String setName(String name) {
        this.name = name;
    }
    
    
    /**
     * @generated
     */
    //!!!!!!!!!!!!!!!!!!!!1
    public Researcher getAuthors() {
        return this.authors;
    }
    
    /**
     * @generated
     */
    //!!!!!!!!!!!!!!!!!!
    public Researcher setAuthors(Researcher authors) {
        this.authors = authors;
    }
    
    /**
     * @generated
     */
    public Journal getJournal() {
        return this.journal;
    }
    
    /**
     * @generated
     */
    public Journal setJournal(Journal journal) {
        this.journal = journal;
    }
    
    /**
     * @generated
     */
    public String getPages() {
        return this.pages;
    }
    
    /**
     * @generated
     */
    public String setPages(String pages) {
        this.pages = pages;
    }
    
    /**
     * @generated
     */
    public Date getDate() {
        return this.date;
    }
    
    /**
     * @generated
     */
    public Date setDate(Date date) {
        this.date = date;
    }
    

    //                          Operations                                  

    /**
     * @generated
     */
    public String getCitation(Format F) {
        //TODO
        return "";
    }
}

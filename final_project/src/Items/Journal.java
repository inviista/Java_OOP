package Items;

import Users.JournalSubscriber;

import java.util.Vector;

public class Journal implements JournalSubscriber {
    
    private Vector<News> newNews;
    private Integer followers;
    private Vector<ResearchPaper> researchs;
    
    public Journal () {}
    
    public Journal (Vector<News> newNews, Integer followers, Vector<ResearchPaper> researchs) {
    	this.followers = followers;
    	this.newNews = newNews;
    	this.researchs = researchs;
    }

    /**
     * @generated
     */
    public Vector<News> getNewNews() {
        return this.newNews;
    }
    
    /**
     * @generated
     */
    public void setNewNews(Vector<News> newNews) {
        this.newNews = newNews;
    }
    
    /**
     * @generated
     */
    public Integer getFollowers() {
        return this.followers;
    }
    
    /**
     * @generated
     */
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }
    
    /**
     * @generated
     */
    public Vector<ResearchPaper> getResearchs() {
        return this.researchs;
    }
    
    /**
     * @generated
     */
    public void setResearchs(Vector<ResearchPaper> researchs) {
        this.researchs = researchs;
    }

    @Override
    public void subscribeToJournal(Journal journal) {

    }
}

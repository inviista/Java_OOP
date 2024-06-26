package Items;


import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class News {
    
	private int newsId;
    private String description;
    private String title;
    private String topCitedResearcher;
    private Topics topic;
    private Vector<ResearchPaper> researchPapers;
    Date date;
    Date lastUpdated;
    
    static ArrayList<News> allNews = new ArrayList<News>();
    
    public News() {}
    
    public News(int id, String description, String title) {
    	this.description = description;
    	this.title = title;
        this.newsId = id;
    }
    
    public News(int id,String description, String title, Topics topic, String topCitedResearcher, Vector<ResearchPaper> researchPapers, int newsId) {
    	this(id,description, title);
    	this.newsId = (int) Math.random();
    	this.topCitedResearcher = topCitedResearcher;
    	this.topic = topic;
    	this.researchPapers = researchPapers;
    }
    
    public int getNewsId() {
        return this.newsId;
    }
    
    public void setTitle(String title) {
        this.title = title;
        this.lastUpdated = new Date();
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setDesciption(String description) {
        this.description = description;
        this.lastUpdated = new Date();
    }
    
    /**
     * @generated
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * @generated
     */
    public String getTopCitedResearcher() {
        return this.topCitedResearcher;
    }
    
    /**
     * @generated
     */
    public void setTopCitedResearcher(String topCitedResearcher) {
        this.topCitedResearcher = topCitedResearcher;
    }
    
    /**
     * @generated
     */
    public Topics getTopic() {
        return this.topic;
    }
    
    /**
     * @generated
     */
    public void setTopic(Topics topic) {
        this.topic = topic;
    }
    
    /**
     * @generated
     */
    public Vector<ResearchPaper> getResearchPapers() {
        return this.researchPapers;
    }
    
    /**
     * @generated
     */
    public void setResearchPapers(Vector<ResearchPaper> researchPapers) {
        this.researchPapers = researchPapers;
    }
    
    /**
     * Add new news.
     */
    public void addNews(int id,String title, String description) {
        News news = new News(id, title, description);
        allNews.add(news);
    }
    
    /**
     * Remove news.
     */
    public void removeNews(int NewsId) {
        for(int i = 0; i < allNews.size(); i++) {
            News currNew = allNews.get(i);
            if (newsId == currNew.newsId) {
                allNews.remove(i);
            }
        }
    }
    
    /**
     * Get news by new's ID.
     */
    public News getById(int id) {
        for(int i = 0; i < allNews.size(); i++) {
            News currNew = allNews.get(i);
            if (id == currNew.newsId) {
                return currNew;
            }
        }
		return null;
    }
}

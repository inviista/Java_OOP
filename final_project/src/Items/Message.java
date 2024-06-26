package Items;

import Users.User;

public class Message {
    
    private String workMessages;
    private String report;
    private User sender;
    private User receiver;
    

	public Message() {}
    public Message(String WorkMessages, String report, User receiver)
    {
        this.workMessages = WorkMessages;
        this.report = report;
        this.receiver = receiver;
    }
    
    public Message(String workMessages, String report, User sender, User receiver) {
    	this.receiver = receiver;
    	this.workMessages = workMessages;
    	this.report = report;
    	this.sender = sender;
    }
    
    /**
     * Method returning recipient of the message
     */
    public User getReceiver() {
		return receiver;
	}

    /**
     * Method returning sender of the message
     */
	public User getSender() {
		return sender;
	}

	/**
	    * Method returning workMessages of the message
	    */
	public String getWorkMessages() {
        return this.workMessages;
    }
    
	/**
	    * Method setting workMessages of the message
	    */
    public void setWorkMessages(String workMessages) {
        this.workMessages = workMessages;
    }
    
    /**
     * Method returning report of the message
     */
    public String getReport() {
        return this.report;
    }
    
    /**
     * Method setting report of the message
     */
    public void setReport(String report) {
        this.report = report;
    }
    
}

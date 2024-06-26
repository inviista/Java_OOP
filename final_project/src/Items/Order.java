package Items;

import Users.TechSupportSpecialist;
import Users.User;

public class Order {
    
    private String supportRequest;
    private String header;
    private String body;
    public User sender;
    
    public Order() {}
    
    public Order(String supportRequest, String header, String body, User user) {
    	this.body = body;
    	this.header = header;
    	this.supportRequest = supportRequest;
        this.sender = user;
    }
    
    /**
     * @generated
     */
    public String getSupportRequest() {
        return this.supportRequest;
    }
    
    /**
     * @generated
     */
    public void setSupportRequest(String supportRequest) {
        this.supportRequest = supportRequest;
    }
    
    /**
     * @generated
     */
    public String getHeader() {
        return this.header;
    }
    
    /**
     * @generated
     */
    public void setHeader(String header) {
        this.header = header;
    }
    
    /**
     * @generated
     */
    public String getBody() {
        return this.body;
    }
    
    /**
     * @generated
     */
    public void setBody(String body) {
        this.body = body;
    }


}

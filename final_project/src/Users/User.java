package Users;
import Items.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Vector;

public class User implements JournalSubscriber{
    private String id;
    private String name;
    private String surname;
    private String password;
    private Vector<Message> messages;
    public User(){}
    public User(String id, String name, String surname, String password)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.messages = new Vector<>();
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String Surname) {
        this.surname = Surname;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    


    public void sendMessage(User user)
    {
        String workMessages, report, id;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter message workMessage: ");
            workMessages = reader.readLine();

            System.out.print("Enter message report: ");
            report = reader.readLine();

            System.out.print("Enter recipient`s id: ");
            id = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        User target  = Store.getUserById(id);
        Message message = new Message(workMessages, report, target);
        user.messages.add(message);
    }

    public void createOrder()
    {
        String body, header, supportRequest;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter order`s header: ");
            header = reader.readLine();

            System.out.print("Enter order`s body: ");
            body = reader.readLine();

            System.out.print("Enter order`s support request: ");
            supportRequest = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Order order = new Order(supportRequest, header, body, this);
        Store.newOrders.add(order);
    }

    @Override
    public void subscribeToJournal(Journal journal) {

    }
}

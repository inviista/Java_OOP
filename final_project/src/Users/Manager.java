package Users;
import Items.News;
import Items.Subject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Manager class
*/
public class Manager extends Employee{
    
    /**
    * Department where manager works
    */
    private Department department;
    
    public Manager(){}
    public Manager(Department department)
    {
        this.department = department;
    }
    /**
    * Method returning department where the manager works
    */
    public Department getDepartment() {
        return this.department;
    }
    
    /**
    * Method setting department where manager works
    */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Method approving student`s registration for subject
     */
    public void approveRegistration(){
        //student sends request, subject description is showing, manager can approve or reject it
    }

    /**
     * Method showing information about user
     */
    public void viewUserInfo(){
        String id;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter user id: ");
            id = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user = Store.getUserById(id);
        assert user != null;
        System.out.print(user);

    }

    /**
     * Method managing news
     */
    public void addSubjects(){
        String name, numberOfCredits, cipher;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter subject name: ");
            name = reader.readLine();
            System.out.print("Enter number of subject credits: ");
            numberOfCredits = reader.readLine();
            System.out.print("Enter subject cipher: ");
            cipher = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Store.subjects.add(new Subject(name, Integer.parseInt(numberOfCredits), cipher));
        Store.logFiles.add("Subject " + cipher + " was added.\n");
    }

    /**
     * Method adding subject to system
     */
    public void addNewsletter(){
        String id, title, description;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter newsletter id: ");
            id = reader.readLine();
            System.out.print("Enter newsletter title: ");
            title = reader.readLine();
            System.out.print("Enter newsletter description: ");
            description = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Store.news.add(new News(Integer.parseInt(id), title, description));
        Store.logFiles.add("Newsletter " + id + " was added.\n");
    }

    /**
     * Method creating reports
     */
    public void createReports(){
        System.out.print("Found:\n" + Store.users.size() + " users;\n" + Store.subjects.size() + " subjects.\n");
    }

    /**
     * Method assigning subject to teacher
     */
    public void assignSubjectToTeacher(){
        String cipher, id;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter teacher`s id: ");
            id = reader.readLine();
            System.out.print("Enter subject cipher: ");
            cipher = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Subject subject = Store.getSubjectByCipher(cipher);
        User user = Store.getUserById(id);
        if (user instanceof Teacher) {
            ((Teacher) user).subjects.add(subject);
            Store.logFiles.add("Subject " + cipher + " was added to " + user + ".\n");
        }
        else
        {
            System.out.print(user + "is not a teacher.");
        }
    }
}


package Users;

import Items.Course;
import Items.Subject;

import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Admin class
*/
public class Admin extends Employee {

    /**
     * Empty admin constructor
     */
    public Admin(){}

    /**
     * Admin constructor by hire date
     */
    public Admin(Date hireDate)
    {
        super(hireDate);
    }


    /**
     * Method to administrate course
     */
    public void administrateCourse()
    {
        String idx1, idx2, courseCipher, subjectCipher;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter cipher of the course you want to administrate");
            courseCipher = reader.readLine();

            System.out.print("Enter cipher of the subject you want to add/remove");
            subjectCipher = reader.readLine();

            System.out.print("Enter 1 to add subject, 2 to remove subject");
            idx1 = reader.readLine();

            System.out.print("Enter M to administrate majors, m to administrate minors, f to administrate free electives");
            idx2 = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Course course = Store.getCourseByCipher(courseCipher);
        Subject subject = Store.getSubjectByCipher(subjectCipher);
        if (Integer.parseInt(idx1) == 1)
        {
            if (idx2.charAt(0) == 'M')
            {
                assert course != null;
                course.Major.add(subject);
            }
            else if (idx2.charAt(0) == 'm')
            {
                assert course != null;
                course.minor.add(subject);
            }
            if (idx2.charAt(0) == 'f')
            {
                assert course != null;
                course.freeElective.add(subject);
            }
        }
        else if (Integer.parseInt(idx1) == 2)
        {
            if (idx2.charAt(0) == 'M')
            {
                assert course != null;
                course.Major.remove(subject);
            }
            else if (idx2.charAt(0) == 'm')
            {
                assert course != null;
                course.minor.remove(subject);
            }
            if (idx2.charAt(0) == 'f')
            {
                assert course != null;
                course.freeElective.remove(subject);
            }
        }

        assert course != null;
        Store.logFiles.add("Subject " + course.getCipher() + " was updated.\n");
    }
    /**
     * Method to administrate subjects
     * (1 - change subject name,
     * 2 - change number of credits
     * 3 - change cipher)
     */
    public void administrateSubject()
    {
        String input, cipher, idx;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter subject cipher: ");
            cipher = reader.readLine();

            System.out.print("Enter 1 to change name of the subject, 2 to change number of credits, 3 to change cipher: ");
            idx = reader.readLine();

            System.out.print("Enter subject data: ");
            input = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Subject subject = Store.getSubjectByCipher(cipher);
    if (idx.charAt(0) == '1')
        {
            assert subject != null;
            subject.setSubjectName(input);
        }
    else if (idx.charAt(0) == '2')
    {
        assert subject != null;
        subject.setCredit(Integer.parseInt(input));
    }
    else if (idx.charAt(0) == '3')
    {
        assert subject != null;
        subject.setCipher(input);
    }
        assert subject != null;
        Store.logFiles.add("Subject " + subject.getCipher() + " was updated.\n");
    }

    /**
     * Method adding user to the system
     */
    public void addUser()
    {
        String id, name, surname;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter new user id: ");
            id = reader.readLine();
            System.out.print("Enter new user name: ");
            name = reader.readLine();
            System.out.print("Enter new user surname: ");
            surname = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    Store.users.add(new User(id, name, surname, "00000000"));
        Store.logFiles.add("User " + id + " was added.\n");
    }

    /**
     * Method updating user
     */
    public void updateUser()
    {
        String input, id, idx;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("Enter user id: ");
            id = reader.readLine();

            System.out.print("Enter 1 to change user`s name, 2 to change user`s surname, 3 to change user`s password: ");
            idx = reader.readLine();

            System.out.print("Enter user data: ");
            input = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user = Store.getUserById(id);
        if (idx.charAt(0) == '1')
        {
            assert user != null;
            user.setName(input);
        }
        else if (idx.charAt(0) == '2')
        {
            assert user != null;
            user.setSurname(input);
        }
        else if (idx.charAt(0) == '3')
        {
            assert user != null;
            user.setPassword(input);
        }
        assert user != null;
        Store.logFiles.add("User " + user.getId() + " was updated.\n");
    }

    /**
     * Method removing user from the system
     */
    public void removeUser(User user)
    {
    Store.users.remove(user);
    Store.logFiles.add("User " + user.getId() + " was removed.\n");
    }

    /**
     * Method showing log files
     */
    public void seeLogFiles()
    {
    System.out.print(Store.logFiles);
    }
}

package Users;

import Items.Course;
import Items.News;
import Items.Order;
import Items.Subject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Queue;
import java.util.Vector;

public class Store implements Serializable {
    static Vector<Course> courses;
    static Vector<User> users;
    static Vector<Subject> subjects;
    static Vector<String> logFiles;
    static Vector<Order> newOrders;
    static Queue<Order> acceptedOrders;
    static Vector<Order> rejectedOrders;
    static Vector<News> news;
    public Store() {
        users = new Vector<>();
    subjects = new Vector<>();
    logFiles = new Vector<>();
    newOrders = new Vector<>();
    rejectedOrders = new Vector<>();
    courses = new Vector<>();
    news = new Vector<>();}

    static User getUserById(String id)
    {
        for (User user: users)
        {
            if (user.getId().equals(id))
            {
                return user;
            }
        }
        System.out.print("User not found");
        return null;
    }

    static int getIdxOfOrder()
    {
        String input;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            input = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Integer.parseInt(input);
    }
    static Course getCourseByCipher(String id)
    {
        for (Course course: courses)
        {
            if (course.getCipher().equals(id))
            {
                return course;
            }
        }
        System.out.print("Course not found");
        return null;
    }

    public static Subject getSubjectByCipher(String subjectCipher) {
        for (Subject subject: subjects)
        {
            if (subject.getCipher().equals(subjectCipher))
            {
                return subject;
            }
        }
        System.out.print("Subject not found");
        return null;
    }
}

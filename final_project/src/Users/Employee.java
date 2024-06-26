package Users;


import Items.Course;
import Items.Subject;
import Users.User;

import java.util.Date;

/**
* Employee class
*/
public class Employee extends User {
    
    /**
    * Hire date field
    */
    private Date hireDate;

    public Employee(){}
    public Employee(Date hireDate) {
        this.hireDate = hireDate;
    }


    /**
    * Method returning hire date
    */
    private Date getHireDate() {
        return this.hireDate;
    }
    
    /**
    * Method setting hire date
    */
    private void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    
}

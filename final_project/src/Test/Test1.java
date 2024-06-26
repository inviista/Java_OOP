package Test;
import Users.Store;
import Users.Admin;

import java.util.Date;

public class Test1 {
    public static void main(String[] args)
    {
        Admin adm = new Admin(new Date(11,1,1999));
        adm.seeLogFiles();
    }
}

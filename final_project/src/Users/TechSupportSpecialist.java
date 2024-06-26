package Users;

import Items.Order;

import java.util.Vector;

/**
* Tech Support Specialist class
*/
public class TechSupportSpecialist extends Employee {
    
    
    /**
    * Method showing one of new orders by index
    */
    public void showNewOrder()
    {
        int idx = Store.getIdxOfOrder();
        System.out.print(Store.newOrders.get(idx));
    }
    /**
     * Method accepting order sending message to user, who created order
     */
    public void acceptOrder()
    {
        int idx = Store.getIdxOfOrder();
        User sender = Store.newOrders.get(idx).sender;
        System.out.println("Order was accepted");
        Store.acceptedOrders.add(Store.newOrders.get(idx));
        sendMessage(Store.newOrders.get(idx).sender);
        Store.newOrders.remove(idx);
    }

    /**
     * Method rejecting order sending message with the reason to user, who created order
     */
    public void rejectOrder()
    {
        int idx = Store.getIdxOfOrder();
        System.out.println("Order was rejected");
        Store.rejectedOrders.add(Store.newOrders.get(idx));
        sendMessage(Store.newOrders.get(idx).sender);
        Store.newOrders.remove(idx);
    }
}

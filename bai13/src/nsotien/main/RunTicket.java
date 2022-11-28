package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 2:04 PM
Date : 10/29/22
*/

import nsotien.model.Ticket;

public class RunTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        t1.start();
        t2.start();
    }
}

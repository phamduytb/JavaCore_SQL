package nsotien.model;/*
java by nsotien tv .......
Name : nsotien
Time : 2:04 PM
Date : 10/29/22
*/

public class Ticket implements Runnable {
    private int ticket = 1;

    @Override
    public void run() {
        buyTicket();
    }

    public synchronized void buyTicket() {
        try {
            ticket--;
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            if (ticket > 0) {
                System.out.println("con ve");
            } else
                System.out.println("het ve");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

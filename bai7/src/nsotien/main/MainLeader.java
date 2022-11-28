package nsotien.main;

import nsotien.model.cau2.Developer;
import nsotien.model.cau2.Leader;

import java.util.Scanner;

public class MainLeader {
    public static void main(String[] args) {

        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();
        Leader[] l = new Leader[n];

        for (int i = 0; i < l.length; i++) {
            l[i] = new Leader();
            System.out.println("...");
            l[i].input();
        }

        for (Leader x : l) {
            if (x.getTeamSize() > 10) {
                System.out.println("info teamsize > 10 :");
                x.output();
                x.bonus();
            }

        }

    }
}

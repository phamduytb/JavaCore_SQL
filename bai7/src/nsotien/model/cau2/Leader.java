package nsotien.model.cau2;

import java.util.Scanner;

public class Leader extends Staff {
    private int teamSize;
    final long luongCoBan = 10_000_000;

    @Override
    public void input() {
        super.input();
        System.out.println("teamSize : ");
        teamSize = new Scanner(System.in).nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("teamsize : " + teamSize);
    }

    public void bonus() {
        if (teamSize > 10) {
            System.out.println("bonus =" + luongCoBan * 0.5);
        } else
            System.out.println("bonus =" + luongCoBan * 0.1);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}

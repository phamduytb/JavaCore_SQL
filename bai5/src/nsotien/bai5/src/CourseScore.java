package nsotien.bai5.src;

import java.util.Scanner;

public class CourseScore {
    private static int id;
    private String name;
    private static int score;

    public void input() {
        Scanner nst1 = new Scanner(System.in);
        System.out.println("id = ");
        id = nst1.nextInt();

        Scanner nst2 = new Scanner(System.in);
        System.out.println("name = ");
        name = nst2.nextLine();

        Scanner nst3 = new Scanner(System.in);
        System.out.println("score = ");
        score = nst3.nextInt();
    }

    public void output() {
        System.out.println("information");
        System.out.println(id);
        System.out.println(name);
        System.out.println(score);
        if (score < 5) {
            System.out.println("yeu");
        } else if (score >= 5 && score < 7) {
            System.out.println("TB");
        } else if (score >= 7 && score < 8) {
            System.out.println("kha");
        } else if (score >= 8 && score < 9) {
        } else if (score >= 9) {
            System.out.println("xuat sac");
        } else
            System.out.println("null");
    }

    public CourseScore() {
    }

    public CourseScore(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

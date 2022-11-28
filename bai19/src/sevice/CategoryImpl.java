package sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 18:16
Date : 21/11/2022
*/

import entity.Category;

import java.util.Scanner;

public class CategoryImpl implements CategoryInterface {
    @Override
    public void input(Category category) {
        System.out.println("id category : ");
        category.setId(new Scanner(System.in).nextInt());
        System.out.println("name category : ");
        category.setName(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(Category category) {
        System.out.println("id category = " + category.getId());
        System.out.println("name category = " + category.getName());
    }
}

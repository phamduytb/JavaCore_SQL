package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 20:10
Date : 24/11/2022
*/

import nsotien.entity.Dictionary;

import java.util.Scanner;

public class DictionaryImpl implements DictionaryInterface {
    @Override
    public void input(Dictionary dictionary) {
        System.out.println("keyword : ");
        dictionary.setKeyword(new Scanner(System.in).nextLine());
        System.out.println("description : ");
        dictionary.setDescription(new Scanner(System.in).nextLine());
        System.out.println("word_type : ");
        dictionary.setKeyword(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(Dictionary dictionary) {
        System.out.println("keyword = " + dictionary.getKeyword());
        System.out.println("description = " + dictionary.getDescription());
        System.out.println("word_type = " + dictionary.getWord_type());
    }
}

package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 20:08
Date : 24/11/2022
*/

import nsotien.entity.Dictionary;
import nsotien.entity.Person;
import nsotien.sevice.MapImpl;
import nsotien.sevice.SetImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainDictionary {
    public static void main(String[] args) {
        MapImpl mapimpl = new MapImpl();
        Map<String, Dictionary> dictionaryMap = mapimpl.input(); // add thông tin dictionary vào MAP
        while (true) {
            System.out.println("menu ....");
            System.out.println("1. info dictionary ");
            System.out.println("2. filter dictionary has (keyword) :");
            System.out.println("3. delete dictionary has (keyword) :");
            System.out.println("4. out ");
            int luaChon = new Scanner(System.in).nextInt();
            if (luaChon == 1) {
                mapimpl.output(dictionaryMap);
                System.err.println("infor sucessed");
            } else if (luaChon == 2) {
                mapimpl.filter(dictionaryMap);
                System.err.println("filter name has (keyword) sucessed");
            } else if (luaChon == 3) {
                mapimpl.delete(dictionaryMap);
                System.err.println("delete name has (keyword) sucessed");
            } else if (luaChon == 4) {
                break;
            }
        }
    }
}

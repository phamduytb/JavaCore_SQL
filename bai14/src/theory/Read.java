package theory;/*
java by nsotien tv .......
Name : nsotien
Time : 12:24
Date : 28/11/2022
*/

import entity.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Read {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

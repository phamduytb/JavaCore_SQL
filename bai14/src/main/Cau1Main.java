package main;/*
java by nsotien tv .......
Name : nsotien
Time : 12:40
Date : 28/11/2022
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Cau1Main {
    public void write() {
        String cau1 = "Hello Trung Tâm Java - File";
        try {
            FileWriter fileWriter = new FileWriter("cau1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(cau1);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeAppend() {
        String cau1 = ". I am here ";
        try {
            FileWriter fileWriter = new FileWriter("cau1.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(cau1);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void read() {
        try {
            FileReader fileReader = new FileReader("cau1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            line = bufferedReader.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Cau1Main cau1Main = new Cau1Main();
        cau1Main.write();
        cau1Main.read();

        cau1Main.writeAppend();
        cau1Main.read();
    }
}

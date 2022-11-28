package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 20:51
Date : 24/11/2022
*/

public class MainString {
    public static void main(String[] args) {

        // tốc độ xử lí nhanh nhất là : StringBuilder -> StringBuffer -> string
        // string không thay đổi và không có class con
        // StringBuffer, StringBuilder có thể thay đổi

        String s1 = "Hello Trung Tâm Java . ";
        String s2 = "I am Java . ";
        String s3 = "I am joining JavaCore19 .";
        String s01 = s1 + s2 + s3;
        System.out.println(s01);

        // StringBuffer -> dùng cho đa luồng,chậm hơn
        String s02 =(new StringBuilder("Hello Trung Tâm Java . ")).append("I am Java . ").append("I am joining JavaCore19 .").toString();
        System.out.println(s02);

        // StringBuilder -> dùng cho đơn luồng,nhanh hơn
        String s03 =(new StringBuilder("Hello Trung Tâm Java . ")).append("I am Java . ").append("I am joining JavaCore19 .").toString();
        System.out.println(s03);


    }
}

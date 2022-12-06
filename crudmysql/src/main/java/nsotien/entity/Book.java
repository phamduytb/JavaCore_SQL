package nsotien.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 14:03
Date : 26/11/2022
*/

import lombok.Data;

import javax.persistence.*;

@Entity // map bảng với SQL
@Table(name = "bookspring") // tạo bảng sql
@Data  // lấy constructor ,set,get
public class Book {

    @Id // khoá chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tự get id
    private int id;
    private String title;
    // @Column(name = "price_book")  //  thêm cột là price_book và thuộc tính theo price dưới
    private double price;
    private String color;
}

package nsotien.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 15:54
Date : 26/11/2022
*/

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "studentspring")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String address;
    private String name_school;

}

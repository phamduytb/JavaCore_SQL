package nsotien.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 15:15
Date : 26/11/2022
*/

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "animalspring")
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double weight;
    private String color;
    private int age;
}

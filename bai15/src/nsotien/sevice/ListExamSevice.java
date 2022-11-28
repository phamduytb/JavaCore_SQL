package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 3:02 PM
Date : 10/29/22
*/

import nsotien.model.Person;

import java.util.List;

public interface ListExamSevice {
    List<Person> input();

    List<Person> output();

    List<Person> filter();

    List<Person> delete();

    List<Person> sortPerson();

}

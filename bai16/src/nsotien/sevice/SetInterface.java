package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 19:23
Date : 24/11/2022
*/

import nsotien.entity.Person;

import java.util.Set;

public interface SetInterface {
    Set<Person> input();

    void output(Set<Person> personSet);

    void filter(Set<Person> personSet);

    void delete(Set<Person> personSet);


}

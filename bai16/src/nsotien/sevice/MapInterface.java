package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 20:13
Date : 24/11/2022
*/

import nsotien.entity.Dictionary;


import java.util.Map;


public interface MapInterface {

    Map<String , Dictionary> input();

    void output(Map<String , Dictionary> dictionaryMap);

    void filter(Map<String , Dictionary> dictionaryMap);

    void delete(Map<String , Dictionary> dictionaryMap);
}

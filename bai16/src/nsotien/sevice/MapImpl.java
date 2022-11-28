package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 20:17
Date : 24/11/2022
*/

import nsotien.entity.Dictionary;
import nsotien.entity.Person;

import javax.swing.*;
import java.util.*;

public class MapImpl implements MapInterface {
    DictionaryImpl dictionaryimpl = new DictionaryImpl();
    @Override
    public Map<String, Dictionary> input() {
        Map<String, Dictionary> dictionaryMap = new HashMap<>();
        while (true) {
            Dictionary dictionary = new Dictionary();
            System.out.println("input dictionary : ");
            dictionaryimpl.input(dictionary); // nhập thông tin dictionary
            dictionaryMap.put(dictionary.getKeyword(), dictionary); // add thông tin dictionary dựa theo từ khoá keyword nhập vào
            System.out.println("1. continue");
            System.out.println("2. out");
            int luaChon = new Scanner(System.in).nextInt();
            if (luaChon == 2) { // dùng để hỏi người dùng có add tiếp person vào MAP ko
                break;
            }
        }

        return dictionaryMap;
    }

    @Override
    public void output(Map<String, Dictionary> dictionaryMap) {
        for (Map.Entry<String, Dictionary> entry : dictionaryMap.entrySet())  // dùng entry để gọi thông tin dictionary đối với MAP
            dictionaryimpl.output(entry.getValue());
    }

    @Override
    public void filter(Map<String, Dictionary> dictionaryMap) {
        String keyword = new Scanner(System.in).nextLine();
        Dictionary dictionaryFilter = dictionaryMap.get(keyword);
        if (dictionaryFilter != null) {
            output(dictionaryMap);
        } else
            System.out.println("ko tim thay");
    }

    @Override
    public void delete(Map<String, Dictionary> dictionaryMap) {
        String keyword = new Scanner(System.in).nextLine();
        Dictionary dictionaryFilter = dictionaryMap.remove(keyword);
        System.out.println("infor dictionary :");
        output(dictionaryMap);
    }
}

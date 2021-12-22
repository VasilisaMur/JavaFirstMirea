package ru.mirea.task27;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>> map = new HashMap<>();
        ArrayList <String> list = new ArrayList<>();
        list.add("Москва");
        list.add("Пенза");
        list.add("Пермь");
        map.put("Россия", list);
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Париж");
        list1.add("Марсель");
        list1.add("Ницца");
        map.put("Франция", list1);
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Берлин");
        list2.add("Гамбург");
        list2.add("Мюнхен");
        map.put("Германия", list2);
        System.out.println(map);
    }
}
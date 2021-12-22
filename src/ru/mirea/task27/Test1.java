package ru.mirea.task27;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("Беляева", "Ульяна");
        map.put("Богатырева", "Анна");
        map.put("Гегия", "Давит");
        map.put("Говорова", "Софья");
        map.put("Гусев", "Владислав");
        map.put("Зубов", "Николай");
        map.put("Иванова", "Таисия");
        map.put("Киреев", "Артем");
        map.put("Козлов", "Александр");
        map.put("Кудрявцев", "Валерий");
        System.out.println(map);
        Map <String, String> newMap = new HashMap<>();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = (String) iterator.next();
            String value = map.get(key);
            if (!newMap.containsValue(value))
                newMap.put(key, value);
        }
        System.out.println(newMap);
    }
}

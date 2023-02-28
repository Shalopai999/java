package org.example.seminar5.hw1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> mapCh = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        str = str.toLowerCase();
        str = str.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            mapCh.putIfAbsent(words[i], 0);
            mapCh.put(words[i], mapCh.get(words[i]) + 1);
            System.out.println(words[i]);
        }
        for (var entry:mapCh.entrySet()) {
            System.out.println("Слово "+"'"+entry.getKey()+"'" + " встретилось: " + entry.getValue() + " раз(а)");
        }
    }
}

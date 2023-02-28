package org.example.seminar5.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        Map<String, Integer> mapCh = new HashMap<>();
        String str = "Россия идет это вперед всей планеты. Планета — это не Россия.";
        str = str.toLowerCase();
        n = n.toLowerCase();
        str = str.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (n.contains(words[i])) {
                mapCh.putIfAbsent(words[i], 0);
                mapCh.put(words[i], mapCh.get(words[i]) + 1);
            }
        }
        for (var entry : mapCh.entrySet()) {
            System.out.println("Слово " + "'" + entry.getKey() + "'" + " встретилось: " + entry.getValue() + " раз(а)");
            }
    }
}

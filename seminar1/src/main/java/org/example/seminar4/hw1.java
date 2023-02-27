package org.example.seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        scanner.close();
        System.out.println(linkedList);
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        while (!linkedList.isEmpty()) {
            linkedList2.add(linkedList.pollLast());
        }
        System.out.println(linkedList2);
    }
}

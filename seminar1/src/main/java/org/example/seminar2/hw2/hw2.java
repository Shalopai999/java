package org.example.seminar2.hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        boolean sum = true;
        for (int i = 0; i < n - 1; i++) {
            int num2 = scanner.nextInt();
            if (num2 < num1) {
                sum = false;}
            num1 = num2;
        }
        scanner.close();
        if (sum == true){
        System.out.println("Является возрастающей");}
        else {System.out.println("Не вляется возрастающей");}
    }

}

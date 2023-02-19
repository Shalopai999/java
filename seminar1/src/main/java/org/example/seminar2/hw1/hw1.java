package org.example.seminar2.hw1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int num2 = scanner.nextInt();
            for (int j = 1; j < num1 + 1; j++) {
                if (num1 % j == 0) {
                    count++;
                                    }
            }
            if (count == 2) {
                sum += num1;
                            }

            count = 0;
            num1 = num2;
            for (int j = 1; j < num1 + 1; j++) {
                if (num1 % j == 0) {
                    count++;
                                    }
            }
            if (count == 2) {
                sum += num1;
                            }

        }
        scanner.close();
        System.out.println("sum = " + sum);
    }
}

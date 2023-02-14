package org.example.seminar1.hw1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int sum = 0;
        while (n1 != 0){
            int n2 = scanner.nextInt();
            if (n1 > 0 && n2 < 0)
                sum += n1;
                n1 = n2;
        }
        System.out.println(sum);

    }
}

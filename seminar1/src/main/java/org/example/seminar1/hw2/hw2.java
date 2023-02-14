package org.example.seminar1.hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "the sky is blue";
        String[] strArray = str1.split(" ");
        for (int i = strArray.length; i > 0; i--){
            System.out.print(strArray[i-1] + ' ');

        }

    }

}

package org.example.seminar2.hw3;

public class hw3 {
    public static void main(String[] args) {

        int sum = 0;
        Integer[] myArray = {1, 2, -3, 25, 7, 5, 31, -9, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 9) {
                sum += i;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = sum;
            }
            System.out.println(myArray[i]);
        }
    }
}
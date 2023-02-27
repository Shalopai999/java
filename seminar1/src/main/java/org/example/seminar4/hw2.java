package org.example.seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class hw2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("(", ")", "[", "]", "{", "}"));
        LinkedList<String> linkedList2 = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == "(" || linkedList.get(i) == "{" || linkedList.get(i) == "["){
                linkedList2.push(linkedList.get(i));
            }
            else {
                if (linkedList2.peek() == "(" && linkedList.get(i) == ")") linkedList2.pop();
                else if (linkedList2.peek() == "[" && linkedList.get(i) == "]") linkedList2.pop();
                else if (linkedList2.peek() == "{" && linkedList.get(i) == "}") linkedList2.pop();
            }
        }
        System.out.println(linkedList2.isEmpty());

    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(5);
        numbers.add(30);

        Collections.sort(numbers);
        System.out.println(numbers);
        // write your code here
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(5);
        numbers.add(30);

        numbers.sort(Integer::compareTo);
        System.out.println(numbers);
        // write your code here

        //Bilal cosa que provoca conflicto
    }
}

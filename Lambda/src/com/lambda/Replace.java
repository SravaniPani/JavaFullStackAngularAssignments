package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
 */

public class Replace {
    public static void main(String[] args) {
        List<java.lang.String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Replace assignment4Q6 = new  Replace();
        System.out.println(assignment4Q6.convertToUpperCase(list));

    }
    public List<String> convertToUpperCase(List<java.lang.String> list) {
        List<String> ToUpper = new ArrayList<>();
        Consumer<String> consumer = (str)->ToUpper.add(str.toUpperCase());

        list.stream()
                .forEach(consumer);

        return  ToUpper;
    }
}

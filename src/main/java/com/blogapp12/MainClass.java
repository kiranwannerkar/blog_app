package com.blogapp12;

import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        Predicate<Integer> result = n->n%2==0;
        boolean val = result.test(33);
        System.out.println(val);
    }
}

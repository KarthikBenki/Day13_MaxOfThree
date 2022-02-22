package com.blz.demo;

public class Main {

    public static void main(String[] args) {
        Integer x = 10, y = 20, z = 30;
        String a = "apple", b = "ball", c = "cat";
        Float f = 1.23f, g = 2.21f, h = 1.1f;

        MaximumTest.testMaximum(a, b, c);
        new MaximumTest<Integer>(x, y, z).maximum();
        new MaximumTest<Float>(f, g, h).maximum();
        new MaximumTest<String>(a, b, c).maximum();

    }
}

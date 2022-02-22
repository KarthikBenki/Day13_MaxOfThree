package com.blz.demo;

public class MaximumTest<T extends Comparable<T>> {
    T x, y, z;

    public MaximumTest(T x, T y, T z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;

        printMax(x, y, z, max);

        return max;

    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(x, y, z, max);
        return max;
    }

    public T maximum() {
        return MaximumTest.maximum(x, y, z);
    }


}

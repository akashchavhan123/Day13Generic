package com.day13generic;

public class GenericClass {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String args[]) {
        System.out.printf("Maximum number among all is : %d", maximum(3, 6, 8));
        System.out.printf("\n\nMaximum number among all is : %.1f\n\n", maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum string among all string is %s\n", maximum("apple", "peach", "orange"));
    }
}

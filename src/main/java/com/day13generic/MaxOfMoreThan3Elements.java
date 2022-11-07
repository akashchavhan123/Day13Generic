package com.day13generic;

public class MaxOfMoreThan3Elements {
    public static <T extends Comparable<T>> T max(@SuppressWarnings("unchecked") T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Integer value is : " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3)));
        System.out.println("Maximum Float value is : " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6)));
        System.out.println("Maximum String value is : " + max("Strawberry", "Mango", "Apple", "Pomegranate"));
    }
}

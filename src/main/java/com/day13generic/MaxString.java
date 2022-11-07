package com.day13generic;

public class MaxString {
    public static String maximumString(String x, String y, String z) {
        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {

        System.out.println("Maximum number among 3 is = " + maximumString("apple", "peach","banana"));
    }
}

package com.day13generic;

public class MaxInteger {
    public static int maxOfInt(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum number among 3 is = " + maxOfInt(6, 4, 5));
        System.out.println("Maximum number among 3 is = " + maxOfInt(3, 8, 2));
        System.out.println("Maximum number among 3 is = " + maxOfInt(3, 4, 9));
    }
}

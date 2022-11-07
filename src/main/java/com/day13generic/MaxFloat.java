package com.day13generic;

public class MaxFloat {
    public static double maxOfFloat(double x, double y, double z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum number among 3 is = " + maxOfFloat(6.9, 4.8, 5.9));
        System.out.println("Maximum number among 3 is = " + maxOfFloat(3.2, 8.5, 2.8));
        System.out.println("Maximum number among 3 is = " + maxOfFloat(3.9, 4.8, 9.9));
    }
}

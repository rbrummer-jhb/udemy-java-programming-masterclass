package com.njrbjava;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greaterNumber = Math.max(first, second);

        for (int i = greaterNumber; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }
}

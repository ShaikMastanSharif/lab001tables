package day23;

import java.util.Scanner;

public class maxNumber {
public static int maxNumber(int a,int b,int c) {
    int max = 0;
    while (a > 0 || b > 0 || c > 0) {
        a--;
        b--;
        c--;
        max++;

    }

    return max;
}
    public static int minNumber(int a,int b,int c) {
        int min = 0;
        while (a > 0 && b > 0 && c > 0) {
            a--;
            b--;
            c--;
            min++;

        }

        return min;
    }
    public static void main(String[] args) {

        System.out.println(maxNumber(5,4,10));
        System.out.println(minNumber(-10,20,30));

    }
}

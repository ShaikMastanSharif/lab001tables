package day18;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int f=0;
        int s=1;
        int t;
        System.out.println(f+" "+s);
        for(int i=3;i<=num;i++){
            t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }

    }
}

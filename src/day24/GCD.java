package day24;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b=sc.nextInt();
       /* int g=0;
       for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                g=i;*/

        while(a%b!=0){
            int r=a%b;
            a=b;
            b=r;
            }
        System.out.println(b);
        }

    }


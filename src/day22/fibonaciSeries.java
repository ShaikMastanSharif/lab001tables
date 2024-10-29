package day22;

import java.util.Scanner;

public class fibonaciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        int x=1,y=0,z=0;

        for(int i=0;i<=num;i++){
            z=x+y;
           x=y;
           y=z;
            System.out.print(z+" ");

        }

    }
}

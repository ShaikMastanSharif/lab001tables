package day22;

import java.util.Scanner;

public class fibonaiseries {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int num=sc.nextInt();
       int x=1,y=0,z=0;
       for(int i=1;i<=num;i++){
           System.out.print(z);
           z=x+y;
           x=y;
           y=z;
       }

    }
}

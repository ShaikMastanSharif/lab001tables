package day22;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int original=num;
        int rev=0;

        while(num>0){
         int dg=num%10;
        rev= dg+rev*10;
         num=num/10;

        }




        if(original==rev)
            System.out.println("it is a palidrome number");
        else
            System.out.println("it is not a palidrome number");

    }
}

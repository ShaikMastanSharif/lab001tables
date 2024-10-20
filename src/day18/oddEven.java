package day18;

import java.util.Scanner;

public class oddEven {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int sum=sc.nextInt();

        if(sum%2==0){
            System.out.println("it is a even");

        }else {
            System.out.println("it is a odd number");
        }

sc.close();
    }
}






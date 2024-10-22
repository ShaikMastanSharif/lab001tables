package day22;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int orginal=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(orginal==rev){
            System.out.println("is is reverse");
        }else {
            System.out.println("it is not equal");
        }
    }
}

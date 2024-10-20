package day18;

import java.util.Scanner;

public class factorial {

    public static void pfactorial(int n){
        if(n<0){
            System.out.println("invalid");
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
          factorial=factorial*i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
       pfactorial(val);

    }
}

package day22;

import java.util.Scanner;

public class foctorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;


        }
        System.out.println(f);
    }
}

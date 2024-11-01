package day22;

import java.util.Scanner;

public class reverseaaray {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
       int userinput=sc.nextInt();

       int num[]=new int[userinput];
        System.out.println("enter the array values");

        for(int i=0;i<userinput;i++){
            System.out.println("enter the element"+(i+1));
            num[i]=sc.nextInt();
        }
        for(int i=userinput-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }



    }
}




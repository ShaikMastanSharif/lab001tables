package day22;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  int num = sc.nextInt();

        for(int i=2;i<=num;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }*/
        /*int num=sc.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }

        }

        if(count==2)
            System.out.println("is a prime");
        else
            System.out.println("is not a prime");*/


            String str= sc.nextLine();
            char[] c=str.toCharArray();
            String str1="";
      for(int i=c.length-1;i>=0;i--){
          str1+=c[i];


        }
        System.out.println(str);
        System.out.println(str1);



        }

}

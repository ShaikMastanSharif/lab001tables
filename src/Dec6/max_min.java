package Dec6;

import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter the array values");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
           int max=arr[0];
           int min=arr[0];
           for(int i=0;i<arr.length;i++){
               if(arr[i]>max){
                   max=arr[i];

               } else if (arr[i]<min) {
                   min=arr[i];
               }
           }
        System.out.println(max);
        System.out.println(min);


      }


    }


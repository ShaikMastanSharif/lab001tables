package day22;

import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        int [] arr={1,5,8,7,6,4,6};
        int max=arr[0];
       for(int num:arr){
           if(max>num){
               max=num;

           }
       }
        System.out.println(arr[1]);





    }


}

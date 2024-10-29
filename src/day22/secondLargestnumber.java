package day22;

import java.util.Arrays;

public class secondLargestnumber {

    public static void main(String[] args) {
        int [] arr ={100,25,45,87,69,34};
    int temp=0;
    for(int i=0;i<=arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
    }
        System.out.println(arr[1]);
    }
}

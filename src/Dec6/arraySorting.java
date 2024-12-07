package Dec6;

import java.util.Arrays;
import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array size");
        int input=sc.nextInt();

        int arr[]= new int[input];

        System.out.println("enter the arrrays values");
        for(int i=0;i<input;i++){
           arr[i]= sc.nextInt();
        }
        System.out.println("orginal array by given the user"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("aftert sorting the values"+Arrays.toString(arr));


    }
}

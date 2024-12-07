package Dec6;
import java.util.Scanner;

public class dupicatedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int []arr=new int[size];

        System.out.println("enter the arrays values");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("duplicated" );

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){


                   System.out.println(arr[i]);
                }
            }

        }




    }
}

package Dec6;

import java.util.Scanner;

public class missinNumber {
    public static void main(String[] args) {
        int arr[]= {1,3,4,5};
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }
        System.out.println(sum1);

        int total=0;
        for(int i=1;i<=5;i++){
            total+=i;
        }
        System.out.println(total);
     int   missing= total-sum1;
        System.out.println(missing);



      /*  Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int input=sc.nextInt();

        int array[]=new int [input];
        System.out.println("enter the arrays value");
       for(int i=0;i<array.length;i++){
         array[i]=  sc.nextInt();
       }
       int n=input+1;
       int expected=n*(n+1)/2;

       int act=0;
       for(int i=0;i<input;i++){
           act+=array[i];
       }
       int missing=expected-act;
        System.out.println(missing);


*/

    }
}

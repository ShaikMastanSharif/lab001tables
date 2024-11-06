package nov6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedMap;

public class commonElement {
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);

      /*  System.out.println("enter the arr1 number:");
       int n=sc.nextInt();

        System.out.println("enter the arr2 number:");
        int m=sc.nextInt();

        int []arr1=new int[n];
        int[]arr2=new int[m];

        System.out.println("enter the arr1 element:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the arr2 elements:");
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }

            }
        }*/


        /*int arr1[]={10,20,5,4,8};
        int arr2[]={10,20,8,9,7};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);

                }
            }
        }*/

        String str1[]={"java","python","js","sharif"};
        String str2[]={"java","python","sanie","mirza"};

        HashSet<String> output =new HashSet<>();

        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str1[i]==str2[j]){
                    System.out.println(str1[i]);
                    break;
                }
            }
        }
        for( String up:output){
            System.out.println(up);
        }

    }
}

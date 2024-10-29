package day22;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
       int c=0;
       int [] d=new int [a.length+b.length];

       for(int i=0;i<a.length;i++){
           d[c]=a[i];
           c++;
       }
       for(int i=0;i<b.length;i++){
           d[c]=b[i];
           c++;
       }
        System.out.println(Arrays.toString(d));

    }
}

package Dec6;
import java.util.Scanner;
public class evenANDodd {
    public static void main(String[] args) {
String str="i love automation in selelnium";

int count=0;
for(int i=0;i<str.length();i++) {
    Character c = str.charAt(i);
    if(Character.isUpperCase(c)){

    }
    System.out.print(c);
}   /*
         String str="";

        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i]))
                str+=Character.toLowerCase(arr[i]);
            else
                str+=Character.toUpperCase(arr[i]);


        }
        System.out.prinStln(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
     int size=sc.nextInt();
       char arr[]=new char[size];

        System.out.println("enter the array va;ues");
        for(int i=0;i<size;i++){
           String input=sc.nextLine();
        }

         int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                if(arr[i]<min){
                        min=arr[i];
                }
            }

        }
        System.out.println(max);
        System.out.println(min);

        for(int i=0;i<arr.length;i++){
            if(arr[i]%10==7){
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){

                arr[i]=arr[i]*arr[i];
                System.out.println(arr[i]);
            }
        }
         int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int []arr= new int [size];

        System.out.println("enter the array va;ues");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }

        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
             if(arr[i]>9&& arr[i]<100){
                System.out.println(arr[i]);
            }
            for(int i=0;i<arr.length;i++) {
            if (arr[i] >=4&&arr[i]<=11) {
                arr[i] = arr[i] * arr[i];
                System.out.println(arr[i]);
                for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
         */

    }
}

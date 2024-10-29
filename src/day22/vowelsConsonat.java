package day22;

import javax.swing.text.html.ListView;
import java.util.Scanner;

public class vowelsConsonat {
    public static boolean vowels(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U';


    }


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str=sc.nextLine();
     int count=0;

     for(int i=0;i<str.length();i++){
         if(vowels(str.charAt(i))){
             count++;

         }
     }
        System.out.println(count+" vowels");
        System.out.println(count+"coso");


    }
}

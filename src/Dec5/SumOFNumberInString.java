package Dec5;

import java.beans.Introspector;
import java.util.Scanner;

public class SumOFNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string with number ?");
        String input=sc.nextLine();
        int sum=0;

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch)){

               sum+=Integer.parseInt(""+ch);
            }
        }


        System.out.println(sum);



    }
}

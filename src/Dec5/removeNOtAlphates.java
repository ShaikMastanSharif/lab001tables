package Dec5;
import java.util.Scanner;
public class removeNOtAlphates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string?");
       String input= sc.nextLine();
int count=0;
       String str="";
       for(int i=0;i<input.length();i++) {
           char c = input.charAt(i);
           char lower = Character.toLowerCase(c);

           if (lower >= 'a' && lower <= 'z') {
               str = str + lower;
               count++;

           }

       }
        System.out.println(str);
        System.out.println(count);
    }
}

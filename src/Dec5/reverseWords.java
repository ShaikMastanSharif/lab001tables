package Dec5;
import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string?");
       String input= sc.nextLine();

       String rev="";
       for(int i=0;i<input.length();i++){
           char c=input.charAt(i);
          rev= c+rev;
       }
        System.out.println(rev);
    }
}

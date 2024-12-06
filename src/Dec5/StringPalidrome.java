package Dec5;
import java.util.Scanner;
public class StringPalidrome {
    public static void main(String[] str) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the string ?");
        String input = Sc.nextLine();

        String rev = "";
        for(int i=0;i<input.length();i++){
            char c= input.charAt(i);
            rev=c+rev;
        }
        System.out.println(rev);
        if(input.equals(rev))
            System.out.println("yes it is palidrome");
        else
            System.out.println("it is not a palidrome");
    }
}



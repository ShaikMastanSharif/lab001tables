package Dec5;
import java.util.Scanner;
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String str="",str2="";
        if(input.isEmpty()){
            System.out.println("string is empty");
        }else{
            str=str+input.charAt(0);
         str2=str2+   input.charAt(input.length()-1);
        }
        System.out.println(str);
        System.out.println(str2);
    }

}

package Dec5;
import java.util.Scanner;
public class vowelsAndConsoanteAndSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string?");
        String input=sc.nextLine();
       int vowels=0;
       int consonate=0;
       int space=0;
       for(int i=0;i<input.length();i++){
           char c=input.charAt(i);
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
               vowels++;
           }if(c==' '){
               space++;
           }
           else if (c>='a'&&c<='z'){
               consonate++;
           }
       }
        System.out.println("spaces"+space);
        System.out.println("vowels character"+vowels);
        System.out.println("consonates characters"+consonate);
    }
}

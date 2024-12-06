package Dec5;

import java.util.Scanner;

public class removeAllvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string?");
        String input=sc.nextLine();

       String str="";
       int count=0;
       for(int i=0;i<input.length();i++){
           char c=input.charAt(i);
           char lower=Character.toLowerCase(c);
           //if(!(lower=='a'|| lower=='e'||lower=='o'||lower=='i'||lower=='u')){
              // str=str+lower;
              // count++;
           //
        if(!(lower>='a' && lower<='z') ){
            str=str+lower;
            count++;
        }

       }
        /*System.out.println("vowels"+str);
        System.out.println(count);*/
        System.out.println("consonates"+str);
        System.out.println("consonate count"+count);

    }

}

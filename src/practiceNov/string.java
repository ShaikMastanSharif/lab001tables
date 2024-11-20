package practiceNov;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str=str.replaceAll("\\s","");
        System.out.println(str);
    //string are inmutable
       /* String st="hello";
        st.concat("world");
        System.out.println(st);

 int count=0;

        for(int i=0;i<st.length();i++){
            count++;
        }
        System.out.println(count);
 String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

int num=sc.nextInt();

        int or=num;
        int rev=0;

        while(num!=0){
           rev= rev*10+num%10;
           num=num/10;
        }
        if(or==rev){
            System.out.println("pali");
        }else
            System.out.println("not pali");

StringBuilder firstletter=new StringBuilder();
        for(String word:st1.split("\\s+")){
            firstletter.append(word.charAt(0));
        }
        System.out.println(firstletter.toString());


        */
    }
}

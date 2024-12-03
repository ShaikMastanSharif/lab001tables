package Dec1;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;
public class Angram {

   static boolean  isAngram(String s1 ,String s2){


       if(s1.length()!=s2.length()){
           return  false;
       }
     char c1[]=  s1.toCharArray();
      char c2[]= s2.toCharArray();
       Arrays.sort(c1);
       Arrays.sort(c2);
       return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string s1:");
        String s1=sc.nextLine();

        System.out.println("enter the String s2:");
        String s2=sc.nextLine();
        if(isAngram(s1,s2)){
            System.out.println("ares angram");
        }else{
            System.out.println("not a angram");
        }


    }
}

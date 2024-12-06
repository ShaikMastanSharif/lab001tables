package Dec5;

import java.util.Scanner;

public class ASSCiVAlue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string?");
        String input=sc.nextLine();

        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            System.out.println("assic values=="+(int)c);
        }
        ;
    }
}

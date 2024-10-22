package day22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine().toLowerCase();

        int vowels=0;
        int constants=0;
        System.out.println("vpwels:");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    System.out.println(ch+" ");
                    vowels++;
                }
            }
        }
        System.out.println("consonate:");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                    System.out.println(ch+ " ");
                    constants++;
                }
            }
        }
        System.out.println("number of the :"+vowels);
        System.out.println("number of the consonate:"+constants);
    }

}

package day24;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  /*  public static boolean isAnagram(String s ,String t){
        char c[]=s.toCharArray();
        char c1[]=s.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        return Arrays.equals(c,c1);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen","sleint"));*/


    /* public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the str1");
         String str1=sc.nextLine();
         System.out.println("enter the str2");
         String str2=sc.nextLine();

         if(str1.equals(str2)){
             System.out.println(str1+"and"+str2+"is anagrams");
         }else{
             System.out.println(str1+"and"+str2+"are not angrams");*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        scanner.close();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

    }

    private static boolean areAnagrams(String str1, String str2) {


        return true;
    }
}




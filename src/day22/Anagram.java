package day22;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    /*
    public static boolean isAngram(String s ,String t){
        String str1= s.replace("\\s"," ");
        String str2=t.replace("\\s"," ");
        if(str1.length()!=str2.length()){
            return false;
        }else{
            char c1[]=str1.toLowerCase().toCharArray();
            char c2[]=str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }

    }
        public static void main(String[] args) {

            System.out.println(isAngram("listen","silent"));
            }

        }*/
    public static boolean isangaran(String s,String t){
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
    public static void main(String[] args) {
        System.out.println(isangaran("listen","silent"));
        System.out.println(isangaran("cat","sharif"));
    }
    }

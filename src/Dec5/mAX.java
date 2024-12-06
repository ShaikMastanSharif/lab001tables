package Dec5;


import java.util.Scanner;

public class mAX {
    public static void main(String[] args) {

       String str1="aabbccdddd";
        System.out.println(sequence(str1));


    }

    public static int sequence(String str){
        int max=0;
        int currcount=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currcount++;
            }else {
                max=Math.max(max,currcount);
                currcount=1;
            }
        }
        return Math.max(max,currcount);
    }
}

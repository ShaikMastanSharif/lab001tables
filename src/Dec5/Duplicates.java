package Dec5;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
      String input=  sc.nextLine();
      String str="";
      int count=0;
      char ch[]=input.toCharArray();
      for(int i=0;i<ch.length;i++){
          for(int j=i+1;j<ch.length;j++){
              if(ch[i]==ch[j]){
              str=str+ch;
              }
          }
      }
        System.out.println(str);
        System.out.println(count);


      }

}

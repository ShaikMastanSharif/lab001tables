import java.util.Scanner;

public class gradepoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        if(num>=90 && num<=100){
            System.out.println( "grade" +":"+"A");
        } else if (num >=80 && num<=90) {
            System.out.println("grade"+":"+"B");
        }else if(num>=70 && num<=80){
            System.out.println("grade"+ ":" +"c");
        }else if(num>=60 && num<=70){
            System.out.println("grade"+ ":" +"D");

        }else {
            System.out.println("grade"+":"+"F");
        }

    }
}

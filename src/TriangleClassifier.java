import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value 1");
        int val1=sc.nextInt();

        System.out.println("enter the value2?");
        int val2=sc.nextInt();

        System.out.println("enter the value3?");
        int val3=sc.nextInt();
        if(val1==val2 && val2==val3){
            System.out.println("triangle is equilator");
        } else if (val1==val2 ){
            System.out.println("triangle is isosceles");
        }else{
            System.out.println("triangle is scalence");
        }
    }
}

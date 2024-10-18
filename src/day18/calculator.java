package day18;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number and operation(-,+,/,*,%)");
        char op = sc.next().charAt(0);
        System.out.println("enter the num1");
        double num1=sc.nextDouble();

        System.out.println("enter the num2");
        double num2=sc.nextDouble();



        switch (op){
            case '+':  System.out.println(num1+" "+num2+" ="+(num1+num2));break;
            case '-':
                System.out.println(num1+" "+num2+" ="+(num1-num2));break;
            case '*':
                System.out.println(num1+" "+num2+" ="+(num1*num2));break;
            case '%':
                System.out.println(num1+" "+num2+" ="+(num1%num2));break;
            case '/': if(num2!=0) {
                System.out.println(num1 + " " + num2 + " =" + (num1 / num2));

            }else{
                System.out.println("Division by zero");break;


            }
            default:
                System.out.println("invalid operation");
        }
        sc.close();
    }

}

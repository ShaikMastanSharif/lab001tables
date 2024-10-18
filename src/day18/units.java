package day18;

import java.util.Scanner;

public class units {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

        System.out.println("converter");
        System.out.println("1.kilometer to miles");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("choose a option");
        int option=sc.nextInt();

        if(option==1){

            System.out.println("enter the kilometer:");
            double km=sc.nextDouble();
            double miles=(km*0.621371);
            System.out.printf("%.2f kilometer= %.2f miles", km,miles);
        } else if (option==2) {
            System.out.println("enter the temp of Fah");
            double fah=sc.nextDouble();
            double cel= (fah-32)*5/9;

            System.out.printf("%.2f fah = %.2f cel",fah,cel);

        }else {
            System.out.println("invalid option");
        }
        sc.close();


    }
}

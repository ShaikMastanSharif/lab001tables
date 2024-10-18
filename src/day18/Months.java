package day18;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the number (1-12)");
        int val = sc.nextInt();


        //   String month = sc.nextLine();


        String[] months = {"jan", "feb", "march", "April", "may", "june", "july", "august", "set", "oct", "nov", "dec"};
        String[] seasons={"winter","winter","winter","summer","summer","summer","rainy","rainy","rainy","spring","spring","spring"};
        for (int i = 0; i < months.length; i++) {
            // System.out.println((i+1)+"."+months[i]);
        }
            if (val >= 1 && val <= 12) {
                System.out.println(months[val - 1] + " is the " + seasons[val - 1] +" season");
            } else {
                System.out.println("invalid");
            }

            sc.close();


    }
    }


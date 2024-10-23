package day23;

import java.util.Scanner;

public class matrics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the rows");
        int rows=sc.nextInt();


        System.out.println("enter the number of the col");
        int cols=sc.nextInt();

        int matrix[][]=new int[rows][cols];
        int transpose[][]=new int[cols][rows];

        System.out.println("enter the matrics");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        System.out.println("print the matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("create the transpose");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }

        }
        System.out.println("print the transpose");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[j][i]+" ");

            }
            System.out.println();
        }



    }
}
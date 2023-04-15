package org.example;

import java.util.Scanner;

public class MultiplicationFromUserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Please enter the number for Multiplication Table : ");
        int num=s.nextInt();
        System.out.print("How long do you want the multiplication table :  ");
        int num1=s.nextInt();
        for(int i =1;i<=num1;i++){
            System.out.println(i+" x "+num+" = "+i*num);
        }
    }
}
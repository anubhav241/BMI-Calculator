package com.company;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter your body weight in KG: ");
        int kg = sc.nextInt();
        System.out.print("Enter your body height in cm: ");
        int c = sc.nextInt();
        float m = c * 0.01f;
        double bmi = kg/(m*m);
        System.out.println("\nName: "+name+"\t****\tAge: "+age);
        System.out.println("Your Body Mass Index is : "+bmi);
        if (bmi >= 25){
            System.out.println("So you are in overweight condition");
        } else if (bmi < 18.5) {
            System.out.println("So you are in underweight condition");
        }else{
            System.out.println("So you are in normal condition");
        }
    }
}

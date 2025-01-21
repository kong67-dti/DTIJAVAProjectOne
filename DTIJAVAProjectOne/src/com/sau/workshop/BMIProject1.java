package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) {
        String empName;
        double height, bmi, weigh;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("    BMI Program by DTI-SAU    ");
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.print("In put your name: ");
        empName = sc.next();
        System.out.print("In put your weigh(kg): ");
        weigh = sc.nextDouble();
        System.out.print("In put your height(m): ");
        height = sc.nextDouble();

        System.out.println("++++++++++++++++++++++++++++++");

//        bmi = weigh / (height * height) ;
        bmi = weigh /  Math.pow(height,2) ;
        System.out.println("BMI of " + empName + " is " + df.format(bmi));
        System.out.println("++++++++++++++++++++++++++++++");





    }
}

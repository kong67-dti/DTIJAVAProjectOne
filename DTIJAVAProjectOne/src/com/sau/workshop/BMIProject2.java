package com.sau.workshop;

import  java.io.IOException;
import  java.io.InputStreamReader;
import  java.io.BufferedReader;


public class BMIProject2 {
    public static void main(String[] args) throws IOException {
        String empName;
        double height, bmi, weigh;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);


        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("    BMI Program by DTI-SAU    ");
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.print("input your name: ");
        empName = reader.readLine();
        System.out.print("input your weigh: ");
        weigh = Double.parseDouble( reader.readLine() );
        System.out.print("input your height: ");
        height = Double.parseDouble( reader.readLine() );

        System.out.println("++++++++++++++++++++++++++++++");

//        bmi = weigh / (height * height) ;
        bmi = weigh /  Math.pow(height,2) ;
        System.out.println("BMI of " + empName + " is" + String.format(" %.4f",bmi));
        System.out.println("++++++++++++++++++++++++++++++");






    }
}

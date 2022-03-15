package com.harman.project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        Sub subObj = new Sub();
        Mul mulObj = new Mul();
        Div divObj = new Div();
        Scanner input = new Scanner(System.in);
        Integer x,y,addResult,subResult,dicResult,mulResult;
        System.out.println("Enter the num1:");
        x= input.nextInt();
        System.out.println("Enter the num2:");
        y = input.nextInt();
        addResult = addObj.add2num(x,y);
        System.out.println(addResult);
        subResult = subObj.sub2num(x,y);
        System.out.println(subResult);
        mulResult = mulObj.multiplication(x,y);
        System.out.println(mulResult);
        dicResult = divObj.division(x,y);
        System.out.println(dicResult);



    }


}

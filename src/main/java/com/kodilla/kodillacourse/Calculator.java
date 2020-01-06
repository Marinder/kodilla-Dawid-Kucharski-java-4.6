package com.kodilla.kodillacourse;

public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int plusMethod(){
        int plus = a + b;
        return plus;
    }
    public int minusMethod(){
        int minus = a - b;
        return minus;

    }

    public static void main(String args[]){
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.plusMethod());
        System.out.println(calculator.minusMethod());
    }
}

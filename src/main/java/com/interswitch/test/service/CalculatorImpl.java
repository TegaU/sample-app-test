package com.interswitch.test.service;

public class CalculatorImpl implements CalculatorService{
    private int a;

    private int b;


    @Override
    public double addition(double a, double b) {
        return a+b;
    }

    @Override
    public double difference(double a, double b) {
        double result;

        if(a>b){
            result= a - b;
        }else{
            result = b-a;
        }
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        double result;
        if(a>b){
            result= a / b;
        }else{
            result = b /a;
        }
        return result;
    }
}

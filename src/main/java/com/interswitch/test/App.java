package com.interswitch.test;

import com.interswitch.test.service.CalculatorImpl;
import com.interswitch.test.service.CalculatorService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculatorService calculator = new CalculatorImpl();
        System.out.println(calculator.addition(4,5));
        System.out.println(calculator.difference(4,5));
        System.out.println(calculator.divide(4,5));
        System.out.println(calculator.multiply(4,5));

        System.out.println( "Hello World!" );
    }
}

package com.interswitch.test;

import com.interswitch.test.service.CalculatorImpl;
import com.interswitch.test.service.CalculatorService;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorImpl();
        System.out.println(calculator.addition(4, 5));
        System.out.println(calculator.difference(4, 5));
        System.out.println(calculator.divide(4, 5));
        System.out.println(calculator.multiply(4, 5));

        System.out.println("Hello World!");

        UpperLowerCase upercls = new UpperLowerCase();
        System.out.printf("%s to %s","Hello World", upercls.wordToUpper("Hello World!"));
        System.out.println();
        System.out.printf("%s to %s","Hello World", upercls.wordToLower("Hello World!"));

        System.out.println("New Go-home Feature by Backbone Team suggested at" + LocalDateTime.now());
    }
}



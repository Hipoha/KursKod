package com.kodilla.exception.test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = 0.0;

        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e + ": division by zero!");
            System.out.println("Assigned value of Infinity (jdk.nashorn.internal.objects.Global.Infinity).");
            result = Infinity;
        } finally {
            System.out.println(result);
        }


        
    }
}
package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.0, 1.0);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("This will always be printed");
        }

    }

}

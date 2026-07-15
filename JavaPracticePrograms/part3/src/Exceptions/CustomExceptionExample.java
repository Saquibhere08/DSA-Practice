//package Exceptions;
//
//class AgeException extends Exception {
//
//    // Constructor
//    AgeException(String message) {
//        super(message);
//    }
//}
//
//public class CustomExceptionExample {
//
//    public static void checkAge(int age) throws AgeException {
//        if (age < 18) {
//            throw new AgeException("Not eligible to vote");
//        } else {
//            System.out.println("Eligible to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        int age = 16;
//
//        try {
//            checkAge(age);
//        } catch (AgeException e) {
//            System.out.println("Exception Caught: " + e.getMessage());
//        }
//    }
//}
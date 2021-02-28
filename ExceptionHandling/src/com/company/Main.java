package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            System.out.println("2/1");
            System.out.println(Integer.parseInt("2"));

        try {
            Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE,  "couldn't locate the class");
        }
        System.out.println("end of try");
    }
        catch (ArithmeticException ae){
            logger.log(Level.SEVERE,  "you can't divide by zero");
        }
        catch (NumberFormatException nfe){
            logger.log(Level.SEVERE,  "please provide a value");
        }
        System.out.println("end");
    }

}

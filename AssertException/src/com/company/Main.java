package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

class Arithmetic{
    public int sum(int num1 , int num2){
        return num1 +num2;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger=Logger.getLogger(Main.class.getName());
        //System.out.println(args[0]+args[1]);
        assert (new Arithmetic().sum(2,4)==6):"the sum method has logical error";
        logger.log(Level.INFO,"End");
    }
}

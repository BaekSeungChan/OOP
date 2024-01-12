package org.example;

public class Calculator {

    public static int calculate(int opperand1, String opperator, int opperand2){
        if("+".equals(opperator)){
            return opperand1 + opperand2;
        }
        else if("-".equals(opperator)){
            return opperand1 - opperand2;
        }
        return 0;
    }
}

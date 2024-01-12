package org.example;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int arithmetioCalculate(int opperand1, int opperand2) {
            return opperand1 + opperand2;
        }
    }, SUBTRACTION("-"){
        @Override
        public int arithmetioCalculate(int opperand1, int opperand2) {
            return opperand1 - opperand2;
        }
    }, MULTIPLICATION("*"){
        @Override
        public int arithmetioCalculate(int opperand1, int opperand2) {
            return opperand1 * ordinal();
        }
    }, DIBISION("/"){
        @Override
        public int arithmetioCalculate(int opperand1, int opperand2) {
            return opperand1 / opperand2;
        }
    };


    private final String operator;

    ArithmeticOperator(String operator){
        this.operator = operator;
    }

    protected abstract int arithmetioCalculate(final int opperand1, final int opperand2);

    public static  int calculate(int opperand1, String operator, int opperand2){
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
        return arithmeticOperator.arithmetioCalculate(opperand1, opperand2);
    }

}

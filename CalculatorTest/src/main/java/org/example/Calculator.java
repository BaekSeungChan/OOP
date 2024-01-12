package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(int opperand1, String opperator, int opperand2){
        return arithmeticOperators.stream()
                .filter(arithmeticOperators -> arithmeticOperators.supports(opperator))
                .map(arithmeticOperators -> arithmeticOperators.calculate(opperand1, opperand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}

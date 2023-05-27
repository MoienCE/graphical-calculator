package ir.ac.kntu.logic;

public class Calculator {

    public static double calculate(StringBuilder operand1, StringBuilder operand2, StringBuilder operator) {
        return switch (Operator.valueOf(operator.toString())) {
            case PLUS -> Double.parseDouble(operand1.toString()) + Double.parseDouble(operand2.toString());
            case MINUS -> Double.parseDouble(operand1.toString()) - Double.parseDouble(operand2.toString());
            case DIVIDE -> Double.parseDouble(operand1.toString()) / Double.parseDouble(operand2.toString());
            case MULTIPLY -> Double.parseDouble(operand1.toString()) * Double.parseDouble(operand2.toString());
            case UNKNOWN -> 0.0;
        };
    }
}

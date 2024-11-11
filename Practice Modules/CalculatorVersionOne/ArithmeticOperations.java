package CalculatorVersionOne;

public interface ArithmeticOperations {
    
    public scala.Double addition(Double lhs, Double rhs);
    public scala.Double subtraction(Double lhs, Double rhs);
    public scala.Double multiplication(Double lhs, Double rhs);
    public scala.Double division(Double lhs, Double rhs) throws ArithmeticException;
    
}

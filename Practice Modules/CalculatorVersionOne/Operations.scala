package CalculatorVersionOne

enum Operations(val value: Int) {
      case Addition extends Operations(1);
      case Subtraction extends Operations(2);
      case Multiplication extends Operations(3);
      case Division extends Operations(4);
}
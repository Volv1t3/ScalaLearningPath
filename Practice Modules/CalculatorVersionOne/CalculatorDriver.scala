package CalculatorVersionOne

import java.util.Scanner
import scala.util.hashing.Hashing.Default

object CalculatorDriver {

  def main(args: Array[String]): Unit = {
    printf("%120s\n", "Hello and welcome to our Calculator")
    println();
    val scanner: Scanner = new Scanner(System.in);
    var scannedInput: Int = 0
    while (scannedInput.!=(5)) {
      var resultingArrayFromReading: Array[scala.Double] = Array(0.0, 0.0);
      var result: Double = 0.0;
      println("Here are our operations:\n1. Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Quit Application\nYour Input: ")
      scannedInput = scanner.nextInt()
      scannedInput match {
        case Operations.Addition.value => {
          resultingArrayFromReading = inputMethodRequests(methodCalled = "Addition", scannerObject = scanner)
          result = ArithmeticImplementor.addition(resultingArrayFromReading.apply(0), resultingArrayFromReading.apply(1))
          println("Your operation outputted: " + result)
        }
        case Operations.Subtraction.value => {
          resultingArrayFromReading = inputMethodRequests(methodCalled = "Subtraction", scannerObject = scanner)
          result = ArithmeticImplementor.subtraction(resultingArrayFromReading.apply(0), resultingArrayFromReading.apply(1))
          println("Your operation outputted: " + result)
        }
        case Operations.Multiplication.value => {
          resultingArrayFromReading = inputMethodRequests(methodCalled = "Multiplication", scannerObject = scanner)
          result = ArithmeticImplementor.multiplication(resultingArrayFromReading.apply(0), resultingArrayFromReading.apply(1))
          println("Your operation outputted: " + result)
        }
        case Operations.Division.value => {
          resultingArrayFromReading = inputMethodRequests(methodCalled = "Division", scannerObject = scanner)
          try {
            result = ArithmeticImplementor.division(resultingArrayFromReading.apply(0), resultingArrayFromReading.apply(1))
          }
          catch {
            case arr: ArithmeticException => {
              println(arr.getMessage);
              throw new RuntimeException(arr.getCause);
            }
            case arr: NullPointerException => {
              println(arr.getMessage);
              throw new RuntimeException(arr.getCause);
            }
          }
          println("Your operation outputted: " + result)
        }
        case 5 => {
          printf("%120s", "Thank you for using our application!")
          System.exit(0)
        }
        case default => {
          println("You have entered an invalid input. Please try again.")
        }
      }
    }
  }

  private def inputMethodRequests(methodCalled: String, scannerObject: Scanner): Array[scala.Double] =
      printf("%120s", s"You have selected $methodCalled!")
      println("Please enter two values in the order they are requested")
      println("Enter the lhs of your operation: ")
      var lhs: Double = scannerObject.nextDouble()
      println("Enter the rhs of your operation: ")
      var rhs: Double = scannerObject.nextDouble()
      return Array(lhs, rhs)
  end inputMethodRequests
}
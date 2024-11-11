package CalculatorVersionOne

import java.lang.Double
/**This <: operator says that our type has to be a <b>subtype of Number</b>*/
object ArithmeticImplementor extends ArithmeticOperations {

  override def addition(lhs: Double, rhs: Double): scala.Double = {
    this.checkForNullity(lhs,rhs);
    return (lhs + rhs);
  }

  override def subtraction(lhs: Double, rhs: Double): scala.Double = {
    this.checkForNullity(lhs,rhs);
    return (lhs - rhs);
  }

  override def multiplication(lhs: Double, rhs: Double): scala.Double = {
    this.checkForNullity(lhs,rhs);
    return (lhs * rhs) //Although the return is not needed I shall put it in here !
  }

  override def division(lhs: Double, rhs: Double): scala.Double = {
    if (rhs == 0) then
      throw new ArithmeticException("The value passed for rhs was 0, avoided error but please do not be that dumb")
    else
      this.checkForNullity(lhs, rhs);
      return (lhs/rhs)
  }


  private def checkForNullity(lhs: Double, rhs:Double): Unit = {
    if (lhs == null || rhs == null){
      throw new NullPointerException("Value Passed for these methods were null")
    }
  }
}

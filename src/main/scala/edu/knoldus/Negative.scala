package edu.knoldus

object Negative extends IntSign {

  def isPositive: Boolean = false

  def negate: IntSign = Positive
}

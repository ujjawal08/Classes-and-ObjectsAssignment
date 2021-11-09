package edu.knoldus
import org.scalatest.funsuite.AnyFunSuite

class IntegerTest extends AnyFunSuite {
  val zero = Zero



    test("we will test the zero for the problem"){
      println(assert(zero.isZero == true))
      println(assert(zero.successor.isZero == false))
      println(assert(zero.+(zero).isZero == true))
      println(assert(zero.-(zero).isZero == true))

    }
  val one = new Successor(zero)
  test("we will test the one for the problem"){
    println(assert(one.isZero == false))
    println(assert(one.successor.isZero==false))
    println(assert(one.predecessor.isZero == true))
    println(assert(one.+(one).isZero==false))
    println(assert(one.-(one).isZero==true))
  }



}


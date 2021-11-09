package edu.knoldus

class Successor(x: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = x
  def successor: Nat = new Successor(this)
  def +(that: Nat): Nat = x + that.successor
  def -(that: Nat): Nat = if (that.isZero) this else x - that.predecessor
}
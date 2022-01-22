package com.knoldus

import scala.annotation.tailrec

class SquareList {

  @tailrec
  final def squaringListWithMatch(list: List[Int], helper: List[Int] = List()): List[Int] =
    list match {
      case List() => helper
      case head :: tail => squaringListWithMatch(tail, helper :+ (head * head))
    }

  def squaringListWithMap(list: List[Int]): List[Int] = list.map(element => element * element)
}
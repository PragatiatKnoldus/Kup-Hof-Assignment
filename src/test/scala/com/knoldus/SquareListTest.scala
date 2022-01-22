package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SquareListTest extends AnyFlatSpec {

  val squaring = new SquareList

  "A condition" should "be correct for match function if list is empty" in {
    assert(List() == squaring.squaringListWithMatch(List()))
  }

  "A condition" should "be correct for match function if list is not empty" in {
    assert(List(36, 16, 49, 4, 64, 1) == squaring.squaringListWithMatch(List(6, 4, 7, 2, 8, 1)))
  }

  "A condition" should "be correct for map function if list is empty" in {
    assert(List() == squaring.squaringListWithMap(List()))
  }

  "A condition" should "be correct for map function if list is not empty" in {
    assert(List(36, 16, 49, 4, 64, 1) == squaring.squaringListWithMap(List(6, 4, 7, 2, 8, 1)))
  }
}
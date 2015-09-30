import org.scalatest.FunSuite

class Problem1Test extends FunSuite {
  test("5 is not multiple of 2") {
    assert(Problem1.isMultipleOf(2)(5) == false)
  }

  test("4 is multiple of 2") {
    assert(Problem1.isMultipleOf(2)(4) == true)
  }

  test("5 is multiple of 5") {
    assert(Problem1.isMultipleOf(5)(5) == true)
  }

  test("10 is multiple of 5") {
    assert(Problem1.isMultipleOf(5)(10) == true)
  }

  test("10 is multiple of 5 v2") {
    assert(Problem1.isMultipleOf5(10) == true)
  }

  test("10 is not multiple of 3 ") {
    assert(Problem1.isMultipleOf3(10) == false)
  }

  test("12 is multiple of 3 ") {
    assert(Problem1.isMultipleOf3(12) == true)
  }

  test("all numbers between 1 and 1000") {
    assert(Problem1.numbersBelow100.length == 99)
  }

  test("all numbers between 1 and 1000 multiple of 3") {
    assert(Problem1.numbersBelow100.filter(Problem1.isMultipleOf3(_)).length == 33)
  }

  test("all numbers between 1 and 1000 multiple of 5") {
    assert(Problem1.numbersBelow100.filter(Problem1.isMultipleOf5(_)).length == 19)
  }

  test("all numbers between 1 and 1000 multiple of 3 and 5") {
    assert((1 to 99)
      .toList
      .filter(x => Problem1.isMultipleOf5(x) || Problem1.isMultipleOf3(x))
      .length == 46)
  }

  test("sum of all numbers between 1 and 1000 multiple of 3 and 5") {
    assert((1 to 999)
      .toList
      .filter(x => Problem1.isMultipleOf5(x) || Problem1.isMultipleOf3(x))
      .sum == 233168)
  }

}

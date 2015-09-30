object Problem1 {

  def isMultipleOf(multiple: Int)(number: Int): Boolean = {
    number % multiple == 0
  }

  def isMultipleOf5(number: Int): Boolean = {
    isMultipleOf(5)(number)
  }

  def isMultipleOf3(number: Int): Boolean = {
    isMultipleOf(3)(number)
  }

  def numbersBelow100() = {
    (1 to 99).toList
  }
}

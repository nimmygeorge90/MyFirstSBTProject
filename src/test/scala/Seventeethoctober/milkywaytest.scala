package Seventeethoctober

class milkywaytest {

def givenAFinger_whenIsShortestCalled_thenCorrectValueReturned() = {
  val operation = new FingersOperation()

  assertTrue(operation.isShortest(Little))
  assertFalse(operation.isShortest(Index))
}
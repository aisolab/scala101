package EX_3

/*
  do while 루프
*/

object EX_3_6 {
  def main(args: Array[String]): Unit = {
    var a = 0
    do {
      print(a + ",")
      a += 1
    } while (a < 20)
  }
}

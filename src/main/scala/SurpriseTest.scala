
package con.knoldus

import scala.annotation.tailrec

class SurpriseTest {

  //method for add all the elements of list
  def sumList(list: List[Int]): Int = {
    @tailrec
    def sum(acc: Int, remainingList: List[Int]): Int = {
      remainingList match {
        case Nil => acc
        case first :: last => sum(acc + first, last)
      }
    }

    sum(0, list)
  }

}

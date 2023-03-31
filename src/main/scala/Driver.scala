package con.knoldus

object Driver extends App{

  private val surpriseTestInstance = new SurpriseTest
  val list =List(12,1,45,15,5)
  private val result =  surpriseTestInstance.sumList(list)
  println(result)
}

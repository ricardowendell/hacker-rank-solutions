object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()

    val arr = new Array[Int](n)
    for(arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }
    println(arr.sum)
  }
}
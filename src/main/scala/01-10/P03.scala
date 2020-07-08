object P03 extends App {
    def nth[A](n: Int, list: List[A]): A = {
        list match {
            case x :: _ if n == 0 => x
            case _ :: xs if n > 0 => nth(n-1, xs)
            case _ => throw new IllegalArgumentException("Invalid val")
        }
    }
    println(nth(3, List(1,2,3,4,5)))
    println(nth(4, List("a", "b", "c", "d", "e", "f")))
    println(nth(5, List(1,2)))
}
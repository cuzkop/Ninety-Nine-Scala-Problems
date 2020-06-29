object p01 {
    def main(args: Array[String]): Unit = {
        def last[A](list: List[A]): A = {
            list match {
                case x :: Nil => x
                case x :: xs => last(xs)
                case _ => throw new IllegalArgumentException("Invalid val")
            }
        }
        println(last(List(1,2,3,4,5)))
        println(last(List("a", "b", "c", "d", "e")))
        println(last(List()))
    }
}
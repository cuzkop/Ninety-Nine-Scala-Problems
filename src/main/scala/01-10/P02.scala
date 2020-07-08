object P02 extends App {
    def penultimate[A](list: List[A]): A = {
        list match {
            case x :: y :: Nil => x
            case x :: y :: xs => penultimate(y :: xs)
            case _ => throw new IllegalArgumentException("Invalid val")
        }
    }
    println(penultimate(List(1,2,3,4,5)))
}
object p04 extends App {
    def length[A](list: List[A]): Int = {
        def loop(l: List[A], i: Int): Int = {
            l match {
                case x :: xs => loop(xs, i + 1)
                case Nil => i
            }
        }
        loop(list, 0)
    }
    println(length(List(1,2,3,4,5)))
}
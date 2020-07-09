object P07 extends App{
    def flatten(list: List[Any]): List[Any] = {
        list match {
            case (x: List[_]) :: xs => flatten(x) ::: flatten(xs)
            case x :: xs            => x :: flatten(xs)
            case Nil                => Nil
        }
    }
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}
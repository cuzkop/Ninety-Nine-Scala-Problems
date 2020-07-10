object P08 extends App{
    def compress[T](list: List[T]): List[T] = {
        def con(pre: T, l: List[T]): List[T] = {
            l match {
                case x :: xs if pre == x => con(pre, xs)
                case x :: xs => pre :: con(x, xs)
                case Nil => pre :: Nil
            }
        }
        list match {
            case x :: xs => con(x, xs)
            case Nil => Nil
        }
    }
    println(compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")))
}
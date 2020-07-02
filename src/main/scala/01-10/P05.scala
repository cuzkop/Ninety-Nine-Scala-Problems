object p05 {
    def main(args: Array[String]): Unit = {
        def reverse[A](list: List[A]): List[A] = {
            val reverseList: List[A] = Nil
            list.foldLeft(reverseList){(acc, x) => x :: acc}
        }
        println(reverse(List(1,2,3,4,5)))
        println(reverse(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")))
    }
}
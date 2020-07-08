import P05.reverse

object P06 extends App {
    def isPalindrome[A](list: List[A]): Boolean = {
        reverse(list) == list
    }
    println(isPalindrome(List(1,2,3,2,1)))
    println(isPalindrome(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")))
}
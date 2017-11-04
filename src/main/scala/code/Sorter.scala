package code

object Sorter {
  def insert[A](x: A, xs: List[A])(ord: Ord[A]): List[A] = xs match {
    case Nil                          => x :: Nil
    case head :: _ if ord.lt(x, head) => x :: xs
    case head :: tail                 => head :: insert(x, tail)(ord)
  }

  def sort[A](xs: List[A])(ord: Ord[A]): List[A] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail)(ord))(ord)
  }
}

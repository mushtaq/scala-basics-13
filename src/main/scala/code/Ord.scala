package code

trait Ord[A] {
  def lt(a: A, b: A): Boolean
}

object Ord {
  val intOrd: Ord[Int] = (a: Int, b: Int) => a < b

  val strOrd: Ord[String] = (a: String, b: String) => a < b

  def optOrd[A](ord: Ord[A]): Ord[Option[A]] = (a: Option[A], b: Option[A]) => (a, b) match {
    case (Some(x), Some(y)) => ord.lt(x, y)
    case (None, _)          => true
    case (_, None)          => false
  }

}

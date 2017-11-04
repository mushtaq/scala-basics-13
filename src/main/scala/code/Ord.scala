package code

trait Ord[A] {
  def lt(a: A, b: A): Boolean
}

object Ord {
  val intOrd: Ord[Int] = (a: Int, b: Int) => a < b
}





def fold[A, B](xs: List[A], seed: B)(op: (B, A) ⇒ B): B = {
  var result: B = seed
  val iterator = xs.iterator
  while (iterator.hasNext) {
    result = op(result, iterator.next())
  }
  result
}

def add(a: Int, b: Int) = a + b

def sum(xs: List[Int]): Int = fold(xs, 0)(add)

def product(xs: List[Int]): Int = fold(xs, 1)((x, y) ⇒ x * y)

def stringify(xs: List[Int]): String = fold(xs, "")((x, y) ⇒ x + y)

sum(List(1, 2, 3, 4))
product(List(1, 2, 3, 4))
stringify(List(1, 2, 3, 4))

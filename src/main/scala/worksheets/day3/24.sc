import code.{Sorter, Ord}

Sorter.sort(List(3, 2, 10, 4 , 100))(Ord.intOrd)

Sorter.sort(List("s", "z", "a"))(Ord.strOrd)

Sorter.sort(List(Option(10), Option.empty[Int], Option(3)))(
  Ord.optOrd(Ord.intOrd)
)

Sorter.sort(List(Option("s"), Option.empty[String], Option("a")))(
  Ord.optOrd(Ord.strOrd)
)

Sorter.sort(List((10, "z"), (10, "a"), (1, "m")))(

)



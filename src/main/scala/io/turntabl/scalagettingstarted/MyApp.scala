package io.turntabl.scalagettingstarted

object MyApp extends App {

val books = List(new Book("Phoenix", "gaming",1990,"play"),
  new Book("Phoenix", "gaming",1990,"play"),
  new Book("me", "age of empires",1994,"History"),
  new Book("Phoenix", "gaming",1990,"play"),
  new Book("Phoenix", "gaming",1990,"play")
  )

  books.foreach(println)
}


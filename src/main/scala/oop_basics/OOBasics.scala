package oop_basics

object OOBasics extends App {

    val person = new Person("Lucas", 25)
    println(person.age)
    person.greet("Daniel")
    person.greet()

    val author = new Writer("Charles", "Dickens", 1812)
    val imposter = new Writer("Charles", "Dickens", 1812)
    val novel = new Novel("Great Expectations", 1861, author)

    println(novel.authorAge)
    println(novel.isWritenBy(imposter))

    val counter = new Counter()
    counter.inc.print
    counter.inc.inc.inc.print
    counter.inc(10).print
}

// class params is not fields, to become fields use de val statement
// constructor
class Person(name: String, val age: Int = 0) {

    // fields
    val x = 2
    // expressions
    println(1+3)

    // method
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
    // overloading
    def greet(): Unit = println(s"Hi, I am $name")

    // multiple constructors
    def this(name: String) = this(name, 0)

}

class Writer(firstName: String, lastName: String, val year: Int) {
    def fullName: String = s"$firstName $lastName"
}

class Novel(name: String, val year: Int, author: Writer) {
    def authorAge = year - author.year
    def isWritenBy(author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {

    def inc = {
        println("inc")
        new Counter(count + 1)
    }

    def dec = {
        println("dec")
        new Counter(count - 1)
    }

    def inc(n: Int): Counter = {
        if (n <= 0) this
        else inc.inc(n - 1)
    }

    def dec(n: Int): Counter = {
        if (n <= 0 ) this
        else dec.dec(n - 1)
    }

    def print = println(count)

}




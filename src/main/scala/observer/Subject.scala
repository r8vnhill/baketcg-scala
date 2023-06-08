
package cl.ravenhill.edu.baketcg
package observer

trait Subject[T] {

  def addObserver(observer: Observer[T]): Unit

  def notifyObservers(value: T): Unit
}

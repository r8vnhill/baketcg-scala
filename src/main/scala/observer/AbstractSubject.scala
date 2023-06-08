package cl.ravenhill.edu.baketcg
package observer

abstract class AbstractSubject[T] extends Subject[T] {
  private var observers: List[Observer[T]] = Nil

  override def addObserver(observer: Observer[T]): Unit = {
    observers = observer :: observers
  }

  override def notifyObservers(value: T): Unit = {
    for (observer <- observers) {
      observer.update(this, value)
    }
  }
}

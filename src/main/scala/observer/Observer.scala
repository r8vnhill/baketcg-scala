package cl.ravenhill.edu.baketcg
package observer

trait Observer[T] {
  def update(observable: Subject[T], value: T): Unit
}

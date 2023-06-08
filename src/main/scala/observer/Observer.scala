package cl.ravenhill.edu.baketcg
package observer

trait Observer {
  def update(observable: Subject, value: Any): Unit
}

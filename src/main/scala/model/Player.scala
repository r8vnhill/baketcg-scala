
package cl.ravenhill.edu.baketcg
package model

import observer.AbstractSubject

import scala.collection.mutable

class Player extends AbstractSubject {
  val _prizes: mutable.ArrayBuffer[Card] = mutable.ArrayBuffer.empty

  def removePrize(card: Card): Unit = {
    _prizes -= card
    if (_prizes.isEmpty) {
      notifyObservers(new WinCondition("prizes"))
    }
  }

  /* ... */
}

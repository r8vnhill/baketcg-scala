package cl.ravenhill.edu.baketcg
package model

class Card(
    val name: String,
    private var _hp: Int,
    val attacks: List[Attack]
) {
  private var _energy: Int = 0
  def hp: Int = _hp
  def hp_=(value: Int): Unit = {
    _hp = math.max(0, value)
  }
  def energy: Int = _energy
  def energy_=(value: Int): Unit = {
    _energy = math.max(0, value)
  }
  def attack(index: Int, target: Card): Unit = {
    if (index >= 0 && index < attacks.length) {
      val attack = attacks(index)
      attack(this, target)
    }
  }
}

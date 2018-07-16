package dominio

object EnumTipoVehiculo extends Enumeration {
  val MOTO  = Value(1, "Moto")
  val CARRO = Value(2, "Carro")

  class EnumTipoVehiculo(val codigo: Int, val name: String)  extends Val(codigo: Int, name: String) {

  }

}
package dominio

class Vehiculo(val placa: String, val tipoVehiculo: EnumTipoVehiculo.Value) {

  override def toString(): String = "(" + placa + ", " + tipoVehiculo + ")"

}

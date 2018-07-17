package controllers

import javax.inject._

import play.api.Logger
import play.api.mvc._

import dominio._

/*import dominio.RequestVehiculo
import dominio.Vehiculo
import dominio.EnumTipoVehiculo
*/
@Singleton
class ParqueaderoController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {


  def ingreso  = Action {
    Logger.info("Ingreso vehiculo.")

    /*val dynamicForm = Form.form.bindFromRequest
    Logger.info("Placa is: " + dynamicForm.get("placa"))
    Logger.info("Tipo Vehiculo is: " + dynamicForm.get("tipoVehiculo"))
    Logger.info("Cilindraje is: " + dynamicForm.get("cilindraje"))
    return Ok("ok, I recived POST data. That's all...") */

    //Results.Ok
    Ok(views.html.parqueadero("Ingreso Vehiculo" ))
  }

  def salida (placa: String) = Action {
    Logger.info("Salida vehiculo.")

    //Results.Ok
    Ok(views.html.parqueadero(s"Salida Vehiculo $placa" ))
  }

  def vehiculosparqueados = Action {
    Logger.info("Vehiculos parqueados.")

    val vehiculo = new Vehiculo("XTZ12", EnumTipoVehiculo.CARRO)

    //Results.Ok
    Ok(views.html.listavehiculosparqueados(List(vehiculo)))
  }

  def main = Action {
    Logger.info("Pagina principal de parqueadero")
    Ok(views.html.parkingsidebar())
  }

}
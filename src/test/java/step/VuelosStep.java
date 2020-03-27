package step;

import static driver.DriverChrome.hisBrowserWeb;
import static driver.DriverExplorer.genero;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import driver.DriverExplorer;
import driver.Hola;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import question.LaFactura;
import task.BuscarElPrecio;
import task.BuscarElVuelo;
import task.LlenarElFormulario;
import task.ObtenerFactura;

public class VuelosStep {

	private Actor actor;
	
	@Dado("^que (.*) se encuentre en la pagina de vivaair$")
	public void queJuanSeEncuentreEnLaPaginaDeVivaair(String juan)  {
	//	DriverExplorer.genero();
		actor = Actor.named(juan);
		//Hola.genero();
		//actor.can(BrowseTheWeb.with(hisBrowserWeb().on("https://www.vivaair.com/co/")));
		actor.can(BrowseTheWeb.with(hisBrowserWeb().on("https://www.vivaair.com/co/")));
	
	}
	

	@Cuando("^ingrese la información$")
	public void ingreseLaInformacion(List<List<String>> datos)  {
		 actor.attemptsTo(BuscarElVuelo.paraElPasajero(datos));
		 actor.attemptsTo(BuscarElPrecio.delViaje());
		actor.attemptsTo(LlenarElFormulario.conLosDatos(datos));
		actor.attemptsTo(ObtenerFactura.delVuelo());
	}
	@Entonces("^vera la información de la factura en (.*)$")
	public void veraLaInformacionDeLaFacturaEnTUCOMPRA(String tucompra)  {
		actor.should(seeThat(LaFactura.es(),equalTo(tucompra)));
	}

}

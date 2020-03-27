package task;

import static pages.PageVuelos.ADULTOS;
import static pages.PageVuelos.BTNLISTACIUDADESDESTINO;
import static pages.PageVuelos.BTNLISTACIUDADESORIGEN;
import static pages.PageVuelos.BTNRESERVAR;
import static pages.PageVuelos.LISTA;
import static pages.PageVuelos.CIUDADORIGEN;
import static pages.PageVuelos.INFANTES;
import static pages.PageVuelos.LISTADULTOS;
import static pages.PageVuelos.LISTAMONEDA;

import static pages.PageVuelos.MONEDA;
import static pages.PageVuelos.NINOS;
import static pages.PageVuelos.RBDIDA;
import static pages.PageVuelos.BTNCERRAR;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.remote.server.handler.interactions.DoubleClickInSession;

import interaction.Buscar;
import interaction.DoubleClick;
import interaction.Prueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BuscarElVuelo implements Task {
	private String origen;
	private String destino;
	private String ano2;
	private String mes2;
	private String dia2;
	private String ano1;
	private String mes1;
	private String dia1;
	private String adultos;
	private String ninos;
	private String infantes;
	private String moneda;
public BuscarElVuelo(List<List<String>> datos) {
   this.origen = datos.get(0).get(1);
   this.destino = datos.get(1).get(1);
   this.ano2 = datos.get(2).get(1);
   this.mes2 = datos.get(3).get(1);
   this.dia2 = datos.get(4).get(1);
   this.ano1 = datos.get(5).get(1);
   this.mes1 = datos.get(6).get(1);
   this.dia1 = datos.get(7).get(1);
   this.adultos=datos.get(8).get(1);
   this.ninos=datos.get(9).get(1);
   this.infantes=datos.get(10).get(1);
   this.moneda=datos.get(11).get(1);
}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		/*Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
		WebElement element=RBDIDA.resolveFor(actor);
		actions.doubleClick(element).perform();*/	
	
		actor.attemptsTo(
				//DoubleClick.on(RBDIDA),
				//Prueba.doubleclick(RBDIDA),
				Click.on(BTNCERRAR),
				Click.on(RBDIDA),
				Click.on(BTNLISTACIUDADESORIGEN),
				Click.on(CIUDADORIGEN.of(origen)),
				Click.on(BTNLISTACIUDADESDESTINO),
				Click.on(LISTA.of(destino)),
				Buscar.laFecha(ano2, mes2, dia2),
				Buscar.laFecha(ano1, mes1, dia1),
				Click.on(ADULTOS),
				Click.on(LISTADULTOS.of(adultos)),
                Click.on(NINOS),
                Click.on(LISTA.of(ninos)),
                Click.on(INFANTES),
                Click.on(LISTA.of(infantes)),
                Click.on(MONEDA),
                Click.on(LISTAMONEDA.of(moneda)),
                Click.on(BTNRESERVAR)
				);

	}
	
	public static BuscarElVuelo paraElPasajero(List<List<String>> datos) {
		return Tasks.instrumented(BuscarElVuelo.class, datos);
	}
}
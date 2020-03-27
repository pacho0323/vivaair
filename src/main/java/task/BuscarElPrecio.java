package task;

import static pages.PageVuelos.BTNACEPTAR;
import static pages.PageVuelos.BTNPRECIOIDA;
import static pages.PageVuelos.BTNPRECIOVUELTA;
import static pages.PageVuelos.PRECIOIDA;
import static pages.PageVuelos.PRECIOVUELTA;

import interaction.ConvertirElPrecioMasAlto;
import interaction.ConvertirElPrecioMasBajo;
import models.GenerarString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarElPrecio implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {

           actor.attemptsTo(
			ConvertirElPrecioMasBajo.enMoneda(PRECIOIDA,BTNPRECIOIDA),
			ConvertirElPrecioMasAlto.enMoneda(PRECIOVUELTA,BTNPRECIOVUELTA),
			Click.on(BTNACEPTAR)
				);
		}
		
	public static BuscarElPrecio delViaje() {
		return Tasks.instrumented(BuscarElPrecio.class);
	}
}

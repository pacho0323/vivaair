package task;

import static models.IngresarFactura.factura;
import static pages.PageVuelos.FACTURA;
import static pages.PageVuelos.TOTAL;
import static pages.PageVuelos.TOTALNETO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ObtenerFactura implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		factura(FACTURA.resolveFor(actor).getText(),TOTAL.resolveFor(actor).getText(),TOTALNETO.resolveFor(actor).getText());
		}
		
	public static ObtenerFactura delVuelo() {
		return Tasks.instrumented(ObtenerFactura.class);
	}
}

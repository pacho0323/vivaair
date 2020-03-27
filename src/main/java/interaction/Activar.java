package interaction;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import pages.PageVuelos;

public class Activar implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {

		String name="noncoreIframe";
		BrowseTheWeb.as(actor).getDriver().switchTo().frame(name);
		actor.attemptsTo(Click.on(PageVuelos.BTNACEPTAR));
		BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
	}
	public static Activar boton() {
		return Tasks.instrumented(Activar.class);
	}

}
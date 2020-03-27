package interaction;

import static models.GenerarString.genero;
import static pages.PageVuelos.CONQUIENVA;
import static pages.PageVuelos.LISTACONQUIENVA;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class LlenarAcompanante implements Interaction{
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> listaElementos =CONQUIENVA.resolveAllFor(actor);
		Iterator<WebElementFacade> i =listaElementos.iterator();
	    int a=1;
	    while(a<=listaElementos.size()) {
	    	i.next().click();
	    	actor.attemptsTo(Click.on(LISTACONQUIENVA.of(genero())));
	    	a++;
	}
	}
		
	public static LlenarAcompanante enTabla() {
		return new LlenarAcompanante();
	}
}
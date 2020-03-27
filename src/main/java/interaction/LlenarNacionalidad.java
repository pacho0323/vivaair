package interaction;

import static pages.PageVuelos.LISTANACIONALIDAD;
import static pages.PageVuelos.NACIONALIDAD;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class LlenarNacionalidad implements Interaction{
	private String nacionalidad;
	public LlenarNacionalidad (String nacionalidad) {
	   this.nacionalidad=nacionalidad;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> listaElementos =NACIONALIDAD.resolveAllFor(actor);
		Iterator<WebElementFacade> i =listaElementos.iterator();
	    int a=1;
	    while(a<=listaElementos.size()) {
	    	i.next().click();
	    	actor.attemptsTo(Click.on(LISTANACIONALIDAD.of(nacionalidad)));
	    	a++;
	}
	}
		
	public static LlenarNacionalidad enTabla(String nacionalidad) {
		return new LlenarNacionalidad(nacionalidad);
	}
}


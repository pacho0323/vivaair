package interaction;

import static models.GenerarString.letra;
import static pages.PageVuelos.NOMBRES;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

	public class LlenarNombres implements Interaction{
		@Override
		public <T extends Actor> void performAs(T actor) {
			List<WebElementFacade> listaElementos =NOMBRES.resolveAllFor(actor);
			Iterator<WebElementFacade> i =listaElementos.iterator();
		    int a=1;
		    while(a<=listaElementos.size()) {
		    	i.next().sendKeys(letra());
		    	a++;
		}
		}
			
		public static LlenarNombres enTabla() {
			return new LlenarNombres();
		}

	}

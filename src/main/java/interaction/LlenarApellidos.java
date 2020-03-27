package interaction;



import java.util.Iterator;
import java.util.List;
import static models.GenerarString.letra;
import pages.PageVuelos;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class LlenarApellidos implements Interaction{
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> listaElementos =PageVuelos.APELLIDOS.resolveAllFor(actor);
		Iterator<WebElementFacade> i =listaElementos.iterator();
	    int a=1;
	    while(a<=listaElementos.size()) {
	    	i.next().sendKeys(letra());
	    	a++;
	}
	}
		
	public static LlenarApellidos enTabla() {
		return new LlenarApellidos();
	}

}

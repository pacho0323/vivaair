package interaction;

import static models.GenerarString.identificacion;
import static pages.PageVuelos.DOCUMENTO;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class LlenarDocumento implements Interaction{
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> listaElementos =DOCUMENTO.resolveAllFor(actor);
		Iterator<WebElementFacade> i =listaElementos.iterator();
	    int a=1;
	    while(a<=listaElementos.size()) {
	    	i.next().sendKeys(identificacion());
	    	a++;
	}
	}
		
	public static LlenarDocumento enTabla() {
		return new LlenarDocumento();
	}

}

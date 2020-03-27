package interaction;

import static pages.PageVuelos.CALENDARIO;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class LlenarCalendario implements Interaction{
	private String ninos;
	public LlenarCalendario(String ninos) {
		this.ninos=ninos;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> listaElementos =CALENDARIO.resolveAllFor(actor);
		Iterator<WebElementFacade> i =listaElementos.iterator();
	    int a=1;
	    int n=Integer.parseInt(ninos);
	    while(a<=listaElementos.size()) {
	    	if(a<=n) {	
	    		i.next().sendKeys("10/08/2015");
	    	}else {
	    		i.next().sendKeys("10/08/2017");
	    	}
	    	a++;
	}
	}
		
	public static LlenarCalendario enTabla(String ninos) {
		return new LlenarCalendario(ninos);
	}
}

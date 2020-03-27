package interaction;

import java.util.Iterator;
import java.util.List;

import models.TiempoDeEspera;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ConvertirElPrecioMasBajo implements Interaction {
	private Target precio;
	private Target listaprecio;
	private int posicion=0;
	public ConvertirElPrecioMasBajo(Target precio,Target listaprecio) {
		this.precio=precio;
		this.listaprecio=listaprecio;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		TiempoDeEspera.tiempo(5000);
		List<WebElementFacade> listaElementos =precio.resolveAllFor(actor);
		Iterator<WebElementFacade> i =listaElementos.iterator();	 
		int cont=0;
		int vaux=99999999;
		int s=0;
			while(i.hasNext()) {				
				s=Integer.parseInt(i.next().getText().replace(",", "").replace(".","").split(" ")[1]);
				if(vaux>s) {
                posicion=cont;
		}
				cont++;
			}
			actor.attemptsTo(Click.on(listaprecio.of(listaElementos.get(posicion).getText().split(" ")[1])));
		
	}
	public static ConvertirElPrecioMasBajo enMoneda(Target precio,Target listaprecio) {
		return new ConvertirElPrecioMasBajo(precio,listaprecio);
	}
}

package interaction;



import static pages.PageVuelos.ANO;
import static pages.PageVuelos.ANO1;
import static pages.PageVuelos.DIA;
import static pages.PageVuelos.DIA1;
import static pages.PageVuelos.MES;
import static pages.PageVuelos.MES1;
import static pages.PageVuelos.NEXT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;


public class Buscar implements Interaction {
	private String ano;
	private String mes;
	private String dia;
	public Buscar(String ano, String mes, String dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		boolean a=true;

		while(a){
			if(ANO.resolveFor(actor).getText().equals(ano)||ANO1.resolveFor(actor).getText().equals(ano)){
				while(a) {
					if(MES.resolveFor(actor).getText().equals(mes)||MES1.resolveFor(actor).getText().equals(mes)) {
						if(MES.resolveFor(actor).getText().equals(mes)) {
							actor.attemptsTo(Click.on(DIA.of(dia)));	
							a=false;	
						}else {
							actor.attemptsTo(Click.on(DIA1.of(dia)));	
							a=false;		
						}						
					}else {
						actor.attemptsTo(Click.on(NEXT));
					}
				}				
			}	
			else {
			actor.attemptsTo(Click.on(NEXT));
			}		
		}
	}
		
	public static Buscar laFecha(String ano, String mes, String dia) {
		return new Buscar(ano, mes, dia);
	}

}

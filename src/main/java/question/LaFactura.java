package question;

import static pages.PageVuelos.VERFACTURA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaFactura implements Question<String> {
	@Override
	public String answeredBy(Actor actor) {
        return Text.of(VERFACTURA).viewedBy(actor).asString().replaceAll("","");
		
	}
public static LaFactura es() {
	return new LaFactura();
}

}

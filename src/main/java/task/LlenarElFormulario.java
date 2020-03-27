package task;

import static pages.PageVuelos.BTNCONTINUAR;

import java.util.List;

import interaction.VerificarPapeles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LlenarElFormulario implements Task {
	private String correo;
	private String telefono;
	private String ninos;
	private String nacionalidad;
	private String numerodesagravio;

	public LlenarElFormulario(List<List<String>> datos) {
		this.ninos = datos.get(9).get(1);
		datos.get(10).get(1);
		this.correo = datos.get(12).get(1);
		this.telefono = datos.get(13).get(1);
		this.nacionalidad = datos.get(14).get(1);
		this.numerodesagravio = datos.get(15).get(1);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(VerificarPapeles.delPasajero(correo, telefono, ninos, nacionalidad, numerodesagravio),
				Click.on(BTNCONTINUAR));

	}

	public static LlenarElFormulario conLosDatos(List<List<String>> datos) {
		return Tasks.instrumented(LlenarElFormulario.class, datos);
	}
}

package interaction;

import static pages.PageVuelos.CORREO;
import static pages.PageVuelos.CORREO1;
import static pages.PageVuelos.NUMERODESAGRAVIO;
import static pages.PageVuelos.TELEFONO;
import static pages.PageVuelos.VERPASAPORTE;

import models.TiempoDeEspera;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

public class VerificarPapeles implements Interaction {
	private String correo;
	private String telefono;
	private String ninos;
	private String nacionalidad;
	private String numerodesagravio;
	public VerificarPapeles(String correo,String telefono, String ninos,String nacionalidad,String numerodesagravio) {
	   this.correo =correo;
	   this.telefono = telefono;
	   this.ninos=ninos;
	   this.nacionalidad=nacionalidad;
	   this.numerodesagravio=numerodesagravio;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
        if(VERPASAPORTE.resolveFor(actor).isVisible()) {
			actor.attemptsTo(LlenarNombres.enTabla(),
					LlenarApellidos.enTabla(),
					LlenarDocumento.enTabla(),
					LlenarGenero.enTabla(),
					Enter.theValue(numerodesagravio).into(NUMERODESAGRAVIO),
					LlenarNacionalidad.enTabla(nacionalidad),
					Enter.theValue(correo).into(CORREO),
					Enter.theValue(correo).into(CORREO1),
					Enter.theValue(telefono).into(TELEFONO),
					LlenarAcompanante.enTabla(),
					LlenarCalendario.enTabla(ninos)
					);
        }else {
			actor.attemptsTo(LlenarNombres.enTabla(),
					LlenarApellidos.enTabla(),
					LlenarDocumento.enTabla(),
					LlenarGenero.enTabla(),
					Enter.theValue(correo).into(CORREO),
					Enter.theValue(correo).into(CORREO1),
					Enter.theValue(telefono).into(TELEFONO),
					LlenarAcompanante.enTabla(),
					LlenarCalendario.enTabla(ninos)
					);
			
        }
        TiempoDeEspera.tiempo(7000);
	}
	public static VerificarPapeles  delPasajero(String correo,String telefono, String ninos,String nacionalidad,String numerodesagravio) {
		return new VerificarPapeles(correo,telefono,ninos,nacionalidad,numerodesagravio);
	}

}

package pages;

import net.serenitybdd.screenplay.targets.Target;

public class PageVuelos {
	private PageVuelos() {
		throw new IllegalStateException("PageVuelos");
	}
	public static final Target BTNCERRAR= Target.the("BOTON CERRAR").locatedBy("//div[@id=\"MessageTopBottomPart10013\"]/button");
	public static final Target RBDIDA= Target.the("RADIO BUTTON IDA").locatedBy("//span[.='Ida y Regreso']");
	public static final Target BTNLISTACIUDADESORIGEN= Target.the("BOTON DE LISTA CIUDADES ORIGEN").locatedBy("//span[@id=\"select2-chosen-20\"]");
	public static final Target CIUDADORIGEN= Target.the("CIUDAD ORIGEN").locatedBy("//ul[@id=\"select2-results-20\"]/li/div[.='{0}']");
	public static final Target BTNLISTACIUDADESDESTINO= Target.the("BOTON DE LISTA CIUDADES DESTINO").locatedBy("//div[@id=\"s2id_arrivalCityDrop\"]");
	public static final Target LISTA= Target.the("CIUDAD DESTINO").locatedBy("//ul[@class='select2-results']/li/div[.='{0}']");

	public static final Target CALENDARIOIDA= Target.the("CALENDARIO IDA").locatedBy("//div[@class=\"dateWrapper selectDestinationWrapper criteria-side-by-side-xs-sm\"]");
	public static final Target CALENDARIOVUELTA= Target.the("CALENDARIO VUELTA").locatedBy("//div[@id=\"flightCriteria-returndate-wrapper\"]");

	public static final Target ANO= Target.the("AÑO").locatedBy("//div[@class=\"ui-datepicker-group ui-datepicker-group-first\"]/div/div/span[2]");
	public static final Target MES= Target.the("MES").locatedBy("//div[@class=\"ui-datepicker-group ui-datepicker-group-first\"]/div/div/span[1]");
	public static final Target DIA= Target.the("DIA").locatedBy("//div[@class=\"ui-datepicker-group ui-datepicker-group-first\"]/table/tbody//td[.='{0}']");
	public static final Target NEXT= Target.the("BOTON NEXT").locatedBy("//a[@title=\"Next\"]");

	public static final Target ANO1= Target.the("AÑO").locatedBy("//div[@class=\"ui-datepicker-group ui-datepicker-group-last\"]/div/div/span[2]");
	public static final Target MES1= Target.the("MES").locatedBy("//div[@class=\"ui-datepicker-group ui-datepicker-group-last\"]/div/div/span[1]");
	public static final Target DIA1= Target.the("DIA").locatedBy("//div[@class=\"ui-datepicker-group ui-datepicker-group-last\"]/table/tbody//td[.='{0}']");
	public static final Target NEXT1= Target.the("BOTON NEXT").locatedBy("//a[@title=\"Next\"]");

	public static final Target ADULTOS= Target.the("ADULTOS").locatedBy("//div[@id=\"s2id_Adults\"]");
	public static final Target LISTADULTOS= Target.the("LISTA ADULTOS").locatedBy("//ul[@id=\"select2-results-22\"]/li/div[.='{0}']");
	public static final Target NINOS= Target.the("NIÑOS").locatedBy("//div[@id=\"s2id_Children\"]");
	public static final Target INFANTES= Target.the("INFANTES").locatedBy("//div[@class=\"infantsWrapper hidden-xs\"]");

	public static final Target MONEDA= Target.the("MONEDA").locatedBy("//div[@class=\"currencies currencyWrapper col-sm-6\"]");
	public static final Target LISTAMONEDA= Target.the("LISTA MONEDA").locatedBy("//ul[@class=\"select2-results\"]/li//div/span[.='{0}']");

	public static final Target BTNRESERVAR= Target.the("BOTON RESERVAR MI VUELO").locatedBy("//div[@class=\"searchButtonWrapper\"]");

	public static final Target DIAVUELOIDA =Target.the("DIA VUELO DE IDA").locatedBy("//div[@class=\"searchButtonWrapper\"]");
	public static final Target PRECIOIDA =Target.the("PRECIO IDA").locatedBy("//div[@id=\"divAvailabilityOut\"]/div/div/div[2]/label/div/div/div[3]/div/span[1]");
	public static final Target BTNPRECIOIDA =Target.the("BOTON PRECIO IDA").locatedBy("//div[@id=\"divAvailabilityOut\"]/div/div/div[2]/label/div/div/div[3]/div/span[1][contains(text(),'{0}')]");
	public static final Target PRECIOVUELTA =Target.the("PRECIO VUELTA").locatedBy("//div[@id=\"divAvailabilityIn\"]/div/div/div[2]/label/div/div/div[3]/div/span[1]");
	public static final Target BTNPRECIOVUELTA =Target.the("BOTON PRECIO VUELTA").locatedBy("//div[@id=\"divAvailabilityIn\"]/div/div/div[2]/label/div/div/div[3]/div/span[1][contains(text(),'{0}')]");
	public static final Target BTNACEPTAR =Target.the("BOTON ACEPTAR").locatedBy("//span[.='Acepto']");

	public static final Target NOMBRES =Target.the("NOMBRES").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/div[3]//input");
	public static final Target APELLIDOS =Target.the("APELLIDOS").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/div[4]//input");
	
	public static final Target DOCUMENTO =Target.the("DOCUMENTO").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/div[7][not(@style=\"display: none;\")]/input");

	public static final Target GENERO =Target.the("GENERO").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/div[5]/div/a");
	public static final Target LISTAGENERO =Target.the("LISTA GENERO").locatedBy("//ul[@class=\"select2-results\"]/li/div[.='{0}']");
	public static final Target CORREO =Target.the("CORREO").locatedBy("//input[@placeholder=\"Correo electrónico*\"]");
	public static final Target CORREO1 =Target.the("CORREO1").locatedBy("//input[@placeholder=\"Confirmar correo electrónico*\"]");
	public static final Target TELEFONO =Target.the("TELEFONO").locatedBy("//input[@id=\"Passengers0_mobile\"]");

	public static final Target CONQUIENVA =Target.the("CON QUIEN VA").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/div[6]/div/a");
	public static final Target LISTACONQUIENVA =Target.the("LISTA CON QUIEN VA").locatedBy("//ul[@class=\"select2-results\"]/li/div[.='Adulto 1']");

	public static final Target CALENDARIO =Target.the("CALENDARIO").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/fieldset/input[5]");
	public static final Target FACTURA =Target.the("FACTURA").locatedBy("//div[@class=\"basketFlight\"]");
	public static final Target TOTAL =Target.the("TOTAL").locatedBy("//div[@class=\"basketPayment\"]");
	public static final Target TOTALNETO =Target.the("TOTAL NETO").locatedBy("//div[@class=\"basketTotal\"]");
	public static final Target VERFACTURA =Target.the("VER FACTURA").locatedBy("//div[@class=\"full\"]");

	public static final Target BTNCONTINUAR =Target.the("BOTON CONTINUAR").locatedBy("//div[@class=\"mainButtonContainer\"]");
	
	public static final Target NUMERODESAGRAVIO =Target.the("NUMERO DE DESAGRAVIO").locatedBy("//input[@class=\"redressNumber\"]");
	public static final Target NACIONALIDAD =Target.the("NACIONALIDAD").locatedBy("//form[@id=\"passengerDetailsForm\"]/div/div/div/div[10]/div/fieldset/div/div");
	public static final Target LISTANACIONALIDAD =Target.the("LISTA NACIONALIDAD").locatedBy("//ul[@class=\"select2-results\"]/li/div[.='{0}']");
	public static final Target VERPASAPORTE =Target.the("VER PASAPORTE").locatedBy("//label[contains(text(),'Número del pasaporte*')]");

}

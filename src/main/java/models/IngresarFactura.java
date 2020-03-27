package models;

import java.io.FileWriter;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IngresarFactura {
	private static final Logger LOGGER=LogManager.getLogger(TiempoDeEspera.class.getClass());
	private IngresarFactura() {
		
	}
	public static void factura(String factura, String total,String totalneto) {
    try(FileWriter fichero = new FileWriter("factura.xls")){
    	java.util.Date fecha = new Date();
      fichero.write(factura + "\r\n" + total + "\r\n" + totalneto +"\r\n" + fecha);
    }catch(Exception e){
    	LOGGER.info(e);
    }finally {
    	LOGGER.info("Error");
    }
}
}
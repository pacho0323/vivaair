package models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TiempoDeEspera {
	private TiempoDeEspera() {
		
	}
	private static final Logger LOGGER=LogManager.getLogger(TiempoDeEspera.class.getClass());
	public static void tiempo(long milisegundos) {
		try {
			Thread.sleep(milisegundos);			
		} catch (InterruptedException e) {
			LOGGER.info(e);
			 Thread.currentThread().interrupt();
		}	
	}

}

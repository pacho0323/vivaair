package models;

import java.util.Random;

public class GenerarString {
	private GenerarString() {
		
	}
		public static String letra() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        float randomLimitedInt = leftLimit + 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	 return buffer.toString();
	}
		public static String genero() {
		String [] a= {"Femenino","Masculino"};
		int idx = new Random().nextInt(a.length);
		return (a[idx]);
	}
		public static String identificacion() {
			Random aleatorio = new Random(System.currentTimeMillis());
			int intAletorio = aleatorio.nextInt(10000000);
			 return String.valueOf(intAletorio);
		}
}


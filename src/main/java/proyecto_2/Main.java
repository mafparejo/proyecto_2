package proyecto_2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		
		Logger log = (Logger) Logger.getInstance(Main.class);
		BasicConfigurator.configure();
		Colegio c = new Colegio();
		int numero = c.getNumero(2);
		
		log.info("nivel info "+c.getNombre());
		log.info("nivel info "+ numero);
	}

}

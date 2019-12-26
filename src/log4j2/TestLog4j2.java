/**
 * 
 */
package log4j2;

import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file log4j2.TestLog4j2.java
 */
public class TestLog4j2 {
	private static final Logger LOGGER = LogManager.getLogger(TestLog4j2.class.getName());

	public static String retornaZeroNaFrente(int numero) {
		LOGGER.trace("iniciando o metodo retornaZeroNaFrente.");
		LOGGER.debug("iniciando o metodo retornaZeroNaFrente.");
		LOGGER.info("iniciando o metodo retornaZeroNaFrente.");
		LOGGER.warn("iniciando o metodo retornaZeroNaFrente.");
		LOGGER.error("iniciando o metodo retornaZeroNaFrente.");
		LOGGER.fatal("iniciando o metodo retornaZeroNaFrente.");

		String n = Integer.toString(numero);
		if (n.length() == 1) {
			n = "0" + n;
		}
		return n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.trace("iniciando o metodo main.");
		LOGGER.debug("iniciando o metodo main.");
		LOGGER.info("iniciando o metodo main.");
		LOGGER.warn("iniciando o metodo main.");
		LOGGER.error("iniciando o metodo main.");
		LOGGER.fatal("iniciando o metodo main.");

		System.out.println("Teste");
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		int num = 2;
		System.out.println("Numero: " + num + " :: " + retornaZeroNaFrente(num));
	}

}

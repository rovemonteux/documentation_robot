package cf.monteux.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import cf.monteux.documenter.Documenter;

public class ExceptionLogger {

	public static void log(Exception e) {
		Documenter.logger.severe("Error: "+e.getLocalizedMessage());
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		Documenter.logger.severe(sw.toString().trim());
		sw = null;
	}
	
}

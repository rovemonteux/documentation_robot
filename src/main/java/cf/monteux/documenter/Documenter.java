/*
 	Documentation Robot - Java package for helping automating the documentation of software projects.
 	Copyright (c) 2017 Rove Monteux
 
 	This file is part of Documentation Robot.
 	
 	This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/
package cf.monteux.documenter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Documenter {

	static final Logger logger;
	
	static {
        logger = Logger.getLogger(Documenter.class.getName());
    }
	
	public static void main(String[] args) {
		if (System.getProperty("java.util.logging.config.file") == null) {
            try {
                LogManager.getLogManager().readConfiguration(Documenter.class.getResourceAsStream("/log/logging.properties"));
            }
            catch (IOException | SecurityException e) {
                final Exception ex = e;
                System.err.println("LogManager configuration failed: " + ex);
            }
            catch (NullPointerException e) {
            	final Exception ex = e;
            	System.err.println("The default logging properties file, /log/logging.properties, is missing");
            }
        }
		Documenter documenter = new Documenter();
		try {
			documenter.process(args[0]);
		}
		catch (Exception e) {
			logger.severe("Error: "+e.getLocalizedMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			logger.severe(sw.toString().trim());
			sw = null;
			usage();
		}
	}
	
	public static void usage() {
		logger.info("Usage: Documenter <class file name>");
	}
	
	public void process(String className) {
		
	}

}

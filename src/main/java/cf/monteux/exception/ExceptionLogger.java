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

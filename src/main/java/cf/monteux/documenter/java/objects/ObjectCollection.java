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
package cf.monteux.documenter.java.objects;

import java.util.ArrayList;

public class ObjectCollection {

	private ArrayList<ClassObject> classes = new ArrayList<ClassObject>();
	
	public ObjectCollection() {
		
	}

	public ArrayList<ClassObject> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<ClassObject> classes) {
		this.classes = classes;
	}
	
}

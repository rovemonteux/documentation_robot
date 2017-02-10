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
package cf.monteux.documenter.java;

import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;

import cf.monteux.documenter.java.objects.ObjectCollection;

public class JarProcessor {

	private ObjectCollection objects = null;
	private String jarFileName = "";
	private JarFile jarFile = null;
	
	public JarProcessor(String jarFileName_, ObjectCollection objects_) throws IOException {
		this.setObjects(objects_);
		this.setJarFileName(jarFileName_);
		this.load();
	}
	
	public void load() throws IOException {
		this.setJarFile(new JarFile(new File(this.getJarFileName())));
	}

	public ObjectCollection getObjects() {
		return objects;
	}

	public void setObjects(ObjectCollection objects) {
		this.objects = objects;
	}

	public String getJarFileName() {
		return jarFileName;
	}

	public void setJarFileName(String jarFileName) {
		this.jarFileName = jarFileName;
	}

	public JarFile getJarFile() {
		return jarFile;
	}

	public void setJarFile(JarFile jarFile) {
		this.jarFile = jarFile;
	}
	
}

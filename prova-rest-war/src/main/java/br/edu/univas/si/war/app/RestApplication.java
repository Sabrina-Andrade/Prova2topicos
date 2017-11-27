package br.edu.univas.si.war.app;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.edu.univas.si.core.impl.ShoppingServiceImpl;



@ApplicationPath("/rest")
public class RestApplication extends Application {

	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ShoppingServiceImpl.class);
		return classes;
	}

}		
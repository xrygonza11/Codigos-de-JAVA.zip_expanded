package com.ipartek;

import java.util.ArrayList;
import java.util.List;

public class principalobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Alumno> listado= new ArrayList<Alumno>();
		Alumno al1= new Alumno("Ana");
		Alumno al2= new Alumno("jose");
		Alumno al3= new Alumno("patxi");
		
		listado.add(al1);
		listado.add(al1);
		listado.add(al1);
		listado.add(al1);
		
		listado.add(al2);
		listado.add(al3);
		
		for (Alumno alumno : listado) {
			System.out.println(alumno);
		}
		
		listado.get(0).setNombre("Ana gabriela");
		for (Alumno alumno : listado) {
			System.out.println(alumno);
		}
		
		al1.setNombre("josefina");
		for (Alumno alumno : listado) {
			System.out.println(alumno);
		}
		
	}

}

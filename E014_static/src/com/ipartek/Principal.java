package com.ipartek;

import com.ipartek.clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 10; i++) {
			Alumno a= new Alumno("alumno"+i, "apellidos"+i);
			
			System.out.println("new dentro del for: "+a.getContadorAlumnos());
		}
		
		Alumno.getContadorAlumnos();
		
		System.out.println("---------");
		
		Alumno b= new Alumno();
		for (int i = 0; i < 10; i++) {
			b.setNombre("alumno"+i);
			b.setApellidos("apellidos"+i);
			System.out.println("new fuera del for: "+b.getContadorAlumnos());
		}
	}

}

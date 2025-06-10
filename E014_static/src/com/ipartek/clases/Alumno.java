package com.ipartek.clases;

public class Alumno {
	
	
	private static int contadorAlumnos=0;
	private String nombre;
	private String apellidos;
	private int id;
	
	public Alumno(String nombre, String apellidos) {
		super();
		this.contadorAlumnos++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id=this.contadorAlumnos;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
		this.contadorAlumnos++;
		this.id=this.contadorAlumnos;
	}

	public static int getContadorAlumnos() {
		return contadorAlumnos;
	}

	public static void setContadorAlumnos(int contadorAlumnos) {
		Alumno.contadorAlumnos = contadorAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
 
	
	
	
	

}

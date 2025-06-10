package com.ipartek;

public class Alumno {
 
	
	private String nombre;

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Alumno() {
		super();
		this.nombre = "";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	
	
}

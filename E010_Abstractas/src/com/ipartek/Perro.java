package com.ipartek;

public  class Perro extends Mamifero {

	
	private String nombre;
	private String duenyo;
	private boolean pedigree;
	
	public Perro(String nombre, boolean estaExtinto, String colorPelo, String nombre2, String duenyo,
			boolean pedigree) {
		super(nombre, estaExtinto, colorPelo);
		nombre = nombre2;
		this.duenyo = duenyo;
		this.pedigree = pedigree;
	}
	
	public Perro() {
		super();
		this.nombre = "";
		this.duenyo = "";
		this.pedigree = false;
	}
	
	public Perro(String nombre, String duenyo, boolean pedigree) {
		super();
		this.nombre = nombre;
		this.duenyo = duenyo;
		this.pedigree = pedigree;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(String duenyo) {
		this.duenyo = duenyo;
	}

	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", duenyo=" + duenyo + ", pedigree=" + pedigree + "]";
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("soy un perro");
	}
	
	

}

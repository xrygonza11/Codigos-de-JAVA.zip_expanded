package com.ipartek;

public abstract class Mamifero extends Animal{
	

	private String colorPelo;
	
	public Mamifero(String nombre, boolean estaExtinto, String colorPelo) {
		super(nombre, estaExtinto);
		this.colorPelo = colorPelo;
	}
	
	public Mamifero() {
		super();
		this.colorPelo = "";
	}
	
	public Mamifero(String colorPelo) {
		super();
		this.colorPelo = colorPelo;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	

	

	
	
	
	

}

package com.ipartek;

public class Mamifero extends Animal{
	

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

	@Override
	public String toString() {
		return "Mamifero [colorPelo=" + colorPelo + "]";
	}
	
	public void saludar()
	{
		System.out.println("Hola, soy un Mamifero");
		
	}
	
	

}

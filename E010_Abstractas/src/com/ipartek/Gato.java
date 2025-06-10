package com.ipartek;

public class Gato extends Mamifero {

	private int numVidas;

	public Gato(String nombre, boolean estaExtinto, String colorPelo, int numVidas) {
		super(nombre, estaExtinto, colorPelo);
		this.numVidas = numVidas;
	}
	
	public Gato() {
		super();
		this.numVidas = 0;
	}
	public Gato( int numVidas) {
		super();
		this.numVidas = numVidas;
	}

	public int getNumVidas() {
		return numVidas;
	}

	public void setNumVidas(int numVidas) {
		this.numVidas = numVidas;
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		String hola="Hola soy un gato";
		System.out.println(hola);
	}
	
	
	
}

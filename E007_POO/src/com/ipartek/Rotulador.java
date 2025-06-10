package com.ipartek;

public class Rotulador {

	// atributos
	private String color;
	private boolean estaUsado;
	private double precio;
	private int anchoPunta;

	// Metodos

	// constructores
	public Rotulador(String color, boolean estaUsado, double precio, int anchoPunta) {
		this.color = color;
		this.estaUsado = estaUsado;
		this.precio = precio;
		this.anchoPunta = anchoPunta;
	}

	public Rotulador() {
		this.color = "";
		this.estaUsado = false;
		this.precio = 0.0;
		this.anchoPunta = 0;	
	}
	
	//getter y setter
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}

	public boolean getEstaUsado() {
		return this.estaUsado;
	}

	public void setEstaUsado(boolean estaUsado) {
		this.estaUsado = estaUsado;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnchoPunta() {
		return this.anchoPunta;
	}

	public void setAnchoPunta(int anchoPunta) {
		this.anchoPunta = anchoPunta;
	}

	@Override
	public String toString() {
		 return "rotulador color "+this.color+", punta de "
				 +this.anchoPunta+", vale "+this.precio+
				 ", esta usado= "+this.estaUsado;
	}
	
	
	
	

}

package com.ipartek;

public class Cuadro {

	private String titulo;
	private Autor autor;
	private TamanyoLienzo tamanyoLienzo;
	private int anyo;
	private boolean estaRestaurado;
	private double precio;

	public Cuadro(String titulo, Autor autor, TamanyoLienzo tamanyoLienzo, int anyo, boolean estaRestaurado,
			double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.tamanyoLienzo = tamanyoLienzo;
		this.anyo = anyo;
		this.estaRestaurado = estaRestaurado;
		this.precio = precio;
	}

	public Cuadro() {
		this.titulo = "";
		this.autor = new Autor();
		this.tamanyoLienzo = new TamanyoLienzo();
		this.anyo = 0;
		this.estaRestaurado = false;
		this.precio = 0.0;
	}

	public Cuadro(String titulo, String autor2, int altura, int anchura, int anyo2, boolean estaRestaurado2,
			double precio2) {
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public TamanyoLienzo getTamanyoLienzo() {
		return tamanyoLienzo;
	}

	public void setTamanyoLienzo(TamanyoLienzo tamanyoLienzo) {
		this.tamanyoLienzo = tamanyoLienzo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public boolean isEstaRestaurado() {
		return estaRestaurado;
	}

	public void setEstaRestaurado(boolean estaRestaurado) {
		this.estaRestaurado = estaRestaurado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cuadro de titulo=" + titulo + ", autor=" + autor + ", tamanyoLienzo=" + tamanyoLienzo + ", anyo=" + anyo
				+ ", estaRestaurado=" + estaRestaurado + ", precio=" + precio ;
	}
	
	

}

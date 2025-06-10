package com.ipartek;

public class Libro {

	private double precio;
	private String isbn;

	public Libro(double precio, String isbn) {
		super();
		this.precio = precio+ precio*0.1;
		this.isbn = isbn;
	}

	public Libro() {
		super();
		this.precio = 0.0;
		this.isbn = "";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	

}

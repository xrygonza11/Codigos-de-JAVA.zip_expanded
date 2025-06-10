package com.ipartek;

import java.util.List;

public class Comic extends Libro implements Producto  {

	private String autor;
	private String titulo;
	private int numPaginas;

	
	
	public Comic(double precio, String isbn, String autor, String titulo, int numPaginas) {
		super(precio, isbn);
		this.autor = autor;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
	}

	public Comic(String autor, String titulo, int numPaginas) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
	}

	public Comic() {
		super();
		this.autor = "";
		this.titulo = "";
		this.numPaginas = 0;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public void verDatosProducto() {
		// TODO Auto-generated method stub
		String datos = "";
		datos = "Comic: " + titulo + ", creado por: " + autor + ", de " + numPaginas + " paginas";
		System.out.println(datos);

	}

	@Override
	public void insertarComicEnLista( List<Comic> listado) {
		// TODO Auto-generated method stub
		 
	
		this.setPrecio(this.getPrecio()*1+((IVA_REDUCIDO/100.0f)));
		listado.add(0,this);
		System.out.println(listado.get(0).getPrecio());
		System.out.println(this.getPrecio());
		
		

	}


}

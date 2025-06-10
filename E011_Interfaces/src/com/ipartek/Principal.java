package com.ipartek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal  {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca el titulo del comic");
		String titulo="";
		titulo=sc.next();
		
		System.out.println("Por favor, introduzca el autor del comic");
		String autor="";
		autor=sc.next();
		
		System.out.println("Por favor, introduzca el numero de paginas del comic");
		int numPag=0;
		numPag=Integer.parseInt(sc.next());
		
		System.out.println("Por favor, introduzca el ISBN del comic");
		String isbn="";
		isbn=sc.next();
		
		System.out.println("Por favor, introduzca el precio del comic");
		double precio=0.0;
		precio=Double.parseDouble(sc.next());
		
		
		//crear comic con los datos obtenidos
		Comic comic= new Comic(precio, isbn, autor, titulo, numPag);
		
		
		//listado para meter los comics, aun vacio
		List<Comic> listado= new ArrayList<Comic>();
		
		//insertar el comic en la lista
		comic.insertarComicEnLista( listado);
		
		
		
		
	
	}

}

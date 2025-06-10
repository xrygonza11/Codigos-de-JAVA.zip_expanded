package com.ipartek;

import java.util.List;

public interface Producto {

	//no hacer esto a la hora de declarar constantes en una interfaz
//	private int contador;
//	public static final int contador2=0;
//	int contador3=0;
	
	int IVA_SUPER_REDUCIDO=4;
	double IVA_REDUCIDO=10;
	int IVA_NORMAL=20;
	
	///////////
	
	public void verDatosProducto();
	public void insertarComicEnLista(List<Comic> listado);
	
	
	
	
	
	
	

}

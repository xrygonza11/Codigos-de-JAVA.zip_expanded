package com.ipartek;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ejemplo de manejo de arrays con for
		
		//crear un array
//		int[] arrayTiradas= new int[5];
//		
//		System.out.println("mostramos los datos del array recien creado");
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(arrayTiradas[i]);
//		}
//		
//		for(int i=0;i<5;i++)
//		{
//			arrayTiradas[i]=0;
//		}
//		
//		System.out.println("mostramos los datos del array inicializado");
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(arrayTiradas[i]);
//		}
//		
//		//(int) (Math.random()*6 + 1) ;
//		System.out.println("sacar el array de los numeros");
//		for (int i = 0; i < arrayTiradas.length; i++) {
//			arrayTiradas[i]=(int) (Math.random()*6 + 1);
//			System.out.println(arrayTiradas[i]);
//		}
//		
//		
//		for (int i : arrayTiradas) {
//			System.out.println(i);
//		}
//		
//		
		
		final int SIETE=7;	
		for (int i = 0; i <= 10; i++) {
			System.out.println(i+"x"+SIETE+"="+(i*SIETE));	
		}
		
		System.out.println("_________");
		
		int i=0;
		while (i<=10) {	
			System.out.println(i+"x"+SIETE+"="+(i*SIETE));	
			i++;
		}
		System.out.println("_________");
		
		i=0;
		do {
			System.out.println(i+"x"+SIETE+"="+(i*SIETE));	
			i++;
		} while (i<=10);
		
		
		
		
	}

}

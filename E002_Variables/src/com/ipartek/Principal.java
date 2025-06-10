package com.ipartek;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		// Variables de tipo entero
		byte numeroPequenyoEntero = 0; // 1 byte
		short numeroMedianoEntero = 5435; // 2 byte
		int numeroEnteroEstandar = 5432765; // 4 byte
		long numeroGrandeEntero = 5000000000000L; // 8 byte

		// variables de tipo real
		float numeroDecimal = 0.0f; // 4 bytes
		double numeroDecimalGigante = 6.87; // 8 bytes

		// texto
		char letra = 'a'; // 2 bytes
		char otraLetra = 66;
		char letraUnicode = '\u0F54';

		String frase = "";

		// booleanas
		boolean estaVacia = true;
		boolean comprobar = false;

		System.out.println("Byte: " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MAX_VALUE);
		System.out.println("Integer: " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MAX_VALUE);
		System.out.println("Float: " + Float.MAX_VALUE);
		System.out.println("Double: " + Double.MAX_VALUE);

		// arrays
		int[] arrayNotas;// array de notas no inicializado
		int otroArray[]; // otra manera de indicar un array no inicializado

		int[] arrayCincoNotas = new int[5];// crea un array de 5 numeros enteros, iniciados a 0
		int[] arrayNotasAlain = { 3, 5, 6, 2, 0 };

		// acceso al primer elemento de un array, index 0
		System.out.println(arrayNotasAlain[0]);
		System.out.println(arrayNotasAlain[4]);
		System.out.println(arrayNotasAlain[5]);

	}

}

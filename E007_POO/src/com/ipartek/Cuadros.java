package com.ipartek;

import java.util.Scanner;

public class Cuadros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Crear cuadro? (si/no)");
		String opcion = scan.next();
		// Pongo 3 de momento porque 10 son demasiados para probar el ejercicio
		// Cuadro[] cuadro = new Cuadro[10];
		Cuadro[] cuadro = new Cuadro[3];

		String titulo;
		String autor;
		int altura;
		int anchura;
		int anyo;
		boolean estaRestaurado;
		double precio;

		int x = 0;

		if (opcion.equalsIgnoreCase("si")) {
			do {
				System.out.println("Introduce titulo: ");
				titulo = scan.next();
				
				System.out.println("Introduce autor: ");
				autor = scan.next();
				
				System.out.println("Introduce altura: ");
				altura = Integer.parseInt(scan.next());
				
				System.out.println("Introduce anchura: ");
				anchura = Integer.parseInt(scan.next());
				
				System.out.println("Introduce año: ");
				anyo = Integer.parseInt(scan.next());
				
				System.out.println("¿Está restaurado?: ");
				String opc = scan.next();
				if (opc.equalsIgnoreCase("si"))
					estaRestaurado = true;
				else
					estaRestaurado = false;

				System.out.println("Precio: ");
				precio = Double.parseDouble(scan.next());

				cuadro[x] = new Cuadro(titulo, autor, altura, anchura, anyo, estaRestaurado, precio);
				x++;

				if (x == cuadro.length)
					break;

				System.out.println("¿Crear otro? (si/no)");
				opcion = scan.next();

			} while (opcion.equalsIgnoreCase("si"));

			
			for (int i = 0; i < cuadro.length; i++) {
				
			}
			
			for (int i = 0; i < x; i++) {
				System.out.println("=========== [ Cuadro " + i + 1 + "] ===========");
				System.out.println(cuadro[i]);
				System.out.println("===========================================");
			}

		}

	}
}

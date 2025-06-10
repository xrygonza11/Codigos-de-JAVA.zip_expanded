package com.ipartek;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividendo = 0;
		int divisor = 0;
		int resultado = 0;

		// pedir variables por teclado,
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce el dividendo");
		try {
			dividendo = Integer.parseInt(sc.next());
			
		} catch (NumberFormatException e) {
			dividendo = Integer.parseInt(sc.next());
			
		} catch (Exception e) {
		System.out.println("Algo ha fallado");
		}

		System.out.println("introduce el divisor");
		divisor = Integer.parseInt(sc.next());

		System.out.println("los numero metidos son: " + dividendo + "," + divisor);

		// hacer la division y guardar en resultado
		try {
			resultado = dividendo / divisor;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("has dividido entre 0");
			do {
				System.out.println("introduce el divisor");
				divisor = Integer.parseInt(sc.next());
			} while (divisor == 0);
			resultado = dividendo / divisor;
			
			

		} catch (Exception e) {
			System.out.println("Algo fallo");

		}
		System.out.println("los numero metidos son: " + dividendo + "," + divisor);
		System.out.println("el resultado es: " + resultado);
		// mostrar resultado por pantalla

		// comprobar que no de errores

	}

}

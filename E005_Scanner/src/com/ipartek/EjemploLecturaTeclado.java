package com.ipartek;

import java.util.Scanner;

public class EjemploLecturaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIANDO PROGRAMA");

		System.out.println("Por favor, introduzca por teclado el numero de su dni sin letra");
		Scanner sc1 = new Scanner(System.in);
		int numero = Integer.parseInt(sc1.nextLine());
		System.out.println("has metido el numero" + numero);

		System.out.println("Por favor, introduzca por teclado su nombre");
		Scanner sc2 = new Scanner(System.in);
		String nombre = sc2.nextLine();
		System.out.println("has metido el nombre" + nombre);

		System.out.println("Por favor, introduzca la cantidad de su deuda");
		Scanner sc3 = new Scanner(System.in);
		double deuda = Double.parseDouble(sc3.nextLine());
		System.out.println("has metido la deuda " + deuda);

//		sc.close();

	}

}

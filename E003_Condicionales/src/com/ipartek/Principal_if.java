package com.ipartek;

public class Principal_if {

	public static void main(String[] args) {

		int num1 = 52;
		int num2 = 42;
		int num3 = 6;

		// ifs basicos
		if (num1 > num2) {
			System.out.println("if basico: 52 es mayor que 42");
		}

		if (num2 > num1) {
			System.out.println("if basico: 42 es mayor que 52");
		}

		// if nivel medio
		if (num1 > num3) {
			System.out.println("if medio: 52 es mayor que 6");
		} else {
			System.out.println("if medio: 52 NO es mayor que 6");
		}

		// if anidados
		if (num3 == 1) {
			System.out.println("if anidado: el num3 vale 1");
		} else {
			if (num3 == 2) {
				System.out.println("if anidado: el num3 vale 2");
			} else {
				if (num3 == 3) {
					System.out.println("if anidado: el num3 vale 3");
				} else {
					if (num3 == 4) {
						System.out.println("if anidado: el num3 vale 4");
					} else {
						if (num3 == 5) {
							System.out.println("if anidado: el num3 vale 5");
						} else {
							if (num3 == 6) {
								System.out.println("if anidado: el num3 vale 6");
							} else {
								System.out.println("if anidado: no esta entre el 1 y el 6");
							}
						}
					}
				}
			}
		}

		if (num3 == 1) {
			System.out.println("if anidado2: el num3 vale 1");
		} else if (num3 == 2) {
			System.out.println("if anidado2: el num3 vale 2");
		} else if (num3 == 3) {
			System.out.println("if anidado2: el num3 vale 3");
		} else if (num3 == 4) {
			System.out.println("if anidado2: el num3 vale 4");
		} else if (num3 == 5) {
			System.out.println("if anidado2: el num3 vale 5");
		} else if (num3 == 6) {
			System.out.println("if anidado2: el num3 vale 6");
		} else {
			System.out.println("if anidado2: el num3 no es del 1 al 6");
		}

		if (num3 == 1)
			System.out.println("if anidado2: el num3 vale 1");
		else if (num3 == 2)
			System.out.println("if anidado2: el num3 vale 2");
		else if (num3 == 3)
			System.out.println("if anidado2: el num3 vale 3");
		else if (num3 == 4)
			System.out.println("if anidado2: el num3 vale 4");
		else if (num3 == 5)
			System.out.println("if anidado2: el num3 vale 5");
		else if (num3 == 6)
			System.out.println("if anidado2: el num3 vale 6");
		else
			System.out.println("if anidado2: el num3 no es del 1 al 6");

	}
}

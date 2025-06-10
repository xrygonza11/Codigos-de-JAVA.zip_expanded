package com.ipartek;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		Rotulador rotuVerde = new Rotulador();
		Rotulador rotuAzul = new Rotulador("Azul", true, 2.33, 2);
		
		System.out.println("introduce el color:");
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		
		System.out.println("introduce si esta usado: (si o no)");
		String tempUsado = sc.next();
		boolean estaUsado=true;
		if (tempUsado=="si" || tempUsado.equals("Si")) {
			estaUsado = true;
		} else if (tempUsado.equals("no") || tempUsado.equals("No")) {
			estaUsado = false;
		}
		
		System.out.println("introduce el precio del rotulador");
		double precio=Double.parseDouble(sc.next());
		
		System.out.println("introduce el ancho de la punta");
		int anchoPunta=Integer.parseInt(sc.next());
		
		
		//rellenar el objeto usando el vacio
		Rotulador rotuUsandoConstructorVacio= new Rotulador();
		rotuUsandoConstructorVacio.setColor(color);
		rotuUsandoConstructorVacio.setEstaUsado(estaUsado);
		rotuUsandoConstructorVacio.setPrecio(precio);
		rotuUsandoConstructorVacio.setAnchoPunta(anchoPunta);
		
		//rellenar usando constructor completo
		Rotulador rotuUsandoConsttructorCompleto= new Rotulador(color, estaUsado, precio, anchoPunta);
		
		
		
	}

}

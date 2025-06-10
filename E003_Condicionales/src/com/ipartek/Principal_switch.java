package com.ipartek;

public class Principal_switch {

	public static void main(String[] args) {
		
		
		//switch con enteros
		int opcion=3;
		switch(opcion)
		{
			case 1: System.out.println("ha salido un 1");break;
			case 2: System.out.println("ha salido un 2");break;
			case 3: System.out.println("ha salido un 3");break;
			case 4: System.out.println("ha salido un 4");break;
			case 5: System.out.println("ha salido un 5");break;
			case 6: System.out.println("ha salido un 6");break;
		}
		
		
		char opcionLetra='G';
		switch(opcionLetra) 
		{
			case 'A':	
			case 'a':System.out.println("Ha salido la letra A");break;
			case 'B':
			case 'b':System.out.println("Ha salido la letra B");break;
			case 'C':
			case 'c':System.out.println("Ha salido la letra C");break;
			case 'D':
			case 'd':System.out.println("Ha salido la letra D");break;
			default:System.out.println("NO ES A,B,C,D");
		}
		
		String opcionString="Hola";
		switch (opcionString) {
			case "Holaa":System.out.println("Holaa");break;
			case "hola":System.out.println("hola");break;
			case "Hoola":System.out.println("Hoola");break;
			case "Hola":System.out.println("Hola");break;
			default:System.out.println("no lo encontro");break;	
		}
	
		//no se puede hacer un switch de numeros reales
//		float opcionReal=4.0f;
//		switch (opcionReal) {
//			case 1.0:System.out.println("es 1");break;
//			case 2.0:System.out.println("es 2");break;
//			default:System.out.println("no lo encontro");break;	
//		}
		
	}

}

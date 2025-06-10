package com.ipartek;

public class Principal {

	public static void main(String[] args) {
		
		
		Animal[] arrayAnimales= new Animal[5];
		
		Animal animalBasico= new Animal("Corvus corax", false);
		Mamifero mamiferoBasico= new Mamifero("negro");
		Mamifero mamiferoAvanzado= new Mamifero("canis lupus", false, "gris");
		Perro perroCompleto= new Perro("canis lupus familiaris", false, "canela", "Lagun", "pepe", true);
		Perro perroVacio = new Perro();
		
		arrayAnimales[0]=animalBasico;
		arrayAnimales[1]=mamiferoBasico;
		arrayAnimales[2]=mamiferoAvanzado;
		arrayAnimales[3]=perroCompleto;
		arrayAnimales[4]=perroVacio;
		
		for (Animal animal : arrayAnimales) {
			animal.saludar();
		}
		
		System.out.println("--------------");
		
		for (Animal animal : arrayAnimales) {
			if (animal instanceof Animal) {
				System.out.println("intancia de animal");
			} 
			
			if (animal instanceof Mamifero) {
				System.out.println("intancia de mamifero");
			} 
			
			if (animal instanceof Perro) {
				System.out.println("intancia de perro");		
			} 
			
			System.out.println("=-=-=");
		}
		
	}

}

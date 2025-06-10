package com.ipartek;



public class Principal {

	public static void main(String[] args) {

		Animal[] arrayAnimales = new Animal[5];

		//no se puede hacer objetos de animal por ser abstracta
		//Animal animalBasico = new Animal("Corvus corax", false);
		
		//no se puede hacer objetos de Mamifero por ser abstracta
		//Mamifero mamiferoBasico = new Mamifero("negro");
		
		//Mamifero mamiferoAvanzado = new Mamifero("canis lupus", false, "gris");
		Perro perroCompleto = new Perro("canis lupus familiaris", false, "canela", "Lagun", "pepe", true);
		Perro perroVacio = new Perro();

		Gato gato = new Gato();
//		arrayAnimales[0] = animalBasico;
//		arrayAnimales[1] = mamiferoBasico;
//		arrayAnimales[2] = mamiferoAvanzado;
		arrayAnimales[3] = perroCompleto;
		arrayAnimales[4] = perroVacio;
		

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

//			if (animal instanceof Perro) {
//				System.out.println("intancia de perro");
//			}

			System.out.println("=-=-=");
		}

//		Animal a = new Animal();
//		Animal b = new Mamifero();
		Animal c = new Perro();
		Animal d = new Gato();

		// Mamifero e= new Animal();
//		Mamifero f = new Mamifero();
		Mamifero g = new Perro();
		Mamifero h = new Gato();
		
		
		Perro lagun = new Perro();
		//Perro j = new Gato();
		//Perro k= (Perro) new Gato();
		
		//Gato m=(Gato)lagun;
	}

}

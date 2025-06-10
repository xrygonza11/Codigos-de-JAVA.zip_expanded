package com.ipartek;




public class Principal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cuatro=4;
		int cinco=5;
		int numeroSuma=sumarDosNumeros(cuatro, cinco);
		System.out.println(numeroSuma);
		
		sumarNumerosNoDevuelve(6, 1);
		
		System.out.println(sumarNumerosRandom());
		MostrarNumerosRandom();
		
	}

	public static int sumarDosNumeros(int numero1, int numero2) 
	{
		int resultado= numero1+numero2;	
		numero1=0;
		numero2=0;
		return resultado;
	}
	
	public static void sumarNumerosNoDevuelve(int numero1, int numero2)
	{
		int resultado= numero1+numero2;	
		System.out.println(resultado);
	}
	
	public static int sumarNumerosRandom()
	{
		int numeroAzar1=(int) (Math.random()*6+1);
		int numeroAzar2=(int) (Math.random()*6+1);
		
		return numeroAzar1+numeroAzar2;
	}
	
	public static void MostrarNumerosRandom()
	{
		int numeroAzar1=(int) (Math.random()*6+1);
		System.out.println(numeroAzar1);
	
	}

	
}

package com.ipartek;

public class PrincipalWhile {

	public static void main(String[] args) {
		
		int numeroAleatorio=(int)(Math.random()*10 + 1);
		while(numeroAleatorio!=7)
		{
			System.out.println(numeroAleatorio);
			numeroAleatorio=(int)(Math.random()*10 + 1);
		}
		

	}

}

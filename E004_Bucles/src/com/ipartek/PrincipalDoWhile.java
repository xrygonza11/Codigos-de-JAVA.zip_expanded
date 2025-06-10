package com.ipartek;

public class PrincipalDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numeroAleatorio=0;
		do {
			numeroAleatorio=(int)(Math.random()*10 + 1);
			System.out.println(numeroAleatorio);	
		}while(numeroAleatorio!=7);
		
		
		
	}

}

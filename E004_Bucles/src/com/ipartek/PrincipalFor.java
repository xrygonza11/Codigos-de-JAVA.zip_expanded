package com.ipartek;

public class PrincipalFor {

	public static void main(String[] args) {
		
		//empiezo a contar en 0, hago 5 pasadas
		for(int i=0;i<5;i++)
		{
			System.out.println("For: pasada numero"+i );
		}
		
		//empiezo a contar en 0, hago 6 pasadas porque incluyo el 5
		for(int i=0;i<=5;i++)
		{
			System.out.println("For: pasada numero"+i );
		}	
	}
}

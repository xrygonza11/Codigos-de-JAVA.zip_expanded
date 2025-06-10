package com.ipartek;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listaNotas= new ArrayList<Integer>();
		
		listaNotas.add(7);
		listaNotas.add(8);
		listaNotas.add(5);
		listaNotas.add(3,10);
		listaNotas.add(0,0);
		
		
		
		for (Integer nota : listaNotas) {
			System.out.println(nota);
		}
		System.out.println("==================");
		
		
		listaNotas.remove(1);
		listaNotas.remove((Object)"hola");
		
	
		
		for (Integer nota : listaNotas) {
			System.out.println(nota);
		}
	}

}

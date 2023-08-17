package br.com.lojavirtual;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
          List<Carro> carros = new ArrayList<>();
          carros.add( new Actros());
          carros.add( new FH ());
          carros.add( new Scania());
          imprimirCarros(carros);
		
	}
	      public static void imprimirCarros(List<Carro> carros) {
	    	  for (Carro carro : carros) {
	    		  System.out.println(carro.combustao());
	    	  }
	      }
	
	
	    
}

package entities;

import java.util.Scanner;

public class Rectangle {
		private Scanner sc;

		public void calcular() {
			double base;
			double altura;
			sc = new Scanner(System.in);
		
		
			System.out.println("Digite Respectivamente a Base e a Altura do retangulo:");
			base = sc.nextDouble();
			altura = sc.nextDouble();
	   
	    
			
			System.out.println("Area: "+(base * altura));
			System.out.println("Perimetro: "+(base + altura));
	        
	        
		}
	}


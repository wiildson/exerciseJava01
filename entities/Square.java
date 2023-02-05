package entities;

import java.util.Scanner;

public class Square {
	
	private static Scanner sc;

	public void calcular() {
	double lado;
	sc = new Scanner(System.in);
	
	System.out.println("Digite a medida do lado do quadrado:");
	lado = sc.nextDouble();
	
	
	
	System.out.println("Area: "+(lado*lado));
	System.out.println("Perimetro: "+(lado*4));



}
}
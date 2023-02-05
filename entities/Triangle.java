package entities;

import java.util.Scanner;

public class Triangle {
	private Scanner sc;

	public void calcular() {
	double lado;
	double base;
	double altura;
	sc = new Scanner(System.in);
	
	System.out.println("Digite Respectivamente o Lado, a Base e a Altura do triangulo:");
	lado = sc.nextDouble();
	base = sc.nextDouble();
	altura = sc.nextDouble();
	
	
	System.out.println("Area: "+((base*altura/2)));
	System.out.println("Perimetro: "+(lado*3));

}
}
package entities;

import java.util.Scanner;

public class Circle {
		private Scanner sc;
	
			public void calcular() {
				double diametro;
				
				sc = new Scanner(System.in);
			
					System.out.println("Digite o Diametro do círculo:");
					diametro = sc.nextDouble();
					double raio = diametro/2;
			
			
						System.out.println("Area: "+(3.14*(raio*raio)));
						System.out.println("Perimetro: "+(2*3.14*raio));
			
		
}
}

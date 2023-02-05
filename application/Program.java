/*
 Desenvolva um algorítimo que calcule a área e o perímetro de um:
 -Quadrado
 -Triangulo
 -Retangulo
 -Circulo
 */


package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Square;
import entities.Triangle;

public class Program {
	
    public static int esc;

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
     

        
       
       
        System.out.println("MENU PRINCIPAL\n\n");
        
        System.out.println("1- RETANGULO\n");
        System.out.println("2- TRIANGULO\n");
        System.out.println("3- QUADRADO\n");
        System.out.println("4- CIRCULO\n\n");
        System.out.println("DIGITE A OPÇÃO ESCOLHIDA:");
        esc = sc.nextInt();
              
        switch(esc) {
        
        case 1: 
        	Rectangle r = new Rectangle ();
        	r.calcular();
        case 2:
        	Circle c = new Circle();
        	c.calcular();
        case 3:
        	Triangle t = new Triangle ();
        	t.calcular();
        case 4:
        	Square s = new Square();
        	s.calcular();
        }
       
        sc.close();
    }
}
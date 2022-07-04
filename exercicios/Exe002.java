package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		 /* Exercicio 02
		    *  Faça um programa para ler o valor do raio de um círculo, e depois mostrar
		    *  o valor da área deste círculo com quatro casas decimais.
		    *  
			*  Fórmula da área: area = π . raio2
			*  Considere o valor de π = 3.14159
		    */
		   
		System.out.println("Informe o valor do raio:");
		double raio = leia.nextDouble();
		
		double PI = 3.14159;
		double area = PI * Math.pow(raio, 2);
		
		System.out.printf("Area = %.4f\n ",area);
		
		leia.close();

	}

}

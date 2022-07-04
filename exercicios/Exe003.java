package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		/*Exercicio 03
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 *  segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		System.out.println("Informa 4 valores inteiros:");
		int A = leia.nextInt();
		int B = leia.nextInt();
		int C = leia.nextInt();
		int D = leia.nextInt();
		
		int DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENÇA = "+ DIFERENCA);
		
		leia.close();

	}

}

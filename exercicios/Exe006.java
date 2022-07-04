package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		/*
		 *  Fazer um programa para ler o código de uma peça 1, o número de peças 1,
		 *  o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
		 *  e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		System.out.println("informe o código da peça:");
		int codigoPeca1 = leia.nextInt();
		
		System.out.println("Informe a quantidade de peças:");
		int quantidadePeca1 = leia.nextInt();
		
		System.out.println("Informe o valor da peça:");
		double valorPeca1 = leia.nextDouble();
		
		System.out.println("informe o código da 2ª peça:");
		int codigoPeca2 = leia.nextInt();
		
		System.out.println("Informe a quantidade de peças:");
		int quantidadePeca2 = leia.nextInt();
		
		System.out.println("Informe o valor da peça:");
		double valorPeca2 = leia.nextDouble();
		
		double totalDevido = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		
		System.out.printf("Valor a pagar: R$ %.2f\n",totalDevido );
		
		
		leia.close();

	}

}

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		/*
		 *  Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
		 *  o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 
		 *  e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		
		System.out.println("informe o c�digo da pe�a:");
		int codigoPeca1 = leia.nextInt();
		
		System.out.println("Informe a quantidade de pe�as:");
		int quantidadePeca1 = leia.nextInt();
		
		System.out.println("Informe o valor da pe�a:");
		double valorPeca1 = leia.nextDouble();
		
		System.out.println("informe o c�digo da 2� pe�a:");
		int codigoPeca2 = leia.nextInt();
		
		System.out.println("Informe a quantidade de pe�as:");
		int quantidadePeca2 = leia.nextInt();
		
		System.out.println("Informe o valor da pe�a:");
		double valorPeca2 = leia.nextDouble();
		
		double totalDevido = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		
		System.out.printf("Valor a pagar: R$ %.2f\n",totalDevido );
		
		
		leia.close();

	}

}

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe001 {

	public static void main(String[] args) {
		
	   Locale.setDefault(Locale.US);
	   Scanner leia = new Scanner(System.in);
	   
		/* Exercício 01
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa.
		 * 
		 */
	    
	   System.out.println("Informe dois valores inteiros:");
	   int v1 = leia.nextInt();
	   int v2 = leia.nextInt();
	   
	   int soma = v1 + v2;
	   System.out.println("SOMA = "+soma);
	   
	  
	   
	   leia.close();

	}

}

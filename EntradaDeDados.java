import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		/*
		 * ATENÇÃO: Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
         * Locale.setDefault(Locale.US);
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//Para ler uma palavra (texto sem espaços)		
		String palavra = leia.next();
		System.out.println("Você digitou a palavra -> "+palavra);
		
		//Para ler um número inteiro
		int num = leia.nextInt();
		System.out.println("Você digitou o número -> "+num);
		
		//Para ler um número com ponto flutuante
		double num2 = leia.nextDouble();
		System.out.println("Você digitou o numero -> "+num2);
		
		
		//Para ler um caractere
		char letra = leia.next().charAt(0);
		System.out.println("Você digitou a letra -> "+letra);
		
		
		
		
		
		leia.close();

	}

}


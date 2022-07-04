import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		/*
		 * ATEN��O: Para considerar o separador de decimais como ponto, ANTES da declara��o do Scanner, fa�a:
         * Locale.setDefault(Locale.US);
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//Para ler uma palavra (texto sem espa�os)		
		String palavra = leia.next();
		System.out.println("Voc� digitou a palavra -> "+palavra);
		
		//Para ler um n�mero inteiro
		int num = leia.nextInt();
		System.out.println("Voc� digitou o n�mero -> "+num);
		
		//Para ler um n�mero com ponto flutuante
		double num2 = leia.nextDouble();
		System.out.println("Voc� digitou o numero -> "+num2);
		
		
		//Para ler um caractere
		char letra = leia.next().charAt(0);
		System.out.println("Voc� digitou a letra -> "+letra);
		
		
		
		
		
		leia.close();

	}

}


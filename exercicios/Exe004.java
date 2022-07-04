package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe004 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	/*
	 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas,
	 *  o valor que recebe por hora e calcula o sal�rio desse funcion�rio.
	 *  A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
	 */
	
	System.out.println("Informe o ID do funcion�rio:");
	int id = leia.nextInt();
	
	System.out.println("Informe o total de horas trabalhadas:");
	int totalHorasTrabalhadas = leia.nextInt();
	
	System.out.println("Qual � o valor da hora trabalhada?");
	double valorHoraTrabalhada = leia.nextDouble();
	
	double salario = (totalHorasTrabalhadas * valorHoraTrabalhada);
	System.out.printf("Funcion�rio id %d\n", id);
	System.out.printf("Sal�rio R$ %.2f\n",salario);
	
	leia.close();

	}

}

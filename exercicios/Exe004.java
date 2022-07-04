package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe004 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
	 *  o valor que recebe por hora e calcula o salário desse funcionário.
	 *  A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
	 */
	
	System.out.println("Informe o ID do funcionário:");
	int id = leia.nextInt();
	
	System.out.println("Informe o total de horas trabalhadas:");
	int totalHorasTrabalhadas = leia.nextInt();
	
	System.out.println("Qual é o valor da hora trabalhada?");
	double valorHoraTrabalhada = leia.nextDouble();
	
	double salario = (totalHorasTrabalhadas * valorHoraTrabalhada);
	System.out.printf("Funcionário id %d\n", id);
	System.out.printf("Salário R$ %.2f\n",salario);
	
	leia.close();

	}

}

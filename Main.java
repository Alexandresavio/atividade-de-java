
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		System.out.println("Bom dia!");
		
		//Para escrever o conteúdo de uma variavel de tipo inteiro
		
		int y = 32;
		System.out.println(y);
		
		//Para escrever o conteúdo de uma variavel de tipo inteiro
		double x = 10.35784;
		System.out.println(x);
		
		//Para controlar o número de casas decimais
		System.out.printf("%.2f \n", x);
		System.out.printf("%.4f \n", x);
		
		//Para concatenar varios elementos em um mesmo comando de escrita
		System.out.println("Resultado = " + x + " metros.");
		System.out.printf("Resultado = %.2f metros.\n", x);
		
		//Para mostrar varios valores interpolados dentro de uma string
		String nome = "Maria";
		int idade = 40;
		double salario = 4000;
		System.out.printf("%s tem %d anos e ganha um salario de R$%.2f reais.\n",nome, idade, salario );
		
		
		

	}

}

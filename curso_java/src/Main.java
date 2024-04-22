import java.util.Locale;
import java.util.Scanner;

/*
//Faça um programa para ler dois valores inteiros,
//e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos. 1-2
class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int z = sc.nextInt();
		
		sc.close();
		
		int total = x + z;
		
		
		
		System.out.println("A soma dos mesmos é: " + total);

		

	}

}
*/



/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

/*

class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
		Scanner sc = new Scanner(System.in);
		
		
		double raio = sc.nextDouble();

		sc.close();
		
		double pi = 3.14159;
		double area =  pi * (raio*raio);
		
		System.out.printf("A aréa é: %.4f", area);


	}

}

*/


/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
/*

class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		sc.close();
		
		double dif = (double) (A*B - C*D);
		
		System.out.println("Diferença: " + dif);
		

	}

}
*/

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

*Entrada: Saída:
25
100
5.50

Saída:
NUMBER = 25
SALARY = U$ 550.00

*/
class Main {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idFunc = sc.nextInt();
		int horas = sc.nextInt();
		double salarioHora = sc.nextDouble();
		
		sc.close();
		
		double salario = horas * salarioHora;
		
		System.out.printf("O salario do funcionario %d é %.2f", idFunc, salario);
		
		
		
	}
}

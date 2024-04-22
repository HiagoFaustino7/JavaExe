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

/*
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
*/

/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		sc.close();
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("TRIANGULO = %.3f\n", triangulo);
		System.out.printf("CIRCULO = %.3f\n", circulo);
		System.out.printf("TRAPEZIO = %.3f\n", trapezio);
		System.out.printf("QUADRADO = %.3f\n", quadrado);
		System.out.printf("RETANGULO = %.3f", retangulo);
		
		
	}
}



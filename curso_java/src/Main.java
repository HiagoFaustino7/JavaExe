import java.util.Locale;
import java.util.Scanner;


//Faça um programa para ler dois valores inteiros,
//e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos. 1-
class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		int total = x + y;
		
		
		System.out.println("A soma dos mesmos é: " + total);

		

	}

}


package proa;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Digite seu nome: ");
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("Olá! "+ nome);

		entrada.close();
	}
	
}

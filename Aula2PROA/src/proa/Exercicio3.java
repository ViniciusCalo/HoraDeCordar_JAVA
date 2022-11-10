package proa;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		System.out.println("Digite seu nome: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Olá! " + nome + " sua idade é: "+ idade + " anos.");
		
		
		entrada.close();
		}
	
}

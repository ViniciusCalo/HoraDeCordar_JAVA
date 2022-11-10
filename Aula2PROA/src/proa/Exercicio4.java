package proa;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Escolha uma opção: \n 1- retangulo \n 2- Quadrado \n 3- losango"
				+ "\n 4- trapezio \n 5- paralelogramo \n 6- triangulo \n 7- circulo"
				+ " \n 8- Sair");
		
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		

			switch(opcao) {
			case 1:
				System.out.println("--------------RETANGULO--------------");
				System.out.println("Digite o valor da base do retangulo: ");
				int base = entrada.nextInt();
				
				System.out.println("Digite o valor da altura do retangulo: ");
				int altura = entrada.nextInt();
				
				double areaRet = base * altura;
				System.out.println("A area do retângulo é igual a: " + areaRet);
				break;
			case 2:
				System.out.println("--------------QUADRADO--------------");
				System.out.println("Digite o valor do lado do quadrado: ");
				int lado = entrada.nextInt();
				
				double areaQuad = Math.pow(lado,2);
				System.out.println("A area do quadrado é igual a: " + areaQuad);
				break;
				
			case 3:
				System.out.println("--------------LOSANGO--------------");
				System.out.println("Digite o valor da diagonal maior: ");
				int diagMaior = entrada.nextInt();
				
				System.out.println("Dgite o valor da diagonal menor: ");
				int diagMenor = entrada.nextInt();
				
				double areaLos = (diagMaior * diagMenor) / 2;
				System.out.println("A area do losango é igual a: " + areaLos);
				break;
			case 4:
				System.out.println("--------------TRAPÉZIO--------------");
				System.out.println("Informe o valor da base maior");
			    int base_maior = entrada.nextInt();
			    
			    System.out.println("Informe o valor da base menor");
			    int base_menor = entrada.nextInt();

			    System.out.println("Informe o valor da altura");
			    int alturaTrapezio = entrada.nextInt();
			    
			    System.out.println("O valor da area do trapezio é " + ((base_maior + base_menor)*alturaTrapezio)/2);
			    break;
			case 5:
				System.out.println("--------------PARALELOGRAMO--------------");
				System.out.println("Digite o valor da base do paralelogramo: ");
				int basePar = entrada.nextInt();
				
				System.out.println("Digite o valor da altura do paralelogramo: ");
				int alturaPar = entrada.nextInt();
				
				double areaPar = basePar * alturaPar;
				System.out.println("A area do paralelogramo é igual a: " + areaPar);
				break;
			case 6:
				System.out.println("--------------TRIANGULO--------------");
				System.out.println("Digite o valor da base do triangulo: ");
				int baseTri = entrada.nextInt();
				
				System.out.println("Digite o valor da altura do triangulo: ");
				int alturaTri = entrada.nextInt();
				
				double areaTri = (baseTri * alturaTri)/2;
				System.out.println("A area do triangulo é igual a: " + areaTri);
				break;
			case 7:
				System.out.println("--------------CIRCULO--------------");
				System.out.println("Digite o raio do circulo: ");
				
				double raio = entrada.nextDouble();
				
				double areaDb = Math.PI * Math.pow(raio, 2);
				
				System.out.println("A area do circulo é igual a: " + areaDb);
				break;
			case 8:
				System.exit(opcao);
				
		}
			
			entrada.close();
		
	}
	
	
}

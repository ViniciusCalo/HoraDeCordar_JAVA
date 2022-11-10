package proa;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

        System.out.println("Informe um valor");
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();

        System.out.println("Informe um 2° valor");
        int n2 = entrada.nextInt();

        if(n2 <= 0){         
            System.out.println("Valor é Negativo por favor informe um valor > 0");
            
        }else {
            
            System.out.println("A divisão dos 2 valores é " + n1/n2);
    
        }

        entrada.close();

	}

}

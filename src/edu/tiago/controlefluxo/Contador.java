package edu.tiago.controlefluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
Scanner terminal = new Scanner(System.in);
		
		int parametroUm;
		int parametroDois;
		
		System.out.println("Digite o ParametroUm número: ");
		parametroUm = terminal.nextInt();
		
		System.out.println("Digite o ParametroDois número: ");
		parametroDois = terminal.nextInt();
		
		System.out.println("Primeiro parametro " + parametroUm);
		System.out.println("Segundo parametro " + parametroDois);
		
			contar(parametroUm, parametroDois);

	}
	static void contar(int parametroUm, int parametroDois) {
		//validar se parametroUM é MAIOR que parametroDois e lançar a exceção
		
		if(parametroUm <= parametroDois) {
			
			int contagem = parametroDois - parametroUm;
			System.out.println (parametroDois + " - " + parametroUm + " = " + contagem);
		
		//realizar o FOR para imprimir os números com base na variável contagem
		
			for(int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número: ");
				System.out.println("-> " +i);
			}
		}else {
			System.out.println("O PARÂMETRO DOIS DEVE SER MAIOR QUE O PRIMEIRO");
		}
	}

}

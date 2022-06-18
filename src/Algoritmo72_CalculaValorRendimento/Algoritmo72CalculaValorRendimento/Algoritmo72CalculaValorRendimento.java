package Algoritmo72_CalculaValorRendimento.Algoritmo72CalculaValorRendimento;

import java.util.Scanner;

public class Algoritmo72CalculaValorRendimento {

	public static void main(String[] args) {
		Algoritmo72CalculaValorRendimento();
	}
	
	public static void Algoritmo72CalculaValorRendimento() {
		/*Criar um algoritmo que leia o valor de um depósito e o valor da taxa de 
		  juros. Calcular e imprimir o valor do rendimento e o valor total depois 
		  do rendimento.  deposito, taxa, valor, total;*/
		
		Scanner scanner = new Scanner(System.in);
		double deposito = scanner.nextDouble();
		double taxa = scanner.nextDouble();
		double valor;
		double total;
		
		valor = deposito * taxa / 100;
		total = deposito + valor;
		
		System.out.println("Rendimentos: "+valor+" Total: "+total);
		
	}

}

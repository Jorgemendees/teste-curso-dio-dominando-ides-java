package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		double divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		
		System.out.println("Soma: "  + soma);
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Divis�o: " + divisao);
		System.out.println("Multiplica��o: " + multiplicacao);

	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subtracao (int a, int b) {
		return a - b;
	}
	public static double divisao (double a, double b) {
		return a / b;
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}

}

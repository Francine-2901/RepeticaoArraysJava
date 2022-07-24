package com.dio.exercicios.loops;

import java.util.Scanner;

// para ler 5 numeros, selecionar o maior e caluclar a média.
public class Ex3_MaioEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0; //criamos a variavel count p depois informarmos que será até 5 números
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			count = count + 1; //aqui continuamos o count (contador)
		} while(count < 5); //E informamos que o count deve parar até o 5
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + (soma/5));

	}
}

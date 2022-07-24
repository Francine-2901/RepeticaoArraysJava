package com.dio.exercicios.loops;

/*Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.*/

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
	
		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			//abaixo no if e else, informamos ao programa com identificar o par e o impar
			if (numero % 2 == 0 ) quantPares++; //quantPares + 1
			else quantImpares++; //quantImpares + 1
			
			//count = count + 1;
			count++;
		} while(count < quantNumeros);
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Ímpar: " + quantImpares);
	
	}
}

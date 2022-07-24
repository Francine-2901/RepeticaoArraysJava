package com.dio.exercicios.loops;

import java.util.Scanner;

//Caso queria imprimir uma nota
public class Ex2_Nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		//Caso queria limitar a nota entre 0 e 10 usamos o while
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida! Digite novamente: ");
			nota = scan.nextInt();
		}
	}
}

package aulas;

import java.util.Scanner;

public class lop_numpno5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();

		if (num1 >= 1) {
			System.out.println("O número é positivo. ");
		} else if (num1 < 0) {
			System.out.println("O número é negativo.");
		} else
			System.out.println("O número é igual a zero.");
	}

}
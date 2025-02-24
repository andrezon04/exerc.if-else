package aulas;

import java.util.Scanner;

public class lop_ordcresc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número 'A'. ");
		int num1 = sc.nextInt();

		System.out.println("Digite outro número 'B'. ");
		int num2 = sc.nextInt();

		System.out.println("Digite mais um número 'C'. ");
		int num3 = sc.nextInt();

		if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.printf("A ordem crescente é: " + num1 + num2 + num3);
		} else if (num2 < num1 && num2 < num3 && num1 < num3) {
			System.out.printf("A ordem crescente é: " + num2, num1, num3);
		} else if (num3 < num2 && num3 < num1 && num2 < num1) {
			System.out.printf("A ordem crescente é " + num3, num2, num1);

		}
	}
}
package aulas;

import java.util.Scanner;

public class lop_maiornum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga um número 'A': ");
		int num1 = sc.nextInt();

		System.out.println("Diga outro número 'B': ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("O número 'A' é maior que o número 'B'. ");

		} else
			System.out.println("O número 'B' é maior que o número 'A'. ");

	}

}

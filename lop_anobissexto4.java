package aulas;

import java.util.Scanner;

public class lop_anobissexto4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Diga um ano: ");
		int ano = sc.nextInt();

		if (ano % 4 == 0) {
			System.out.println(ano + " é um ano bissexto. ");

		} else
			System.out.println(ano + " não é um ano bissexto. ");

	}
}

package aulas;

import java.util.Scanner;

public class lop_alunonota1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual nota você tirou? ");
		int boletim = sc.nextInt();

		if (boletim >= 7) {
			System.out.println("Você está aprovado. ");
		} else
			System.out.println("Você está de recuperação. ");
	}

}

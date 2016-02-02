package fr.schawnndev;

import java.util.Scanner;

import fr.schawnndev.tests.ITest;
import fr.schawnndev.tests.matrices.Matrice;
import fr.schawnndev.tests.vectors.Parallelogramme;

public class Main {

	private static ITest parallelogramme = new Parallelogramme();
	private static ITest matrice = new Matrice();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Parallelogramme vecteurs: 1 / Matrice: 2");
		int id = scanner.nextInt();

		if (id > 0 && id < 3) {

			if (id == 1)
				parallelogramme.test(true);
			else if (id == 2)
				matrice.test(true);

		} else {
			System.out.println("Aucun test n'est trouvé avec ce chiffre");
		}

		scanner.close();

	}

}

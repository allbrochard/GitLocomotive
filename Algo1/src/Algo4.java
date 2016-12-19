

import java.util.Scanner;

public class Algo4 {

	public static void main(String[] args) {

		int choix;
		do{
			listerMenu();
			choix = saisirChoix();
			afficherChoix(choix);
		}
		while (choix!=4);
	}






	public static void listerMenu (){
		System.out.println("Que voulez-vous faire ? SAisissez l'option souhaitée.");
		System.out.println("1 - Faire une addition");
		System.out.println("2 - Faire une soustraction");
		System.out.println("3 - Faire une multiplication");
		System.out.println("4 - Rien ! Je veux glander");
	}

	public static int saisirChoix(){
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		return choix;
	}

	public static void afficherChoix(int choix){
		switch (choix){
		case 1 :
			System.out.println("c'est parti pour une addition !\n");
			break;
		case 2 :
			System.out.println("c'est parti pour une soustraction !\n");
			break;
		case 3 :
			System.out.println("c'est parti pour une multiplication !\n");
			break;
		case 4 :
			System.out.println("Bon bah vas Glander alors !");
			break;
		default :
			System.out.println("Vous avez mal saisi votre réponse, réessayez !\n");


		}
	}

}


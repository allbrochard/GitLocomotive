import java.util.Scanner;
public class CalculNbreRadiateur {
	public static void main(String[] args) {
		Scanner sc;
		int lo;
		int la;
		int ha;
		sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la longueur : ");
		lo = sc.nextInt();
		System.out.println("Veuillez saisir la largeur : ");
		la = sc.nextInt();	
		System.out.println("Veuillez saisir la hauteur : ");
		ha = sc.nextInt();
		int vol = (lo*la*ha);
		//Cr�ation de la variable (M� par radiateurs.) Dans ce cas, un radiateur chauffe 8M�//
		int RadM2 = 8;
		int NbRad = (vol/RadM2);
		if (NbRad > 0) {
			System.out.print("Vous devrez utiliser ");
			System.out.print(NbRad);
			System.out.print(" radiateurs dans une piece de ");
			System.out.print(vol);
			System.out.print("M�.");
		}
		else {
			System.out.println("Vous n'aurez besoin que d'un seul radiateur pour chauffer cette pi�ce.");
		}
	}
}
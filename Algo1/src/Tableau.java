import java.util.Arrays;
import java.util.Scanner;

public class Tableau {

	public static void main(String[] args) {
		
		

	}
	public static void exercice1(){
		int nE, note;
		float moyenne;
		Scanner sc = new Scanner(System.in);
		System.out.println("rentrer le nombre d'éleve");
		nE= sc.nextInt();
		moyenne=0;
		int tabNote[][]= new int[nE][3];
		for (int i=0; i<tabNote.length; i++){
			
			for (int j=0; j<tabNote[i].length; j++){
				System.out.println("rentrer la note " + (j+1) + " de l'eleve " + (i+1));
				note= sc.nextInt();
				tabNote[i][j]=note;
				moyenne=moyenne+tabNote[i][j];
			}
			moyenne=moyenne/nE;
			System.out.println("la moyenne de l'élève " + (i+1) + " est de " + moyenne);
		}
		for (int i=0; i<nE; i++){
			for (int j=0; j<3; j++){
				moyenne=moyenne+tabNote[i][j];
			}
			moyenne=moyenne/3;
			System.out.println("la moyenne de l'élève " + (i+1) + " est de " + moyenne);
			moyenne=0;
		}
	}

	public static void exercice2(){
		int n, c, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("quelle es la taille de votre tableau ?");
		n = sc.nextInt();
		int tab[]=new int[n];
		for (int i=0; i<tab.length; i++){
			System.out.println("veuillez saisir l'entier de la case " + i);
			c = sc.nextInt();
			tab[i]=c;
		}
		max=tab[1];
		min=tab[1];
		for (int i=1; i<tab.length; i++){
			if (tab[i]>max)
				max=tab[i];
			else if (tab[i]<min)
				min = tab[i];
		}
		for (int i=0; i<tab.length; i++){
			if (tab[i]>min && tab[i]<max)
				min=tab[i];
		} 
		System.out.println("le max est : " + max + "et le second est le " + min);
	}

	public static void FUSION(){
		int n, n1, n2, a=0, b=0;
		
		
		int T1[]= {1, 9};
		
		int T2[]={2, 4, 6};
		
		int T3[]=new int[T1.length + T2.length];
		for (int i=0; i<T3.length; i++){
			if (b>=T2.length || (a<T1.length && T1[a]<T2[b])){
				T3[i]=T1[a];
				a=a+1;
			}
			else {
				T3[i]=T2[b];
				b=b+1;
			}
		}

System.out.println(Arrays.toString(T3));

	}

	public static int[] creation(){
		int Tcreation[]=new int[5];
		int rand;
		for (int i=0; i<Tcreation.length; i++){
		rand=(int)(Math.random()*9);
		Tcreation[i]=rand;
		}
		return Tcreation;
		
		
	}
	
	public static int[] proposition(){
		int Tproposition[]=new int[5];		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<Tproposition.length; i++){
			System.out.println("veuillez saisir l'entier de la case " + i);			
			Tproposition[i]=sc.nextInt();
	}
		return Tproposition;
}
	
	public static void comparaison(int[] Tproposition,int[] Tcreation){
		int bienP;
		bienP=0;
		for (int i=0; i<Tcreation.length; i++){
			if (Tcreation==Tproposition){
				bienP++;
				Tproposition[i]=0;
			}
		}
		if (bienP==5)
			System.out.println("Tu a gagner !!");
		else compaDur(Tproposition,Tcreation);			
		
	}
	public static void compaDur(int[] Tproposition, int[] Tcreation){
		int malP=0, bienP=0;
		for (int i=0; i<Tcreation.length; i++){
			if (Tproposition[i]!=0){
				for (int j=0; j<Tproposition.length; j++){
					if (Tproposition[j]==Tcreation[i]){
						malP++;
						Tcreation[i]=0;
					}
				}
			}
			else 
				bienP++;	
		}
		
	}
	
	
}
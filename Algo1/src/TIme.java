import java.util.Scanner;

public class TIme {



	public static void main(String[] args) {
		
		exercice9();
		
	}
	public static void exercice1(){	
		int s, m, h, modH, nS;

		Scanner sc = new Scanner(System.in);

		System.out.println("combien de seconde ? ");
		nS = sc.nextInt();

		h =(int) Math.floor(nS/3600);
		modH = nS%3600;
		m =(int) Math.floor(modH/60);
		s = modH%60 ;
		System.out.println(h + "h " + m + "m " + s + "s" );
	}

	public static void exercice2(){

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("first ");
		a = sc.nextInt();
		System.out.println("second ");
		b = sc.nextInt();
		System.out.println(a + " " + b);
		c=a;
		a=b;
		b=c;
		System.out.println(a + " " + b);

	}

	public static void exercice3(){

		float d, n, p, d2, n2, p2,tp2, tp;

		Scanner sc = new Scanner(System.in);

		System.out.println("le numéro ");
		n = sc.nextFloat();
		System.out.println("le prix ");
		p = sc.nextFloat();
		System.out.println("le diamètre ");
		d = sc.nextFloat();

		System.out.println("le diamètre de la deuxième pizza ");
		d2 = sc.nextFloat();
		System.out.println("le numéro de la 2e");
		n2 = sc.nextFloat();
		System.out.println("le prix de la 2e ");
		p2= sc.nextFloat();

		tp=d/p;
		tp2=d2/p2;

		if (tp>=tp2)
			System.out.println(n2);
		else 
			System.out.println(n);
	}

	public static void exercice4(){


		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("le numéro x ");
		x = sc.nextDouble();
		System.out.println("le numéro y ");
		y = sc.nextDouble();

		if (x>0){
			if(y>0)
				System.out.println("A ");
			else
				System.out.println("D ");
		}
		else if(x<0){
			if (y>0)
				System.out.println("B");
			else
				System.out.println("C ");
		}
		else
			System.out.println("0");
	}

	public static void exercice5(){
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("le numéro du mois ");
		x = sc.nextInt();
		switch(x){
		case (1):
			System.out.println("Janvier, 31j ");
		break;
		case (2):
			System.out.println("Février, 28j");
		break;
		case (3):	 
			System.out.println("Mars, 31j");
		break;
		case (4):
			System.out.println("Avril, 30j ");
		break;
		case (5):
			System.out.println("mai, 31j");
		break;
		case (6):	 
			System.out.println("juin, 30j");
		break;
		case (7):
			System.out.println("juillet, 31j ");
		break;
		case (8):
			System.out.println("aout, 31j");
		break;
		case (9):	 
			System.out.println("sptembre, 30j");
		break;
		case (10):
			System.out.println("octobre, 31j ");
		break;
		case (11):
			System.out.println("novembre, 30j");
		break;
		case (12):	 
			System.out.println("décembre, 31j");
		break;
		default :
			System.out.println("404, don't be silly there is just 12 month");
			break;

		}

	}

	public static void exercice6(){
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("A : ");
		a = sc.nextInt();
		System.out.println("B : ");
		b = sc.nextInt();
		System.out.println("C : ");
		c = sc.nextInt();
		d=Math.max(Math.max(a, b), c);
		System.out.println(d);


	}

	public static void exercice7(){

		Scanner sc = new Scanner(System.in);
		int a, b, c, a1, b1;

		System.out.println("A : ");
		a = sc.nextInt();
		System.out.println("B : ");
		b = sc.nextInt();
		System.out.println("C : ");
		c = sc.nextInt();
		a1=a-c;
		b1=b-c;
		if(Math.abs(a1)>=Math.abs(b1))
			System.out.println("B ");
		else 
			System.out.println("A ");
	}
	
	public static void exercice8(){
		Scanner sc = new Scanner(System.in);
		int n,l;
		String c = "*";
		String a = "";
		System.out.print("indiquer le nombre de fois a répéter l'étoile");
		n = sc.nextInt();
		System.out.print("indiquer le nombre ligne d'étoile");
		l = sc.nextInt();
		
	for (int i=0; i<n; i++){
		a = a+c;
	}
	System.out.println(a);
	for (int i=0; i<l; i++){
		System.out.println(a);
	}
	
	}

	public static void exercice9(){
		Scanner sc = new Scanner(System.in);
		int n, m;
		m=0;
		System.out.println("suite");
		n = sc.nextInt();
		for (int i=1; i<=n; i++){
			m=m+i;
		}
		System.out.println(m);
	}

	public static void exercice10(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("suite");
		n = sc.nextInt();
		for (int i=0; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
	
	public static void exercice11(){
		Scanner sc = new Scanner(System.in);
		int n;String b;
		b = "true";
		System.out.println("Quelle es le nombre que vous voulez tester ?");
		n= sc.nextInt();
		for (int i=2; i<n; i++){
			if (n%i == 0)
				 b="false";
		}
		System.out.println(b);
	}

	public static void exercice12(){
	int a=3, b=1;
	for (int i=1; i<=4; i++){
		for (int j=1; j<=12; j++){
			for (int k=b; k<=a; k++){
				System.out.print((k) + " X " + (j) + " = ");
				System.out.print( k*j + " \t ");
			}
			System.out.println(" ");
		}
	b=a+1;
	a=a+3;
	System.out.println("\n");
	}
		
		
	}
	
	public static void exercice13(){
		Scanner sc = new Scanner(System.in);
		int b=-1; 
		int a;
		System.out.println("quelle nombre ?");
		a = sc.nextInt();
		// on veux ici faire la suite alternée.
		for (int i=1; i<=a; i++){
			b=b*(-i);
			System.out.println(b);
		}
	}
	
	public static void exercice14(){
		int c=1, d=1;
		double x, max, min, b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("la hauteur du moi de janvier");
		x = sc.nextDouble();
		max=x;
		min=x;
		for (int i=2; i<=12; i++){
			System.out.println(" la hauteur de plui du mois " + i + " ?");
			x = sc.nextDouble();
			if(i==1){
			max=x;
			min=x;
			}
			else if (x> max){
				max=x;
				c=i;
			}
			else if (x<min){
			min=x;
			d=i;	
			}
			b=b+x;
		}
		b=b/12;
		System.out.println(max + " au mois " + c + " , " + min + " au mois " + d + " et la moyenne es de " + b);
	}
	
	public static void exercice15(){
		double g= 9.80665, t=0;
		double d, h, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("la hauteur, et tout les x secondes");
		h = sc.nextDouble();
		x = sc.nextDouble();
		d = h;
		while (d>0){
			System.out.println(d);
			d = h -((g*t*t)/2);
			t = t+x;
		}
		System.out.println("BOUM!!!");
	}
	
	
	
}







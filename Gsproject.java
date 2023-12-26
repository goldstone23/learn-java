package Gsproject;

import java.util.Arrays;
import java.util.Scanner;

public class Gsproject {
	public static void printme() {
		System.out.println("gold stone");
	}
	public static void printit(String it) {
		System.out.println(it);
	}
	public static void printu(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String []args) {
		
		 
		String naam= "golu";
		String dost = new String("oki");
		String jod = naam + "and" + dost;
		String jodi = "golu and lolu";
		
		//list = ye kisi bhi jyada numbers of datadype ko storre krne k liye use ki jaati hai 
		
		int umar= 19;
		int phy= 88;
		int chem = 01;
		int math = 87;
		
		int[] numbers=new int[3];
		numbers[0] = 88;
		numbers[1] = 01;
		numbers[2] = 87;
		
		//System.out.println(numbers[2]);
		//System.out.println(numbers.length);
		
		//sort
		//System.out.println(numbers[0]);

		//Arrays.sort(numbers);
		
		//System.out.println(numbers[0]);
		
		int[] num = {77,87,97};
		
		int [][] totalnum = {{77,87,97},{88,86,89}};
		System.out.println(totalnum[0][1]);
		
		//casting
		//2 types
		// implicit casting
		//explicit casting
		
		//implicit
		//double p =101;
		//double fp =p+19;
		//System.out.println(fp);
		
		//explicit
		int p =101;
		int fp = p+(int)19.34;
		System.out.println(fp);
		
		//constants
		// variable which we want static always so we use final datatype so after that we assign value to that variable again we see a error will occur.
		
		final float x = (float) 9.83; 
		System.out.println(x);
		
		//operators
		  //arithmetic op (+, -, /, *, %)
		  //assignment op  (++,--)
		  //logical op
		  //comparison op
		
		
		//math class
		System.out.println(Math.max(9, 7));
		
		//random
		System.out.println((int)(Math.random()*100));

        //take input
		Scanner sc= new Scanner(System.in);
		System.out.println("input do :");
		//float age = sc.nextFloat();
		//System.out.println(age);
		
		//string input
		String naam2 =sc.nextLine();
		System.out.println(naam2);
 
		
		//comparison operators
		//a==b
		//a!=b
		//a<b
		//a>b
		//a<=b
		//a>=b
		
		
		//conditional statement
		boolean makeme=true;
		if(makeme ==false)
			System.out.println("smile");
		else
			System.out.println("angry");
		
		
		int age = 24;
		if (age >19)
			System.out.println("tabhi aana");
		else
			System.out.println("mat aana");
		
		
		//logical operators
		//&&
		//||
		// !
		int a=99;
		int b=68;
		if (a>b && b<a); //it check both condition has to correct
		if (a<b || b>a);   //it check wheater only one is correct it will works
		System.out.println("sahi hai");
		
       
		boolean adulthai =false;
		if(!adulthai)
			System.out.println("ha hai");
		else
			System.out.println("nahi hai");
		
		//conditional statement
		
		Scanner pc = new Scanner(System.in);

		int cash = pc.nextInt();
		if (cash < 10) {
			System.out.println("nahi milega");
			System.out.println("or mangkr la");
		}
		else if(cash > 10 && cash < 50) {
			System.out.println("ek hi milega");
		}
		else {
			System.out.println("chal leja dono");
		}

		// Switch statement
		
		int din = 1;
		switch(din) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
			
		default:
			System.out.println("wed to sun");
		
		}



		//loops
		//for loops
		
		//for (int q =1; q <=1000; q=q+1) {
			//System.out.println(q);
		//}
		
		// while loop
		
		int y= 100;
		while(y>=1) {
			System.out.println(y);
			y = y-1;
		}
		
		//do while
		
		int k=100;
		do {
			System.out.println(k);
			k=k-1;
		}while (k>=1);
		
		//loops
		Scanner o = new Scanner(System.in);
		int number =0;
		do {
			System.out.println("input doalo");
			number = o.nextInt();
			System.out.print("yaha hai no");
			System.out.println(number);
			
		}while(number>=0);
		
		//break & continue
		
		int u=0;
		while(true) {
			if(u==3) {
				u=u+1;
				continue;
			}
			System.out.println(u);
			u=u+1;
			if (u>5) {
				break;
			}
		}
		
		//exception handling
		//try & catch
		int[] numb = {99,85,83};
		try {
			System.out.println(numb[9]);
		}
		catch(Exception exception) {
			
		}System.out.println("mera naam");
		
		
		// Methods / function
		printme();
		printit("yepoo");
		
		printu(5,6);
		
		//chota project
		 
		 Scanner r=new Scanner(System.in); 
		 int merano = (int) (Math.random()*100);
		 int userno=0;
		 do {
				System.out.println("guess kro (1 -100) : ");
				userno = r.nextInt();
			
				if (userno == merano) {
					System.out.println("woohoo ... sahi hai");
					break;
		 }
				else if (userno > merano) {
					System.out.println("bdda hai no");
				}
				else {
					System.out.println("bohut chota hai");
				}
		
		 }while (userno >= 0 );
			System.out.println("mera no hai ...");
			System.out.println(merano);
	 }

}
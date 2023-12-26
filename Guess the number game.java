//chota project

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

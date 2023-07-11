package Programs;

import java.util.Scanner;
// Using Method Concepts
public class Fibb {
	static void fibonaci(int n) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i=3;i<=n;i++) {
			int c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		fibonaci(n);
		
	}
}
	

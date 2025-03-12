package PracticeSet1;

import java.util.Scanner;

public class MaxTwo {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println("Maximum: " + Math.max(a, b));
	        sc.close();
	}
}

package PracticeSet1;

import java.util.Scanner;

public class MaxThree {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int max=Math.max(a,Math.max(c,b));
	        System.out.println("Maximum No :=" +max);
	}

}

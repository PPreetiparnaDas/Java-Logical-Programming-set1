package PracticeSet1;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);
	        if (Character.isLetter(ch))
	            System.out.println("It is an alphabet");
	        else
	            System.out.println("Not an alphabet");
	        
	        sc.close();
	}

}

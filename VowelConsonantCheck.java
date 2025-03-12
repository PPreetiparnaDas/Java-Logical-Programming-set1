package PracticeSet1;

import java.util.Scanner;

public class VowelConsonantCheck {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a letter: ");
	        char ch = sc.next().toLowerCase().charAt(0);
	        
	        if ("aeiou".indexOf(ch) != -1)
	            System.out.println("Vowel");
	        else if (Character.isLetter(ch))
	            System.out.println("Consonant");
	        else
	            System.out.println("Not a valid alphabet");
	        
	        sc.close();
	}

}

package org.baseSocial.view;

import java.util.Scanner;

public class ViewPresentation {

	public static void show() {

		System.out.println("Choose options");

		System.out.println("1. Add a Friend");

		System.out.println("2. Search a Friend");

		System.out.println("3. Post a message to Friend");

		System.out.println("4. List your Friends");

		System.out.println("5. View your mural");

		System.out.println("6. View your recommendations");

	}

	public static int readInput() {
		Scanner sc = new Scanner(System.in);
		String in;
		Integer a = 0;
		in = sc.next();

		try {
			a = a.parseInt(in);
			System.out.println("" + a);
		} catch (Exception e) {
			System.out.println("entrada invalida");
		}

		return a;
	}

	public static int processAction(int a) {

		switch (a) {
		case 1:
			System.out.println("Option one");
			System.out.println("Enter code to your friend");
			break;
		case 2:
			System.out.println("Option two");
			System.out.println("Enter code to your friend to search");
			break;
		case 3:
			System.out.println("Option three");
			System.out.println("Post your message");
			break;
		case 4:
			System.out.println("Option four");
			System.out.println("Mural");
			break;

		default:
			System.out.println("you digit option invalid");
			break;
		}

		return a;

	}
	
	
	

}

package org.four;

public class Nested {

	public static void main(String[] args) {

		int exp = 5, age = 30;

		if (age == 30) {

			System.out.println("Experience elgible");

			if (exp == 5) {
				System.out.println("Age Elgible");

			} else {
				System.out.println("Not Elgible");

			}
		}

		else {
			System.out.println("Not Elgible Exp");
		}

	}

}

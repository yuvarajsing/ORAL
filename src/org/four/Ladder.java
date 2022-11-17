package org.four;

public class Ladder {

	public static void main(String[] args) {
		int a = 30, b = 40, c = 50, d = 80;
		if (a > b && a > c && a>d) {
			System.out.println("a is greatest");
		}
		else if (b > a && b > c && b>d) {
			System.out.println("b is greatest");
		}
		if (c>a && c>b && c>d) {
			System.out.println("c is greatest");
		}
		else {

			System.out.println("d is greatest");
		}

	}
}
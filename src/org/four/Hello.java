package org.four;

public class Hello {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 5) {

			}
			System.out.println(i);

		}
	}

	/*
	 *  1           2          3          4 
	 *  i=1       1<=100t       1         1+1
	 *  i=2       2<=100t       2         1+2
	 *  i=3       3<=100t       3		  1+3
	 *  i=4       4<=100t       4		  1+4
	 *  i=5       5<=100t       5		  1+5
	 *  -
	 *  -        
	 *  -       
	 *  -       
	 *  i=101       101<=100f --------------loops end
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

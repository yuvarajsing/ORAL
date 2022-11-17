package org.four;

public class Q8 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = i + 1; j <= i; j++) {
				System.out.println(j);
			}

		}

	}
/*	               j=i+i      j<=i
 * 
	  1     2      3.1a        b      c     d     4
	i=1   1<=3    j=1+1=2     2<=1f ----------loops ends 
	
	
	
*/
}

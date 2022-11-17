package org.four;

public class Q6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}

		}

	}
	
	/*	                                              4
	1     2      3.1a       b      c      d          i++
   i=1	 1<=3t    j=1     1<=1t    1     1+1
	              j=2     2<=1f   -----------------loops ends 
   i=2	 2<=3t    j=1     1<=2t    1     1+1
	              j=2     2<=2t    2     2+1
	              j=3     3<=2f   ---------------loops ends 
    i=3	 3<=3t    j=1     1<=3t    1     1+1
	              j=2     2<=3t    2     2+1
	              j=3     3<=3t    3     3+1 
	              j=4     4<=3f   -----------loops end
	i=4	 4<=3f    ---------loops end
	
	
	
	
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

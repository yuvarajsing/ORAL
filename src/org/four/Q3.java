package org.four;

import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(j);
			}
		}
	}

	
/*	                                              4
	1     2      3.1a       b      c      d      i++
   i=1	 1<=3t    j=1     1<=3t    1     1+1
	     2<=3t    j=2     2<=3t    2     2+1
	              j=3     3<=3t    3     3+1 
	              j=4     4<=3f   -----------loops end
   i=2	 2<=3t    j=1     1<=3t    1     1+1
	              j=2     2<=3t    2     2+1
	              j=3     3<=3t    3     3+1 
	              j=4     4<=3f   -----------loops end
    i=3	 3<=3t    j=1     1<=3t    1     1+1
	              j=2     2<=3t    2     2+1
	              j=3     3<=3t    3     3+1 
	              j=4     4<=3f   -----------loops end
	i=4	 4<=3f    ---------loops end
	
	
	
	
*/	
}

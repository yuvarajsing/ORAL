package org.four;

public class Q5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i);
			}

		}

	}
	/*                                                     i++
	  1         2     3.1a      b      c      d    3.2      4  
	 i=1 	 1<=3t    j=1     1<=3t    1     1+1    1 
		              j=2     2<=3t    1     2+1    1
		              j=3     3<=3t    1     3+1    1 
		              j=4     4<=3f---------loops ends    1+1        
	 i=2	 2<=3t    j=1     1<=3t    2     1+1    2     
		              j=2     2<=3t    2     2+1    2
		              j=3     3<=3t    2     3+1    2
		              j=4     4<=3f ----------loops ends  2+1
     i=3	 3<=3t    j=1     1<=3t    3     1+1    3
		              j=2     2<=3t    3     2+1    3
		              j=3     3<=3t    3     3+1    3
		              j=4     4<=3f ----------loops ends  
		              i=4	  4<=3f   
		
	*/
	
	
	

	
	
	
	
	
	
	
	

}

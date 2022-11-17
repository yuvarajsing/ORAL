package org.four;

public class Q7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j =i+1; j <= 3; j++) {
				System.out.println(j);
			}

		}
	
	}
	
	
	/*                j=i+1                                     i++
	 * 
	  1         2     3.1a           b        c      d          4  
	 i=1 	 1<=3t    j=1+1=2     2<=3t       2     2+1     
		              j=2+1=3     3<=3t       3     3+1    
		              j=3+1=4     4<=3f ------------ loops ends
		                        
	 i=2	 2<=3t    j=2+1=3     3<=3t       3     3+1         
		              j=3+1=4     4<=3f -----------loops ends     
		              
	
	
	
	*/
	
	
	
	
	
	
	
	
}

package org.four;

public class Q2 {
public static void main(String[] args) {
	for (int i = 1; i <= 10; i++) {
		if (i == 5) {
			continue;
		}
	System.out.println(i);
	
	}	
	
}

/*       1          2       3.1             3.2          4 
	 *  i=1       1<=10t    1==5f            1          1+1
	 *  i=2       2<=10t    2==5f            2          1+2
	 *  i=3       3<=10t    3==5f            3		    1+3
	 *  i=4       4<=10t    4==5f            4		    1+4
	 *  i=5       5<=10t    5==5t          continue------loops ends.         
	 *  i=6       6<=10t                     6          1+6
	 *  i=7       7<=10t                     7          1+7
	 *  i=8       8<=10t                     8		    1+8
	 *  i=9       9<=10t                     9		    1+9
	 *  i=10      10<=10t                   10          1+10
        i=11      11<=10f       --------------loops ends










*/

}

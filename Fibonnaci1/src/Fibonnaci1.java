
/**
 * @author Gerardo Mota
 */

import java.util.*;

public class Fibonnaci1{
  
	/**
      static method which returns nth fibonacci number
    */
  
	public static int fib(int n){
    
		if( n<=1)
      
			return n;
    
		/**
		 * Recursive call to add last 2 Fibonacci Numbers
		 */
    
		return fib(n-1) + fib(n-2);
  }
  
  
  public static void main(String args[]){
    
	  int n =10;
      
	  /**
	   * Call the method with n
	   */
	      
	  int y = fib(n);
    
	  /**
	   * Output the result
	   */
    
    
	  System.out.println("The "+n+"th term of the Fibonacci sequence is "+y);
  
  }
}
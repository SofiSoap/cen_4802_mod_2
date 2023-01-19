package cen_4802_mod_2;

/**
 * 
 * @author marri
 *
 *Program finds numbers of Fibonacci sequence.
 */

public class FibMain {

	/**
	 * 
	 * @param args
	 * 
	 * main method() calls fib() method, which finds the nth number of the fibonacci sequence through 
	 * recursion
	 */
	public static void main(String[] args) {
		
		int number = 10;
		int fibResult = fib(number);
		
		System.out.println("The "+ number+ " term of the Fibonacci sequence is "+fibResult);
	

	}
	//END OF MAIN **********************************************************************************
	
	/**
	 * 
	 * @param fibBefore, nth number of the fibonacci sequence we want to find 
	 * @return fibResults, returns the nth fibonacci number
	 */
	public static int fib(int fibBefore) {
		int fibResult;
		
		if(fibBefore == 0 || fibBefore == 1) {
			fibResult =fibBefore;
			return fibResult; 
		}
		else{
			fibResult = fib(fibBefore -2) + fib(fibBefore -1);
		}
		
		return fibResult;
	}	
	

}

package cen_4802_mod_2;

public class FibMain {

	public static void main(String[] args) {
		
		int number = 9;
		int fibResult = fib(number);
		
		System.out.println("The "+ number+ " term of the Fibonacci sequence is y"+fibResult);
	

	}
	
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

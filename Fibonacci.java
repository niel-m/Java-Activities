package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		//initialization of variables
		int maxnum = 10;
		
		//prints the final result of the program
		System.out.println("Fibonacci series of " + maxnum + " numbers: ");

		//recursion in the main method
		//checks if i (starting from 0) is less than 10 (maxnum)
		for(int i = 0; i < maxnum; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	//function of variable fib
	//n is the number being checked in statement 2 of the for loop
	public static int fib(int n) {
		//condition in the function
		//if n is 0, it will return a value of 1
		if(n == 0) {
			return 0;
		}
		//if n is 1 and if n is 2, it will return a value of 1
		if(n == 1 || n == 2) {
			return 1;
		}
		//recursion of each method call and then counts the number of 1s
		/*the number has to go through both the first and second parenthesis to check
		 if they are already a value of 1 or 2, if yes it will count the number of 1s
		 returned*/ 
		return fib(n - 2) + fib(n - 1);
	}
}


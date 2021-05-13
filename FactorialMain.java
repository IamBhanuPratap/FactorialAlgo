
public class FactorialMain {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int factorial = factNum(n);
		System.out.println("Factorial of the number = "+factorial);

	}
	public static int factNum(int n) {
		System.out.println(n);
		if(n==1) {
			return 1;
		}
		else {
			return n*factNum(n-1);
		}
	}

}

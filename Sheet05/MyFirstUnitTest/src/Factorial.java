public class Factorial {
	public static long calculateFactorial(long n) {
		if (n < 0) {
			throw new IllegalArgumentException("n has to be non-negative");
		}
		
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		
		return res;
	}
}

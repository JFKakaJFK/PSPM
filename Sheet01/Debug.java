public class Debug {	
  public static int factorial(int x) {
		if (x <= 1) {
			return 1;
		}
		return x * factorial(x-1);
	}
	
	public static void main(String[] args) {
	
		double x = 0;
		for (int i=0; i<10; i++) {
			x += 1.0 / factorial(i);
		}
		System.out.println(Math.E);
		System.out.println(x);
	}
}

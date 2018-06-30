
public class LazyMain {
	private static void printConditional(boolean condition, int thenValue, int elseValue) {
		System.out.println("The answer is: " + (condition ? thenValue : elseValue));
	}
	private static void lazyPrintConditional(boolean condition, Lazy<Integer> thenValue, Lazy<Integer> elseValue) {
		System.out.println("The answer is: " + (condition ? thenValue.get() : elseValue.get()));
	}
	
	private static int longRunningComputation1() {
		//Do some serious computing for a veeeery long time
		System.out.println("This is taking forever ...");
		
		return 42;
	}
	private static int longRunningComputation2() {
		//Do some serious computing for a veeeery long time
		System.out.println("Doing some serious long running computations here ...");
		
		return 41;	//Off by one
	}
	
	public static void main(String[] args) {
		System.out.println("Pass 1:");
		printConditional(false, longRunningComputation1(), longRunningComputation2());
		System.out.println();
		
		System.out.println("Pass 2:");
		lazyPrintConditional(true, new Lazy<Integer>(() -> longRunningComputation1()), new Lazy<Integer>(() -> longRunningComputation2()));
	}

}

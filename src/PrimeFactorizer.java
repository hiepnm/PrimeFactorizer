
public class PrimeFactorizer {
	private static int factorIndex;
	private static int[] factorRegister;
	
	public static int[] factor(int multiple) {
		initialize();
		findPrimeFactors(multiple);
		return copyToResult();
		
		
	}

	private static void initialize() {
		factorIndex = 0;
		factorRegister = new int[100];
	}
	
	private static void findPrimeFactors(int multiple) {
		for (int factor = 2; multiple != 1; factor++)
			for (; multiple % factor == 0; multiple /= factor)
				factorRegister[factorIndex++] = factor;
	}
	
	private static int[] copyToResult() {
		int factors[] = new int[factorIndex];
		for (int i = 0; i < factorIndex; i++) 
			factors[i] = factorRegister[i];
		return factors;
	}
}
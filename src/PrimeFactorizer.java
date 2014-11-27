
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
		factorRegister = new int[2];
	}
	
	private static void findPrimeFactors(int multiple) {
		for (; multiple % 2 == 0; multiple /= 2)
			factorRegister[factorIndex++] = 2;
		if (multiple != 1) 
			factorRegister[factorIndex++] = multiple;
	}
	
	private static int[] copyToResult() {
		int factors[] = new int[factorIndex];
		for (int i = 0; i < factorIndex; i++) 
			factors[i] = factorRegister[i];
		return factors;
	}
}
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class PrimeFactorizer {
	public static void main(String[] args) {
		int[] factors = findFactors(Integer.parseInt(args[0]));
		for (int i = 0; i < factors.length; i++) 
			System.out.println(factors[i]);
	}

	private static int[] findFactors(int multiple) {
		List<Integer> factors = new LinkedList<Integer>();
		int[] primes = PrimeGenerator.generatePrimes((int)Math.sqrt(multiple));
		for (int i = 0; i < primes.length; i++) {
			for (; multiple % primes[i] == 0; multiple /= primes[i])
				factors.add(new Integer(primes[i]));
		}
		return createFactorArray(factors);
	}

	private static int[] createFactorArray(List<Integer> factors) {
		int[] factorArray = new int[factors.size()];
		int j = 0;
		for (Iterator<Integer> fi = factors.iterator(); fi.hasNext(); ) {
			Integer factor = (Integer)fi.next();
			factorArray[j++] = factor.intValue();
		}
		return factorArray;
	}
}

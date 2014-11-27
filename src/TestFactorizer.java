import junit.framework.TestCase;


public class TestFactorizer extends TestCase{
	public void testTwo() throws Exception {
		int factors[] = PrimeFactorizer.factor(2);
		assertEquals(1, factors.length);
		assertEquals(2, factors[0]);
	}
	public void testThree() throws Exception {
		int factors[] = PrimeFactorizer.factor(3);
		assertEquals(1, factors.length);
		assertEquals(3, factors[0]);
	}
	public void testFour() throws Exception {
		int factors[] = PrimeFactorizer.factor(4);
		assertEquals(2, factors.length);
		assertEquals(2, factors[0]);
		assertEquals(2, factors[1]);
	}
	public void testFive() throws Exception {
		int factors[] = PrimeFactorizer.factor(5);
		assertEquals(1, factors.length);
		assertEquals(5, factors[0]);
	}
	public void testSix() throws Exception {
		int factors[] = PrimeFactorizer.factor(6);
		assertEquals(2, factors.length);
		assertContains(factors, 2);
		assertContains(factors, 3);
	}
	private void assertContains(int factors[], int n) {
		String error = "assertContains: " + n;
		for (int i = 0; i < factors.length; i++) {
			if (factors[i] == n)
				return;
		}
		fail(error);
	}
	public void testEight () throws Exception {
		int factors[] = PrimeFactorizer.factor(8);
		assertEquals(3, factors.length);
		assertContainsMany(factors, 3, 2);
	}
	public void testNine () throws Exception {
		int factors[] = PrimeFactorizer.factor(9);
		assertEquals(2, factors.length);
		assertContainsMany(factors, 2, 3);
	}
	public void testSixteen () throws Exception {
		int factors[] = PrimeFactorizer.factor(16);
		assertEquals(4, factors.length);
		assertContainsMany(factors, 4, 2);
	}
	public void testThousand () throws Exception {
		int factors[] = PrimeFactorizer.factor(1000);
		assertEquals(6, factors.length);
		assertContainsMany(factors, 3, 2);
		assertContainsMany(factors, 3, 5);
	}
	private void assertContainsMany(int[] factors, int n, int f) {
		String error = "assertContain(" + n + "," + f + ")";
		int count = 0;
		for (int i = 0; i < factors.length; i++) {
			if (factors[i] == f)
				count++;
		}
		if (count != n)
			fail(error);
	}
}

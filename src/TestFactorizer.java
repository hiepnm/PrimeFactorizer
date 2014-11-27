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
}

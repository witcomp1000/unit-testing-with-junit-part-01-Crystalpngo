import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadraticEqCalcTest {

	@Test
	void testTwoUniqueRoots01() {
		double a = 1.0, b = -7.0, c = 10.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 2.0;
		double expRoot2 = 5.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1);
		assertEquals(expRoot2, calcRoot2);
	}

	@Test
	void testImaginaryRoots01() {
		double a = 1, b = 4, c = 5;
		assertFalse(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = Double.NaN;
		double expRoot2 = Double.NaN;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	
	@Test
	void testTwoUniqueRoots02() {
		double a = 54.5, b = 1115.8, c = 566.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -19.95290275;
		double expRoot2 = -0.520492;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	
	@Test
	void testTwoNonUniqueRoots01() {
		double a = 4.0, b = -8.0, c = 4.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 1.0;
		double expRoot2 = 1.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	
	@Test
	void testCaseAis0() {
		double a = 0.0, b = 3.0, c = -4.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = Double.NEGATIVE_INFINITY;
		double expRoot2 = Double.NaN;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	
	@Test
	void testCaseBis0() {
		double a = 1.0, b = 0, c = -4.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -2.0;
		double expRoot2 = 2.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	
	@Test
	void testCaseCis0() {
		double a = 1.0, b = -3.0, c = 0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 0.0;
		double expRoot2 = 3.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	
	@Test
	void testCaseisCombo01() {
		double a = 1.0, b =0, c = 0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 0.0;
		double expRoot2 = 0.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
		//b=0&c=0 and we have 2 non-unique roots
	}

}

package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ArrayTest {
	Array array;
	int[] mas1 = { 0, 2, -2, 7, -3 };

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before ArrayTest.class");
	}

	@Ignore
	@Test
	public void maxElementsTest1() {
		assertEquals(-7, array.maxElements(mas1));
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After ArrayTest.class");
	}

	@Ignore
	@Test
	public void minElementsTest1() {
		assertEquals(-7, array.minElements(mas1));
	}

	@Before
	public void initTest() {
		array = new Array();
	}

	@Ignore
	@Test(expected = ArithmeticException.class)
	public void divideByNumberTest1() {
		array.divideByNumber(mas1, 1, 0);
	}

	@After
	public void afterTest() {
		array = null;
	}

	@Test
	public void multiplyByNumberTest() {
		int[] mas2 = { 0, 4, -4, 14, -6 };
		assertArrayEquals(mas2, array.multiplyByNumber(mas1, 2));
	}

	@Test
	public void multiplyByNumberTest1() {
		int[] mas2 = { 0, 0, 0, 0, 0 };
		assertArrayEquals(mas2, array.multiplyByNumber(mas1, 2));
	}

	@Test
	public void maxElementsTest() {
		assertEquals(7, array.maxElements(mas1));
	}

	@Test
	public void minElementsTest() {
		assertEquals(-3, array.minElements(mas1));
	}

	@Test(expected = ArithmeticException.class)
	public void divideByNumberTest() {
		array.divideByNumber(mas1, 0, 0);
	}

	@Ignore
	@Test
	public void divideByNumberIgnoredTest() {
		array.divideByNumber(mas1, 0, 0);
	}

	@Test(timeout = 1000)
	public void maxElementsTimeoutTest() {
		assertEquals(7, array.maxElements(mas1));
	}

}

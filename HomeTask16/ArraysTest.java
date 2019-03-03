package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ArraysTest {

	private Arrays arrays = new Arrays();
	int[] mas1 = { 0, 2, -2, 7, -3 };
	int[] mas2 = { 0, 4, -4, 14, -6 };
	int[] mas3 = { 0, 6, -6, 21, -9 };
	int[] mas4 = { 0, -8, 8, -28, 12 };
	int[] mas5 = { -3, 7, -2, 2, 0 };

	@Test(dataProvider = "dataForMyltiply")
	public void multiplyByNumberTest(int[] n, int s, int[] a) {
		Assert.assertEquals(arrays.multiplyByNumber(n, s), a);
	}

	@Test(dataProvider = "dataForAverage")
	public void averageMasTest(int[] n, double a) {
		Assert.assertEquals(arrays.averageMas(n), a, 0.1);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void multiplyByNumberTest() {
		Assert.assertEquals(mas2, this.arrays.multiplyByNumber(mas1, 2));
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

	@DataProvider(name = "dataForMyltiply")
	public Object[][] getMyltiply() {
		return new Object[][] { new Object[] { mas1, 2, mas2 }, new Object[] { mas1, 3, mas3 },
				new Object[] { mas1, -4, mas4 }, };
	}

	@DataProvider(name = "dataForAverage")
	public Object[][] getAverage() {
		return new Object[][] { new Object[] { mas1, 0.8 }, new Object[] { mas2, 0.8 * 2 },
				new Object[] { mas3, 0.8 * 3 }, new Object[] { mas4, 0.8 * (-4) }, };
	}

	@Test(enabled = false)
	public void divideByNumberIgnoredTest() {
		arrays.divideByNumber(mas1, 0, 0);
	}

	@Test(enabled = false)
	public void divideByNumberIgnoredTest1() {
		arrays.divideByNumber1(mas2, 0, 0);
	}

	@Test
	public void sumElementsTest() {
		Assert.assertEquals(4, arrays.sumElements(mas1), "Error!");
	}

	@Test
	public void sumElementsTest1() {
		Assert.assertEquals(8, arrays.sumElements(mas2), "Error!");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test
	public void maxElementsTest() {
		Assert.assertEquals(7, arrays.maxElements(mas1), "Error!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void divideByNumberTest() {
		arrays.divideByNumber(mas1, 0, 0);
	}

	@Test
	public void averageMasTest1() {
		Assert.assertNotSame(arrays.averageMas(mas1), 0);
	}

	@Test
	public void divideByNumberTest1() {
		arrays.divideByNumber1(mas1, 0, 0);
	}

	@Test
	public void divideByNumberTest3() {
		Assert.assertEquals(arrays.divideByNumber1(mas1, 1, 2), 1, 0.1);
	}

	@Test
	public void swapNextElementsTest() {
		Assert.assertEquals(arrays.swapNextElements(mas1), mas5);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@Test
	public void minElementsTest() {
		Assert.assertEquals(-3, arrays.minElements(mas1));
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}

	@Test(timeOut = 1000)
	public void maxElementsTimeoutTest() {
		Assert.assertEquals(7, arrays.maxElements(mas1));
	}

	@Test
	public void namberMaxElementTest() {
		Assert.assertEquals(4, arrays.namberMaxElement(mas4));
	}

	@Test
	public void assertTest() {
		Assert.assertNotSame(mas1, mas2);
	}

	@Test
	public void namberMinElementTest() {
		Assert.assertEquals(3, arrays.namberMinElement(mas4));
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@Test
	public void divideByNumberTest2() {
		Assert.assertNotEquals(-3, arrays.divideByNumber(mas1, 2, 2));
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

	@Test
	public void multiplyByNumberTest2() {
		Assert.assertNotEquals(mas1, mas2);
	}

	@Test
	public void averageMasTest() {
		Assert.assertNotEquals(arrays.averageMas(mas1), 0);
	}

	@Test
	public void failTest() {
		Assert.fail("Test failed!");
	}

}

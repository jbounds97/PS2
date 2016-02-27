package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	static MyInteger object1 = new MyInteger(2);
	static MyInteger object2 = new MyInteger(3);
	static MyInteger object3 = new MyInteger(23);
	
	@Test
	public void testIsEven(){
		System.out.println("Test isEven");
		boolean bExpectedResult = true;
		boolean bActualResult = object1.isEven();
		assertEquals("test isEven() failed", bExpectewdResult, bActualResult);
	}
	
	@Test
	public void testIsOdd(){
		System.out.println("Test isOdd");
		boolean bExpectedResult = true;
		boolean bActualResult = object2.isOdd();
		asserEquals("test isOdd() failed", bExpectedResult, bActualResult);
	}
	
	@Test
	public void testIsPrime(){
		System.out.println("Test isOdd");
		boolean bExpectedResult = true;
		boolean bActualResult = object3.isPrime();
		asserEquals("test isPrime() failed", bExpectedResult, bActualResult);
		}

}

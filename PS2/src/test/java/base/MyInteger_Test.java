package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	
	@Test
	public void testIsEven(){
		System.out.println("Test isEven");
		MyInteger variable = new MyInteger();
		variable.setiValue(20);
		boolean bExpectedResult = true;
		boolean bActualResult = variable.isEven();
		assertEquals("test isEven() failed", bExpectedResult, bActualResult);
	}
	
	@Test
	public void testIsOdd(){
		System.out.println("Test isOdd");
		MyInteger variable = new MyInteger();
		variable.setiValue(15);
		boolean bExpectedResult = true;
		boolean bActualResult = variable.isOdd();
		asserEquals("test isOdd() failed", bExpectedResult, bActualResult);
	}
	
	@Test
	public void testIsPrime(){
		System.out.println("Test isOdd");
		MyInteger variable = new MyInteger();
		variable.setiValue(23);
		boolean bExpectedResult = true;
		boolean bActualResult = variable.isPrime();
		asserEquals("test isPrime() failed", bExpectedResult, bActualResult);
		}

}

package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNegativeZeroAndLargeNumbers {
			@Test
			public void negativeZeroAndLargeNumbersTest1() {
				JAVA_EX_02 javaEx02 = new JAVA_EX_02();
				int number = -5;
				int result = javaEx02.calculatePrimeNumbers(number);
				assertEquals(-1,result );
				
			}
			
			@Test
			public void negativeZeroAndLargeNumbersTest2() {
				JAVA_EX_02 javaEx02 = new JAVA_EX_02();
				int number = 0;
				int result = javaEx02.calculatePrimeNumbers(number);
				assertEquals(-1,result );
				
			}
			@Test
			
			public void negativeZeroAndLargeNumbersTest3() {
				JAVA_EX_02 javaEx02 = new JAVA_EX_02();
				int number = 1000000;
				int result =  javaEx02.calculatePrimeNumbers(number);
				assertEquals(78498, result );
				
			}

}

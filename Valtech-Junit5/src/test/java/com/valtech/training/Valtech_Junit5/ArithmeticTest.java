package com.valtech.training.Valtech_Junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Nested;

class ArithmeticTest {

	private Arithmetic arithmetic;

	private static int ZERO;
	

	
	
	@Nested
    public  class DivisionTest {
        
        private Arithmetic arithmetic;
        
        @Test
        public void testDivByZero(){
           arithmetic= new ArithmeticImpl();
           assertThrows(ArithmeticException.class,() -> { arithmetic.div(2,ZERO);});
        }
    }
	

	@Nested
	@DisplayName("Testing sub-method of arithmetic")
	public class SubtractionTest {
		private Arithmetic arithmetic;
	}

	@ParameterizedTest
	@CsvSource({ "'subtracting 2 positive numbers',2,3,-1", "'subtracting 2 positive numbers',-2,-3,1",
			"'subtracting 2 positive numbers',1,3,-2", })
	public void testSub(String name, int a, int b, int res) {
		arithmetic = new ArithmeticImpl();
		assertEquals(res, arithmetic.sub(a, b));

	}

	@DisplayName("{index} {0} {1} +{2}={3}")
	@ParameterizedTest
	@CsvSource({ "'Adding 2 positive numbers',2,3,5", "'Adding 2 positive numbers',-2,-3,-5",
			"'Adding 2 positive numbers',1,3,4", })
	public void testAdd(String name, int a, int b, int res) {
		assertEquals(res, arithmetic.add(a, b));

	}

	public static Stream<Arguments> argumentsForAdd() {
		return Stream.of(Arguments.of(2, 3, 5), Arguments.of(1, 3, 4));
	}

	@DisplayName("{index} Testing for add with {0} and {1} shud be euals {2}")
	@ParameterizedTest
	@MethodSource("argumentsForAdd")
	public void testAdd(int a, int b, int res) {

	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 3, 4, -1, -2 })
	@DisplayName(value = "{index}) testing for add with {0} and 0")
	public void testAddZero(int a) {
		assertEquals(a, arithmetic.add(a, ZERO));
	}

	@Test
	@DisplayName("Generic test cases for add...")
	public void testAdd() {
		assertEquals(5, arithmetic.add(2, 3));
		assertEquals(5, arithmetic.add(3, 2));

	}

	// @BeforeAll
	// public static void executeFirst(){
	// System.out.println("BEFOREALL-EXECUTEDFIRST");
	// ZERO=0;
	// }
	//
	// @AfterAll
	// public static void executeLast(){
	// System.out.println("AFTERALL-EXECUTEDLAST");
	//
	// }
	//
	//
	//
	//
	@BeforeEach
	public void runBeforeTest() {
		arithmetic = new ArithmeticImpl();
		System.out.println("run beforeee");
	}

	@AfterEach
	public void afterTest() {
		arithmetic = new ArithmeticImpl();
		System.out.println("run afterrr");

	}
	}
	//
	//// @BeforeAll
	//// public void runBeforeAll() {
	//// arithmetic=new ArithmeticImpl();
	//// System.out.println("beforeee all");
	//// }
	////
	//// @AfterAll
	//// public void runAfterAll() {
	//// arithmetic=new ArithmeticImpl();
	//// System.out.println("after all");
	//// }
	//
	//
	//
	// @Test
	// public void testHi() {
	// //assertTrue(true);
	// System.out.println("hiiiiiiiiii");
	//
	// }
	//
	// @Test
	// public void testHello() {
	// //assertTrue(true);
	// System.out.println("helloooooo");
	// }


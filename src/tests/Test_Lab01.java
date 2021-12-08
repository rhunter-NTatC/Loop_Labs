package tests;

import static org.junit.jupiter.api.Assertions.*;
import labs.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test_Lab01 {

	private static final PrintStream systemOut = System.out;
	private static final InputStream systemIn = System.in;
	private ByteArrayInputStream testIn;
	private String outputStream;
	
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		outputStream = "";
		overridePrintStatements();
		Lab01.problem1();
		resetPrintStream();
		String expectedOutput = "1 2 3 4 5 6 7 8 9 10";
		
		try {
			Assertions.assertTrue(outputStream.equals(expectedOutput)
					|| outputStream.equals(expectedOutput + "\n")
					|| outputStream.equals(expectedOutput + " ")
					|| outputStream.equals(expectedOutput + " \n"));
			System.out.println("Test problem1() #1: Passed\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Test problem1() #1: Failed");
			System.out.println("   Expected Output: \n" + expectedOutput);
			System.out.println("   Your Output: \n" + outputStream + "\n\n\n\n");
			Assertions.fail();
		}
	}

	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		outputStream = "";
		overridePrintStatements();
		Lab01.problem2();
		resetPrintStream();
		String expectedOutput = "-5 0 5 10 15 20 25 30";
		
		try {
			Assertions.assertTrue(outputStream.equals(expectedOutput)
					|| outputStream.equals(expectedOutput + "\n")
					|| outputStream.equals(expectedOutput + " ")
					|| outputStream.equals(expectedOutput + " \n"));
			System.out.println("Test problem1() #2: Passed\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Test problem1() #2: Failed");
			System.out.println("   Expected Output: \n" + expectedOutput);
			System.out.println("   Your Output: \n" + outputStream + "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		outputStream = "";
		overridePrintStatements();
		Lab01.problem3();
		resetPrintStream();
		String expectedOutput = "1000, 500, 250, 125, 62, 31, 14, 7, 3, 1, 0";
		
		try {
			Assertions.assertTrue(outputStream.equals(expectedOutput)
					|| outputStream.equals(expectedOutput + "\n")
					|| outputStream.equals(expectedOutput + " ")
					|| outputStream.equals(expectedOutput + " \n"));
			System.out.println("Test problem1() #3: Passed\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Test problem1() #3: Failed");
			System.out.println("   Expected Output: \n" + expectedOutput);
			System.out.println("   Your Output: \n" + outputStream + "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		outputStream = "";
		overridePrintStatements();
		Lab01.problem4();
		resetPrintStream();
		String expectedOutput = "2 -4 8 -16 32 -64";
		
		try {
			Assertions.assertTrue(outputStream.equals(expectedOutput)
					|| outputStream.equals(expectedOutput + "\n")
					|| outputStream.equals(expectedOutput + " ")
					|| outputStream.equals(expectedOutput + " \n"));
			System.out.println("Test problem1() #4: Passed\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Test problem1() #4: Failed");
			System.out.println("   Expected Output: \n" + expectedOutput);
			System.out.println("   Your Output: \n" + outputStream + "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		outputStream = "";
		overridePrintStatements();
		Lab01.problem5();
		resetPrintStream();
		String expectedOutput = "2 4 8 10 14 16 20 22 26 28 32 34";
		
		try {
			Assertions.assertTrue(outputStream.equals(expectedOutput)
					|| outputStream.equals(expectedOutput + "\n")
					|| outputStream.equals(expectedOutput + " ")
					|| outputStream.equals(expectedOutput + " \n"));
			
			System.out.println("Test problem1() #5: Passed\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Test problem1() #5: Failed");
			System.out.println("   Expected Output: \n" + expectedOutput);
			System.out.println("   Your Output: \n" + outputStream + "\n\n\n\n");
			Assertions.fail();
		}
	}
	

	
	
	
	
	
	
	private void overridePrintStatements() {
		System.setOut(new PrintStream(System.out) {
			
			//override all println()s
			public void println() {
				printCalled("\n");
			}
			public void println(boolean b) {
				printCalled(String.valueOf(b) + "\n");
			}
			public void println(char c) {
				printCalled(String.valueOf(c) + "\n");
			}
			public void println(char[] s) {
				printCalled(String.valueOf(s) + "\n");
			}
			public void println(double d) {
				printCalled(String.valueOf(d) + "\n");
			}
			public void println(float f) {
				printCalled(String.valueOf(f) + "\n");
			}
			public void println(int i) {
				printCalled(String.valueOf(i) + "\n");
			}
			public void println(long l) {
				printCalled(String.valueOf(l) + "\n");
			}
			public void println(Object obj) {
				printCalled(String.valueOf(obj) + "\n");
			}
			public void println(String str) {
				printCalled(str + "\n");
			}
			
			
			//override printf()
			public void printf(String str) {
				printCalled(str);
			}
			
			
			//override all print()s
			public void print(boolean b) {
				printCalled(String.valueOf(b));
			}
			public void print(char c) {
				printCalled(String.valueOf(c));
			}
			public void print(char[] s) {
				printCalled(String.valueOf(s));
			}
			public void print(double d) {
				printCalled(String.valueOf(d));
			}
			public void print(float f) {
				printCalled(String.valueOf(f));
			}
			public void print(int i) {
				printCalled(String.valueOf(i));
			}
			public void print(long l) {
				printCalled(String.valueOf(l));
			}
			public void print(Object obj) {
				printCalled(String.valueOf(obj));
			}
			public void print(String str) {
				printCalled(str);
			}
			
			
		});

	}
	
	
	private void printCalled(String str) {
		outputStream += str; 
	}
	
	
	private void provideInput(String data) {
		testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}
	
	private void resetPrintStream() {
		System.setOut(systemOut);
		System.setIn(systemIn); 
	}
	
	@AfterAll
	static void afterAll() {
		System.setOut(systemOut);
		System.setIn(systemIn);
	}
	
}

package test.automation;

import org.testng.annotations.Test;

public class MainTest {

	@Test (groups = {"trialtest"})
	public void testTestNG () {
		System.out.println("I am test");
	}
	
	@Test (groups = {"trialtast"})
	public void testNext () {
		System.out.println ("I am next test");
	}
	
	@Test (groups = {"secondTrialTest"})
	public void testNext2 () {
		System.out.println ("I am second Test");
	}
	
	
	/*public static void main(String[] args) {
		System.out.println("Test java 9 in Eclipse");
		
		int result;
		int a = 10;
		int b = 12;
		int d = b - a;
		result = a * b / d;
		System.out.println(result);
	}*/

}

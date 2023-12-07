package basic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class asserts {
	@Test
	   public void testAdd() {

	      int num= 5;
	      String str= "Abc";

	      assertEquals("Abc", str);

	      assertFalse(num > 6);
	      assertNotEquals(str);
	   }
	}

	public class Man {
	   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestJunit.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   }

}

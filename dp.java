package basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp {
	 @DataProvider(name = "numbersDataProvider")
	    public Object[][] provideNumbers() {
	        return new Object[][]{
	                {2, 3, 5},  
	                {5, 7, 12}, 
	                {8, 4, 12}  
	        };
	    }

	    @Test(dataProvider = "numbersDataProvider")
	    public void testAddition(int num1, int num2, int expectedSum) {
	        int actualSum = addNumbers(num1, num2);

	        
	        assert actualSum == expectedSum : "Sum is incorrect";

	        System.out.println("Test Passed: " + num1 + " + " + num2 + " = " + actualSum);
	    }

	    private int addNumbers(int a, int b) {
	        return a + b;
	    }

}

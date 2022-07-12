package com.iiht.evaluation.automation.functional;


import static com.iiht.evaluation.automation.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.automation.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.automation.testutils.TestUtils.yakshaAssert;


import java.io.IOException;

import org.junit.jupiter.api.Test;



import com.iiht.evaluation.automation.App;


public class AutomationTest {
	
	@Test
	public void testGetTitle() throws IOException {
		App app = new App();
		String title = app.getTitle();
		System.out.println("Title : " + title);
		
		yakshaAssert(currentTest(), 
				title.equals("Yaksha Assessment Platform | Build better tech teams"),	
				businessTestFile);
		
	}
}


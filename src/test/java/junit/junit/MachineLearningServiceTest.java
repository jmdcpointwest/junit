package junit.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.service.impl.MachineLearningService;

public class MachineLearningServiceTest {
	
	private MachineLearningService machineLearningService = new MachineLearningService();

	@Test
	public void test() {
//		fail("Not yet implemented");
		assertTrue(machineLearningService.isValid("true"));
	}

}

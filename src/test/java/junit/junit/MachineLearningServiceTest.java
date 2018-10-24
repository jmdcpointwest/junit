package junit.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.service.impl.MachineLearningService;

public class MachineLearningServiceTest {
	
	private MachineLearningService machineLearningService = new MachineLearningService();

	@Test
	public void testIfTrue() {
//		fail("Not yet implemented");
		assertTrue(machineLearningService.isValid("true"));
	}
	
	@Test
	public void testIfFalse() {
		assertFalse(machineLearningService.isValid("false"));
	}

}

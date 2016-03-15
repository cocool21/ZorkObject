import static org.junit.Assert.*;

import org.junit.Test;
public class TestName {
	private Room r=new Room();
	@Test
	public void testName() {
		r.setName("*&@#");
		assertTrue(r.getName().equals("You are in the *&@#"));
		System.out.println("Correct");
	}
	
}

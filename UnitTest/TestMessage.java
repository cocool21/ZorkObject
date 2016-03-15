import static org.junit.Assert.*;

import org.junit.Test;
public class TestMessage {
	@Test
	public void testMessage() {
		Room r=new Room();
		r.setMessage("Hello");
		assertTrue(r.getMessage().equals("Hello"));
		System.out.println("Correct");
	}
	@Test
	public void testNewMessage() {
		Room r=new Room();
		r.setMessage("Hello");
		r.setMessage("hello");
		assertFalse(r.getMessage().equals("Hello"));
		System.out.println("Correct");
	}
}

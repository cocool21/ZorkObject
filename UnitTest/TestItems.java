import static org.junit.Assert.*;

import org.junit.Test;
public class TestItems {
	@Test
	public void testItem1() {
		Room r=new Room();
		r.addItems("book");
		assertEquals(r.getItems().get(0),"book");
		System.out.println("Correct");
	}
	@Test
	public void testItem2() {
		Room r=new Room();
		r.addItems("book");
		r.addItems("tomato");
		assertEquals(r.getItems().get(1),"tomato");
		System.out.println("Correct");
	}
}

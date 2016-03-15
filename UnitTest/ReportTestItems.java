import static org.junit.Assert.*;

import org.junit.Test;
public class ReportTestItems {
	@Test
	public void testItem1() {
		Report r=new Report();
		r.setItems("book");
		assertEquals(r.getItems().get(0),"book");
		System.out.println("Correct");
	}
	@Test
	public void testItem2() {
		Report r=new Report();
		r.setItems("book");
		r.setItems("tomato");
		assertEquals(r.getItems().get(1),"tomato");
		System.out.println("Correct");
	}
}

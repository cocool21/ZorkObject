import static org.junit.Assert.*;

import org.junit.Test;
public class TestTimes {
	@Test
	public void testItem1() {
		Report r=new Report();
		r.setTimes(20);
		assertEquals(r.getTimes(),20);
		System.out.println("Correct");
	}
	
}

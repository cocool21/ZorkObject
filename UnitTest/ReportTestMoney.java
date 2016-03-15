import static org.junit.Assert.*;

import org.junit.Test;
public class ReportTestMoney {
	@Test
	public void testMoney() {
		Report r=new Report();
		r.addMoney(1000);
		assertTrue(r.getMoney()==1000);
		System.out.println("Correct");
	}
	@Test
	public void testAddMoney() {
		Report r=new Report();
		r.addMoney(1000);
		r.addMoney(200);
		assertTrue(r.getMoney()==1200);
		System.out.println("Correct");
	}
}

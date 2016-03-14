import static org.junit.Assert.*;

import org.junit.Test;

public class HouseTest {

	@Test
	public void test() {
		Report r=new Report();
		r.addMoney(1000);
		r.addMoney(1000);
		assertNotEquals("I expect 1000",r.getMoney(),1000);
	}
	
	@Test
	public void testNegative(){
		Report r=new Report();
		r.addMoney(-1);
		assertEquals("I expected -1",r.getMoney(),-1);
	}
	@Test
	public void testLarge(){
		Report r=new Report();
		r.addMoney(400000);
		assertEquals("I expected 400000",r.getMoney(),400000);
	}

}

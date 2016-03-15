import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTestMoney {
 private Room r=new Room();
	@Test
	public void testMoney() {
		assertTrue(r.getMoney()<1000);
		System.out.println("Correct");
	}
	
	@Test
	public void testMoneyNegative(){
		
		assertTrue(r.getMoney()>0);
		System.out.println("Correct");
	}
	@Test
	public void testMoneyZero(){
		r.IsVisted();
		assertTrue(r.getMoney()==0);
		System.out.println("Correct");
	}
	

}

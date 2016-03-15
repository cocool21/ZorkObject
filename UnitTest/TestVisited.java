import static org.junit.Assert.*;

import org.junit.Test;
public class TestVisited {
@Test
public void TestNotVisted(){
	Room r=new Room();
	assertEquals(r.getCount(),0);
	System.out.println("Correct");
}
@Test
public void TestVisited(){
	Room r=new Room();
	r.IsVisted();
	r.IsVisted();
	r.IsVisted();
	assertEquals(r.getCount(),3);
	System.out.println("Correct");
}
}

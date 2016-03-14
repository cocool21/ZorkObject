import java.util.ArrayList;
import java.util.Random;

public class Room extends Room0{
	private boolean isVisted=false;
	private int count=0;
	private int money;
	
	private ArrayList<String> items=new ArrayList<String>();

	
	public int getMoney(){
		return money;
	}
	public void IsVisted() {
		this.isVisted = true;
		money=0;
		count++;
	}
	public int getCount(){
		return count;
	}
	
	public ArrayList<String> getItems() {
		return items;
	}
	public void addItems(String item) {
		this.items.add(item);
	}
	
	public Room(){
		Random rnd=new Random();
		money=rnd.nextInt(1001);
    }

}

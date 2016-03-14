import java.util.ArrayList;
import java.util.Random;

public class Room {
	private String name;
	private boolean isVisted=false;
	private int count=0;
	private int money;
	private String message;
	private ArrayList<String> items=new ArrayList<String>();
public String getName() {
		return "You are in the "+name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage(){
		return message;
	}
	public Room(){
		Random rnd=new Random();
		money=rnd.nextInt(1001);
    }

}

import java.util.ArrayList;

public class Report {
    private int times=0;
    private int money=0;
	private ArrayList<String> items=new ArrayList<String>();
	public ArrayList<String> getItems() {
		return items;
	}
	public void setItems(String item) {
		this.items.add(item);
	}
    public int getMoney() {
		return money;
	}
	public void addMoney(int money) {
		this.money += money;
	}
	public Report(){
    	
    }
    public int getTimes(){
    	return times;
    }
    public void setTimes(int value){
    	times+=value;
    }
}

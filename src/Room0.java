
public abstract class Room0 {
	private String name;
	private String message;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "You are in the "+name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage(){
		return message;
	}
	
}

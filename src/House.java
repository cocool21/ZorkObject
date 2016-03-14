import java.util.Scanner;
import java.util.Random;
public class House {
	public static void main(String[] args) {
		boolean isSecret=true;
		boolean quit=false;
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		String direction;
		
       //room1
		Room foyer=new Room();
		foyer.addItems("a dead scorpion");
		foyer.setName("Foyer");
		foyer.setMessage(" to the north (n) or the south (s)");
		
		//room2
		Room front=new Room();
		front.addItems("a piano");
		front.setName("Front Room");
		front.setMessage(" to the east (e), the south (s) or the west (w)");
		//room3
		Room library=new Room();
		library.addItems("spiders");
		library.setName("Library");
		library.setMessage(" to the north (n) or the east (e)");
		//room4
		Room kitchen=new Room();
		kitchen.addItems("bats");
		kitchen.setName("Kitchen");
		kitchen.setMessage(" to the north (n) or the west (w)");
		//room5
		Room dining=new Room();
		dining.addItems("dust and an empty box");
		dining.setName("Dining Room");
		dining.setMessage(" to the south (s)");
		//room6
		Room vault=new Room();
		vault.addItems("three walking skeletons");
		vault.setName("Vault");
		vault.setMessage(" to the east (e)");
		//room7
		Room parlor=new Room();
		parlor.addItems("a treasure chest");
		parlor.setName("Parlor");
		parlor.setMessage(" to the west (w) or the south (s)");
		//room8
		Room secret=new Room();
		secret.addItems("piles of gold");
		secret.setName("Secret Room");
		secret.setMessage(" to the west (w)");
		//the place I am at
		Room where=new Room();
		where=foyer;
		
			
			while(quit==false){
		
		if(where==foyer){
			foyer.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("n")){
				where=front;
			}else if(direction.toLowerCase().equals("s")){
				quit=true;
			}
		}else if(where==front){
			front.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("s")){
				where=foyer;
			}else if(direction.toLowerCase().equals("e")){
				where=kitchen;
			}else if(direction.toLowerCase().equals("w")){
				where=library;
			}
			
		}else if(where==library){
			library.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("n")){
				where=dining;
			}else if(direction.toLowerCase().equals("e")){
				where=front;
			}
			
		}else if(where==kitchen){
			kitchen.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("n")){
				where=parlor;
			}else if(direction.toLowerCase().equals("w")){
				where=front;
			}
			
		}else if(where==dining){
			dining.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("s")){
				where=library;
			}
			
		}else if(where==vault){
			vault.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(isSecret==true){
				if(direction.toLowerCase().equals("e")){
					where=parlor;
				}
			}else{
				if(direction.toLowerCase().equals("n")){
					where=parlor;
				}else if(direction.toLowerCase().equals("s")){
					where=secret;
				}
			}
			
			
		}else if(where==parlor){
			parlor.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("w")){
				int i=rnd.nextInt(4)+1;
				if(i==3){
					vault.setMessage(" to the east normal door(n) or secret door(s)");
				    isSecret=false;
				}
				where=vault;
			}else if(direction.toLowerCase().equals("s")){
				where=kitchen;
			}
			
		}else if(where==secret){
			secret.IsVisted();
			Println(where.getName());
			for(String item:where.getItems()){
				Println(item);
			}
			Println("You can go"+where.getMessage());
			direction=sc.next();
			if(direction.toLowerCase().equals("w")){
				where=vault;
			}
		}else{
			
		}
			}
		
		Report rep=new Report();
		rep.setTimes(foyer.getCount()+front.getCount());
		Println(rep.getTimes());
		
		
	
}
	public static void Println(Object value){
		System.out.println(value);
	}
}

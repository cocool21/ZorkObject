import java.util.Scanner;
import java.util.Random;

public class House {
	public static void main(String[] args) {
		boolean isSecret = true;
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		String direction;

		// room1
		Room foyer = new Room();
		foyer.addItems("a dead scorpion");
		foyer.setName("Foyer");
		foyer.setMessage(" to the north (n) or the south (s)");

		// room2
		Room front = new Room();
		front.addItems("a piano");
		front.setName("Front Room");
		front.setMessage(" to the east (e), the south (s) or the west (w)");
		// room3
		Room library = new Room();
		library.addItems("spiders");
		library.setName("Library");
		library.setMessage(" to the north (n) or the east (e)");
		// room4
		Room kitchen = new Room();
		kitchen.addItems("bats");
		kitchen.setName("Kitchen");
		kitchen.setMessage(" to the north (n) or the west (w)");
		// room5
		Room dining = new Room();
		dining.addItems("dust and an empty box");
		dining.setName("Dining Room");
		dining.setMessage(" to the south (s)");
		// room6
		Room vault = new Room();
		vault.addItems("three walking skeletons");
		vault.setName("Vault");
		vault.setMessage(" to the east (e)");
		// room7
		Room parlor = new Room();
		parlor.addItems("a treasure chest");
		parlor.setName("Parlor");
		parlor.setMessage(" to the west (w) or the south (s)");
		// room8
		Room secret = new Room();
		secret.addItems("piles of gold");
		secret.setName("Secret Room");
		secret.setMessage(" to the west (w)");
		// the place I am at
		Room where = new Room();
		Report rep = new Report();
		where = foyer;

		while (quit == false) {

			if (where == foyer) {
				rep.setTimes(1);
				rep.addMoney(foyer.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (foyer.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				foyer.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("n")) {
					where = front;
				} else if (direction.toLowerCase().equals("s")) {
					quit = true;
				}
			} else if (where == front) {
				rep.setTimes(1);
				rep.addMoney(front.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (front.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				front.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("s")) {
					where = foyer;
				} else if (direction.toLowerCase().equals("e")) {
					where = kitchen;
				} else if (direction.toLowerCase().equals("w")) {
					where = library;
				}

			} else if (where == library) {
				rep.setTimes(1);
				rep.addMoney(library.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (library.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				library.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("n")) {
					where = dining;
				} else if (direction.toLowerCase().equals("e")) {
					where = front;
				}

			} else if (where == kitchen) {
				rep.setTimes(1);
				rep.addMoney(kitchen.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (kitchen.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				kitchen.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("n")) {
					where = parlor;
				} else if (direction.toLowerCase().equals("w")) {
					where = front;
				}

			} else if (where == dining) {
				rep.setTimes(1);
				rep.addMoney(dining.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (dining.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				dining.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("s")) {
					where = library;
				}

			} else if (where == vault) {
				rep.setTimes(1);
				rep.addMoney(vault.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (vault.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				vault.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (isSecret == true) {
					if (direction.toLowerCase().equals("e")) {
						where = parlor;
					}
				} else {
					if (direction.toLowerCase().equals("n")) {
						where = parlor;
					} else if (direction.toLowerCase().equals("s")) {
						where = secret;
					}
				}

			} else if (where == parlor) {
				rep.setTimes(1);
				rep.addMoney(parlor.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (parlor.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				parlor.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("w")) {
					int i = rnd.nextInt(4) + 1;
					if (i == 3) {
						vault.setMessage(" to the east normal door(n) or secret door(s)");
						isSecret = false;
					}
					where = vault;
				} else if (direction.toLowerCase().equals("s")) {
					where = kitchen;
				}

			} else if (where == secret) {
				rep.setTimes(1);
				rep.addMoney(secret.getMoney());
				Println(where.getName());
				for (String item : where.getItems()) {
					Println("You see " + item);
					if (secret.getMoney() != 0) {
						rep.setItems(item);
					}
				}
				secret.IsVisted();
				Println("You can go" + where.getMessage());
				direction = sc.next();
				if (direction.toLowerCase().equals("w")) {
					where = vault;
				}
			} else {

			}
		}
		sc.close();

		Println("You get $" + rep.getMoney());
		Println("You visted rooms " + (rep.getTimes()) + " times");
		for (String item : rep.getItems()) {
			Println("You saw " + item);
		}

	}

	public static void Println(Object value) {
		System.out.println(value);
	}
}

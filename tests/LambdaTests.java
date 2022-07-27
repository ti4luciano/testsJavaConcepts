package tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Concepts.Showing;
import model.User;

public class LambdaTests {

	public static void main(String... args) {
		User usr1 = new User("Lucivaldo", 36);
		User usr2 = new User("Lucivania", 33);
		User usr3 = new User("Luciano", 31);

		List<User> users = Arrays.asList(usr1, usr2, usr3);

		for (User u : users) {
			System.out.println("Show user " + u.getName());
		}
		
		users.forEach(u->System.out.println("Foreach with user " + u.getName()));
		
		Showing show = new Showing();
		users.forEach(show);
	}

}

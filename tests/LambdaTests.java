package tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Concepts.Showing;
import model.User;
import model.Validador;

public class LambdaTests {

	public static void main(String... args) {
		User usr1 = new User("Lucivaldo", 36);
		User usr2 = new User("Lucivania", 33);
		User usr3 = new User("Luciano", 31);

		List<User> users = Arrays.asList(usr1, usr2, usr3);

		for (User u : users) {
			System.out.println("Show user " + u.getName());
		}

		users.forEach(u -> System.out.println("Foreach with user " + u.getName()));

		Showing show = new Showing();
		users.forEach(show);
		
		
		new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
			//	System.out.print("Thread " + i + ", ");
			}
		}).start();
		
		Validador<String> validaCep = new Validador<String>() {
			@Override
			public boolean valida(String t) {
				return t.matches("[0-9]{5}-[0-9]{3}");
			}
		};
		
		
		System.out.println("Cep OK? " + validaCep.valida("60510-175"));
		
		Validador<String> validaCep2 = v -> v.matches("[0-9]{5}-[0-9]{3}");
		
		System.out.println("Cep2 OK? " + validaCep2.valida("60510-175"));
		
		
		
		Runnable r = () -> {System.out.println("Some test");};
		
		System.out.println(r);
		System.out.println(r.getClass());
		
		Consumer<User> mostraMsg = u -> System.out.println("A message");
		Consumer<User> showName = u -> System.out.println("Name " + u.getName());
		
		users.forEach(mostraMsg.andThen(showName));
		
		
	}
}

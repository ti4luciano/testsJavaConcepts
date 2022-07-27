package Concepts;

import java.util.function.Consumer;

import model.User;


/*
 * Com os conceitos do java 8 a interface Consumer por possuir apenas um método
 * assim como qualquer outra que tenha essa caracteristica é chamada de interface funcional*/
public class Showing implements Consumer<User>{

	@Override
	public void accept(User t) {
		System.out.println("Using class showing " + t.getName());
		
	}
}

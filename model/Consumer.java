package model;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
	void acept(T t);

	default Consumer<T> andThen(Consumer<? super T> after){
		Objects.requireNonNull(after);
		return (T t) -> {acept(t); after.acept(t);}; 
	}
	
}

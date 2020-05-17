package tobias.saul.functional.finalsection;

import java.util.function.Consumer;

public class Callback {
	
	public static void main(String[] args) {
		
		hello("saul", null, value -> {
			System.out.println("no last name provided for " + value);
		});
		
	}
	
	static void hello(String first, String last, Consumer<String> callback) {
		System.out.println(first);
		if(last != null) {
			System.out.println(last);
		} else {
			callback.accept(first);
		}
	}

}

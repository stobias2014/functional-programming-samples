package tobias.saul.functional.optionals;

import java.util.Optional;

public class OptionalsApplication {
	
	public static void main(String[] args) {
		Object value = Optional.ofNullable("not null")
				.orElseGet(() -> "default value");
		
		System.out.println(value);
		
	}

}

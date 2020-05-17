package tobias.saul.functional.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
	
	public static void main(String[] args) {
		
		Function<String, String> upperCaseName = name -> name.toUpperCase();
		System.out.println(upperCaseName.apply("saul"));
		
		Function<String, String> upperCaseNameMethodReference = String::toUpperCase;
		System.out.println(upperCaseNameMethodReference.apply("saul"));
		
		BiFunction<String, Integer, String> upperCaseNameBifunction = (name, age) -> {
			if(name.isBlank()) {
				System.out.println("no name provided");
			}
			System.out.println(age);
			return name.toUpperCase();
		};
		
		upperCaseNameBifunction.apply(" ", 18);
		
	}

}

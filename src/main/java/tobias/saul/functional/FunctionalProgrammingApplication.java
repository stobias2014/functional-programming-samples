package tobias.saul.functional;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.function.Predicate;

public class FunctionalProgrammingApplication {

	public static void main(String[] args) {

		List<Person> people = List.of(
				new Person("John", Gender.MALE), 
				new Person("Bill", Gender.MALE),
				new Person("Mary", Gender.FEMALE), 
				new Person("Rose", Gender.FEMALE), 
				new Person("Paul", Gender.MALE));

		// imperative approach
		System.out.println("Imperative approach");
		List<Person> females = new ArrayList<Person>();
		for (Person person : people) {
			if (Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}

		for (Person female : females) {
			System.out.println(female);
		}

		// declarative approach
		System.out.println("\nDeclarative approach");
		
		//boolean valued function of one argument
		Predicate<Person> isFemalePredicate = person -> Gender.FEMALE.equals(person.gender);
		
		people.stream()
			.filter(isFemalePredicate)
			//.collect(Collectors.toList())
			.forEach(System.out::println);

	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE
	}

}

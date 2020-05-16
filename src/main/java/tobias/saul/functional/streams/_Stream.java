package tobias.saul.functional.streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
	
	public static void main(String[] args) {
		
		List<Person> people = List.of(
				new Person("Johny", Gender.MALE), 
				new Person("Bill", Gender.MALE),
				new Person("Mary", Gender.FEMALE), 
				new Person("Rose", Gender.FEMALE), 
				new Person("Paul", Gender.MALE));
		
		people.stream()
			.map(person -> person.name)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		System.out.println();
		
		people.stream()
			.map(person -> person.name)
			.map(name -> name.length())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		//does all person's gender in stream match gender female
		System.out.println(people.stream()
			.allMatch(person -> Gender.FEMALE.equals(person.gender)));
		
		//does any person's gender in stream match gender female
		System.out.println(people.stream()
			.anyMatch(person -> Gender.FEMALE.equals(person.gender)));
			
		
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

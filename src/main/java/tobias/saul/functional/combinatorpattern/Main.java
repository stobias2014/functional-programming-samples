package tobias.saul.functional.combinatorpattern;

import java.time.LocalDate;

//combinator pattern takes in different functions and combines them to produce a result

public class Main {
	
	public static void main(String[] args) {
		Customer customer = new Customer("Alice", "alice@email.com", "+038599433", LocalDate.of(2017, 6, 2));
		
		CustomerValidator validatorService = new CustomerValidator();
		System.out.println(validatorService.isValid(customer));
		
		System.out.println();
		
		// if valid customer can be stored in DB
		
		// using combinator pattern
		ValidationResult result = CustomerRegistrationValidator.isEmailValid()
			.and(CustomerRegistrationValidator.isPhoneNumberValid())
			.and(CustomerRegistrationValidator.isAnAdult())
			.apply(customer);
		
		System.out.println(result);
		
		if(result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
		
		//lazy init
		CustomerRegistrationValidator r = CustomerRegistrationValidator.isEmailValid()
		.and(CustomerRegistrationValidator.isPhoneNumberValid())
		.and(CustomerRegistrationValidator.isAnAdult());
	}

}

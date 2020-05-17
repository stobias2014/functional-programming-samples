package tobias.saul.functional.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {
	
	private boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	private boolean isPhoneNumberValid(String phone) {
		return phone.startsWith("+0");
	}
	
	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() >= 18;
	}
	
	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail()) &&
				isPhoneNumberValid(customer.getPhoneNumber()) &&
				isAdult(customer.getDob());
	}

}

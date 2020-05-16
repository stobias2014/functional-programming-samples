package tobias.saul.functional.functionalinterface;

import java.util.function.Predicate;

//Predicate: boolean based function of one argumnent
public class _Predicate {
	
	public static void main(String[] args) {
		
		//regular function
		System.out.println("Without predicate");
		System.out.println(isPhoneNumberValid("0700000"));
		System.out.println(isPhoneNumberValid("07000000000"));
		
		//predicate
		System.out.println("With predicate");
		System.out.println(isPhoneNumberValidPredicate.test("0700000"));
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		
		System.out.println(isPhoneNumberValidPredicate.and(doesPhoneNumberContainNumber3).test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.and(doesPhoneNumberContainNumber3).test("07000000003"));
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> 
							phoneNumber.startsWith("07") && phoneNumber.length() == 11;
							
	static Predicate<String> doesPhoneNumberContainNumber3 = phoneNumber ->
							phoneNumber.contains("3");
 	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() ==11;
	}

}

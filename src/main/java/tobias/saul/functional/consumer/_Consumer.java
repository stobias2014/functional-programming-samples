package tobias.saul.functional.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer: accepts single argument and return no result

public class _Consumer {
	
	public static void main(String[] args) {
		
		//regular function
		greetCustomer(new Customer("Maria", "999999"));
		
		//consumer
		greetCustomerConsumer.accept(new Customer("Maria", "999999"));
		
		//biconsumer: accepts two arguments and produces no result
		greetCustomerBiConsumer.accept(new Customer("Maria", "999999"), false);
		greetCustomerBiConsumer.accept(new Customer("Maria", "999999"), true);
		
		
	}
	
	static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> 
	System.out.println("Hello " + customer.name + " Phone: " + (showPhoneNumber ? customer.phone : "******")); 
	
	static Consumer<Customer> greetCustomerConsumer = customer -> 
				System.out.println("Hello " + customer.name + " Phone: " + customer.phone); 
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.name + " Phone: " + customer.phone);
	}
	
	static class Customer {
		private final String name;
		private final String phone;
		
		public Customer(String name, String phone) {
			super();
			this.name = name;
			this.phone = phone;
		}
		
		
	}

}

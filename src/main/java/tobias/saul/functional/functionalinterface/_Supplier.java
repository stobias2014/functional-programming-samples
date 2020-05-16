package tobias.saul.functional.functionalinterface;

import java.util.function.Supplier;

//represents a supplier of results, takes no arguments
public class _Supplier {
	
	public static void main(String[] args) {
		
		System.out.println(getDbConnectionUrl());
		System.out.println(getDbConnectionUrlSupplier.get());
		
	}
	
	static Supplier<String> getDbConnectionUrlSupplier = () 
			-> "jdbc://localhost:5432/users";
	
	static String getDbConnectionUrl() {
		return "jdbc://localhost:5432/users";
	}

}

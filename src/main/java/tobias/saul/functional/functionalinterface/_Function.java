package tobias.saul.functional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		
		//Function
		System.out.println("Using regular function");
		int increment = incrementByOne(5);
		System.out.println(increment);
		System.out.println("--------");
		System.out.println("Function accepts one argument and produces one argument");
		Integer incrementedByFunction = incrementByOneFunction.apply(5);
		System.out.println("incrementByFunction: " + incrementedByFunction);
		
		int multipliedBy10 = multiplyBy10Function.apply(incrementedByFunction);
		System.out.println("multiplyBy10Function: " + multipliedBy10);
		
		Function<Integer, Integer> addByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
		System.out.println("addByOneThenMultiplyBy10: " + addByOneThenMultiplyBy10.apply(5));
		System.out.println("----------");
		
		//BiFunction
		System.out.println("BiFunction accepts two argument and produces one argument");
		System.out.println("Regular: " + incrementByOneAndMultiply(1, 10));
		System.out.println("BiFunction: " + incrementByOneAndMultiplyFunction.apply(1, 10));
		
		
	}
	
	//function accepts one argument and produces one result
	static Function<Integer, Integer> incrementByOneFunction = number -> number++;
	
	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
	
	static int incrementByOne(int number) {
		return number++;
	}
	
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction = 
			(numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne++) * numberToMultiply;
	
	static int incrementByOneAndMultiply(int number, int numberToMultiply) {
		return (number++) * numberToMultiply;
	}

}

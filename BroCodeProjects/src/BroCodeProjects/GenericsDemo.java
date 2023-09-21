package BroCodeProjects;

import java.util.ArrayList;

public class GenericsDemo {
	
	// With the introduction of Generic we are able to enable types to be parameters when defining classes, methods or variables
	// we can use the <T> for all reference data types
	
	public static void main(String[] args) {
		
		Integer[] intarray= {1,2,3,4,5};
		Double[] doublearray= {5.5,6.5,7.5,8.5};
		Character[] chararray= {'C','H','A','R'};
		String[] stringarray= {"S","T","R","I","N","G"};
		
		displayarray(intarray);
		
		print(intarray);
		print(doublearray);
		print(chararray);
		print(stringarray);
		
		System.out.println();
		System.out.println(getFirst(intarray));
		System.out.println(getFirst(doublearray));
		System.out.println(getFirst(chararray));
		System.out.println(getFirst(stringarray));
													// we have to define what type of value we are sending to the Generic class each time we create an instance of the Generic class
		GenericClass<Integer> myInt= new GenericClass<>(1);	 	// we do not require to give the data type in the right hand side since the 1.5 Java update
		GenericClass<Double> myDou= new GenericClass<>(5.5);
		GenericClass<Character> myChar= new GenericClass<>('H');
		GenericClass<String> myString= new GenericClass<>("Hello");
		
		ArrayList<String> myFriends= new ArrayList<>();
		
		
		System.out.println();
		System.out.println(myInt.getValue());
		System.out.println(myDou.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
	}
	
	public static void displayarray(Integer[] array) // this method have to be created for each type of data type in order to get an output
	{
		for(Integer x: array)
		{
			System.out.println(x);
		}	
		System.out.println();
	}
	
	public static <Thing> void print(Thing[] array) // whereas using generic T as in Thing we can manipulate the required data type to be used as it is.
	{
		for(Thing x: array)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static <T> T getFirst(T[] array) // we can also use the return statement using Generic
	{
		return array[0];
	}
}

class GenericClass <Thing>{ // this is a Generic class that we have made in order to get the values that is passed through specific requirements
	
	Thing x;						// we can define a Thing as Generic and then using a Constructor we can assign the value the value to the global variable and then return as requred
	
	public GenericClass(Thing x) {
		this.x= x;
	}
	
	public Thing getValue()
	{
		return x;  // Rather than creating each class for each data type, using this one Thing class we can use and assign values to the fields as and when necessary.
	}
}

// Generic class work
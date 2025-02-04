
class Notes {
	public static void main(String[] args) {

		//Output - This is the only that shows on the screen

		System.out.println("Hello World"); //new line after the output
		System.out.print(3);
		System.out.println("Same line");
		// System.out.printf(3.5);
		
		//variables - creating a variable

		//declare a variable

		int num; //integers - whole number
		String word; //Strings - text
		double fracNum; //Doubles - Fractional numbers
		boolean trueFalse; //Boolean - true or false values
		char c; //Characters - Single characters

		//naming scheme for data types
		//lowercase are primitive - cannot be broken into other data types
		//uppercase are non-primtive - can be broken into other data types
	
		//variable naming conversions!
		//all variables start with a lowercase letter ALWAYS
		//if your variable has more than one word, all following words will begin with an uppercase letter
		//camelCase <- an example and the name of it
		//variables should be obvious

		//Assigning to variables

		num = 4; //Store the value of 4 in the variable num
		//This does not mean num equals 4.
		word = "Hello World"; //Strings have double quotes around them
		fracNum = 3.5;
		trueFalse = true; //booleans in java are all lowercase
		c = '!'; //characters use single quotes, can only store a single character
	
		//Strings - escape character
		// "\" - alters the following characters functionality

		System.out.println("a\na");
		// \n - newline character
		// \t - tab
		// \" - changes the double quote from a string ending symbol to a normal character
		// \\ - changes the escape character back to a normal backslash


		//Variable - using the variable at any other point of the program
		//Variable is use anywhere except the left side of the = symbol, it is a variable call
	
		System.out.println(word);

		//These 3 are all the same
		num = num + 1; //assignment always happens LAST
		//right side happens before the left side
		num++; //can only be used to add 1
		++num;
		num += 1;

		
		// subtration (-), multiplication(*), division (/), mod(%) - gives the remainder
		// -=, *=, /=, %=

		System.out.println(7/5); //When both values being divided are integers, the result is as well
		System.out.println(3.5+7/5);

		num = 5;
		System.out.println(num++); //5

		num = 5;
		System.out.println(++num); //6

		System.out.println(10%3);

	}
}

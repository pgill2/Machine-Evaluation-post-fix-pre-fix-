package postfix;
import java.util.Scanner;
import java.io.IOException;




public class Stacks {

	/**
	 * 
	 * @param args the command line arguments
	 * 
	 */

	// SAMPLE INPUT = ABC*+DE-/     

	// So we will need to check for 4 different operators
	
	public static void main(String[] args) throws IOException {
		
		
		try {
		
		// set up an if statement conditional to check if the following is true 
	
		//what we can read in	
		String userInput;
		
		
		if (true) { // then do proceed
			
			// ask for user input
			System.out.println("User Input");
			
			// getting the user input and then we call it to solve 
			userInput = getString();
			Solve input = new Solve();

			Solve.calculate(userInput);
		}}
		
		catch (Exception e) {
			
			System.out.println("Error");
		}
	}


// scanner and taking user input - I did not implement the file input structure, so output is in console
	
	public static String getString() throws IOException {

		try {
		
		//scanner
		Scanner Scanner = new Scanner(System.in);
		String user = Scanner.nextLine();

		return user;
		
		}
		
		catch(Exception e) {
			
			return null;
			
		}
	}
}

class Stack {

	// creating our stack without using any type of library functions
	
	// top, max, and empty 
	int top;
	int capacity;
	char [] stack;

	
	public Stack (int maximum) {

		capacity = maximum;
		stack = new char[capacity];
		top = -1;
	}

	
	// push 
	
	public void push(char key) {
		
		stack[++top] = key;
	}

	
	// pop
	
	public char pop() {

		return (stack[top--]);
	}
}


// start








class Solve {

	public static void calculate(String inputIn) {
		
		// how can I check and iterate through - we will need to check operators and letters which we will be getting in the form of a string
		// then we can take that and count each character and proceed

			int user;
			user = inputIn.length();
		
		// new stack = new stack()

		Stack num = new Stack(user);

		
			// boolean values that we can use to refer in our while loops, we have a total of 4 different operators 
			// will update this later
			Boolean first = false;
			Boolean second  = false;
			Boolean third = false;
			Boolean fourth = false;
			
			
			// setting up counters, this is for our temps 
			int counter = 0;
			
			
			// how we will keep track while in the loops / if statements
			int counterLoop = 0;
			
//			// characters
//			char a = 0;
//			char b = 0;
//			char c = 0;
//			
			

		int top = num.top;
		
	
		
		// characters
		
		// initalize to zero or we get an error
		
		char a = 0;
		char b = 0;
		char c = 0;

		
		// we can iterate here and check for the characters, this one is for operators 
		
		for (int i = 0; i < user; i++) {
			
			
			// looking at operators, starting in the first index 
			char operator = inputIn.charAt(i);
			
//			while (i <= user) {
//				
//			}
//			
		
		}

		for (int i = 0; i < user; i++) {

			// while here we look at each individual characters 
			char characters = inputIn.charAt(i);

			// between these two values A - Z so it can evaluate for all the potential char values in the input
			
			
			// try catching our push/pops so we can debug or re eval in the future if necessary
			
			// range 
			if (characters >= 'A' && characters <= 'Z')	{

				try {
				// use push if those chars are present
				// and are between A - Z
				
				// push(characters)
				
				
				// push 
				
				
				
				num.push(characters);
				}
				
				catch (Exception e) {
					System.out.println("unable to push characters");
				}
			}

			else {
				
				// top of the stack is greater than or equal to zero and is less than 1 we will proceed to pop
				
				if (num.top >= 0 && num.top < 1) {
					
					try {

					//pop 1
					
					a = num.pop();
				}
					
					catch (Exception e) {
						System.out.println("recheck value, unable to pop");
					}
					
				}

				else if (num.top >= 0 && num.top < 2) {
					
					try {
					
					
					// pop 2
					a = num.pop();
					b = num.pop();
				}
					
					catch (Exception e) {
						
						System.out.println("error with popping one of two values or both");
						
					}

				} else if (num.top >= 0 && num.top < 3) {
					
					// we can go ahead and pop all of these 
					
					try {
					
					a = num.pop();
					b = num.pop();
					c = num.pop();
					}
					
					catch (Exception e) {
						System.out.println("error presented");
					}
				}
				
				
				
				// if none of the conditions meet then we can 

				if (i < user) {

					switch (characters) {

					case '+':
						
						if (counter <= 0) {

							// boolean values are all set to true when initialized 
							
							while (first == true) {

								System.out.println("LD" + a + "   "+ "AD" + "TEMP" + counter + "  " +  "ST" + "TEMP" + ++counter);


								counterLoop = counterLoop + 1;

								break;

							}
							
							while (first == true) {
							
							System.out.println("LD" + b + "  "  +  "AD" + + a + " " + "ST" + "TEMP" + counter);


							counterLoop = counterLoop + 1;
							
							break;
						
						}
							
							
						if (third == true)
								num.push(c);

						break;

						}

						else {

							while (first == true) {

								System.out.println("LD" + a + "  " + "AD" + "TEMP" + counter +  " " + "ST" + "TEMP" + ++counter);

								counterLoop = counterLoop + 1;
								
								// change it to false to exit
								first = false;

							break;

							}
							
							if (first == false) {

							System.out.println("LD" + a + "  "  + "AD" + "TEMP" + counter);
						}
						
							else if (first = true) {
								System.out.println("Error in while loop");
								
							}
							
							else {
								// maybe you could check / set - no? 

							}
							
							
							if (third == true)

								num.push(c);

						}

						break;

					case '-':
						
					if (counter <= 0) {	

							while (first == true) {

								System.out.println("LD" + a + " " + "SB" + "TEMP" + counter + " " + "ST" + "TEMP" + ++counter);


								// change to false 
								first = false;
								//count
								counterLoop += 1;

								break;

							}
							
							if (first == true) {

							System.out.println("LD" + b + " " + "SB" + a + " " + "ST" + "TEMP" + ++counter);

							//count
							counterLoop += 1;
							
							}
							
							else if (first == false) {
								System.out.println("Error in while loop");	
							}
							
							else {
								//
							}
							
							
							
							// now if third is true
							if (third == true) {
								
								// we push
								num.push(c);
							}
								// check it
								//System.out.println(z);
							
							else {
								break;
							}
							
							break;

						}

						else {

							while (first == true) {

								System.out.println("LD" + a + " " + "SB" + "TEMP" + counter + " " + "ST" + "TEMP" + ++counter);

								
								first = false;
								counterLoop += 1;

								break;

							}
							
							if (first == false) {

							System.out.println("LD" + b + " " +  "SB" + a + " " + "ST" + "TEMP" + ++counter);

							
							} 
							
							else {
							
							System.out.println("Error");
							
							}
						
							
							if (third == true)

								num.push(c);

						}

						break;

					case '*':
						
						if (counter <= 0) {

							
							// while this is true we can initiate 
							while (first == true) {

								System.out.println("LD" + a + " "  +  "ML" + "TEMP" + counter + " " +  "ST" + "TEMP" + ++counter);

								// now we will make it equal false so we can exit the while loop
								
								// false
								first = false;
									
								//count
								counterLoop += 1;
						
								break;

							}
							
							// print statements
						
						if (first == false) {
							
							System.out.println("LD" + b + "  " + "ML" + a + " " + "ST" + "TEMP" + ++counter);

							//count
							counterLoop += 1;
						
						}
						
						else {
							System.out.println("Error");
							
						}
							if (third == true)
								
								//push
								num.push(c);

							break;

						}

					else {

						while (first == true) {

							System.out.println("LD"  + a + "" + "ML" + "TEMP" + counter + " " + "ST" + "TEMP" + ++counter);

							// false 
							first = false;
							
							//count
							counterLoop += 1;

								break;

							}
						
						if (first == false) {

							System.out.println("LD" + a + " " + "ML" + "TEMP" + counter);

						}
						
						else {
							
							System.out.println("Error");
						}
						
				
							if (third == true)

								num.push(c);

						}

						break;

						
					case '/':
						
						if (counter <= 0) {

							while (first == true) {

								System.out.println("LD"  + a + " " + "DV" + "TEMP" + counter + " " + "ST"  + "TEMP" + ++counter);


								// set to false 
								first = false;
								
								//count
								counterLoop += 1;

								break;

							}
							
							
						if (first == false) {

							System.out.println("LD" + b + " " + "DV" + a + " " + "ST" + "TEMP" + ++counter);

							//count
							counterLoop += 1;
						}
						
						else if (first == true){
							
							System.out.println("Error");
						}
						
						else {
							//
						}
						
							
							if (third == true)

								//push 
								num.push(c);

							break;
						}

						else {

							while (first == true) {

								System.out.println("LD" + a + " " + "DV" + "TEMP" + counter + " " + "ST" + "TEMP" + ++counter);

								// false + count
								first = false;
								counterLoop += 1;

								break;
								
								

							}
							
							if (first == false) {

							System.out.println("LD" + a + " " +  "DV" + " " + "TEMP" + counter);

							}
							
							else if (first == true) {
								System.out.print("Recheck");
							}
							
							else {
								//
							}
							
							if (third == true)
								//push 
								num.push(c);
							}
					

						break;

					}

				}

				else {
			
			// switch here again
					
			
			switch (characters) {
			
//			if (characters >= 'A' && characters <= 'Z') {
//				
//				
//				
//			}

					// plus sign

					case '+':
						System.out.println("LD" + "TEMP" + --counter + " "  + "AD" + "TEMP" + ++counter +  " "  +  "ST" + " " +  "TEMP" + ++counter);

						
					break;

					
					// minus sign
					case '-':
						System.out.println("LD"  + "TEMP" + counter + " " +  "SB" + "TEMP" + ++counter + " " + "ST" + " " + "TEMP" + ++counter);
						
					break;

						
					// multiplication
					case '*':
						System.out.println("LD"  + "TEMP" + counter + " " + "ML" + "TEMP" + ++counter + " " + "ST" + " " + "TEMP" + ++counter);
						
					break;

					
					// divide
					case '/':
						System.out.println("LD" +  "TEMP" + --counter + " " + "DV" + "TEMP" + ++counter + " " + "ST" + "" + "TEMP" + ++counter);

						
					break;


					}

				}

			}

		}

	}

}



import java.util.ArrayList;//Need to import to be able to use array lists. I had variables not recognized before import.
import java.util.Scanner;//Need this to get user input for index value for song or movies.
import java.util.*;
public class TestCollection {

	//My GitHub link for rough copy of A3\
	//https://github.com/AllyCat13/OOP2_A3_MediaPlayer/commit/ff6a0f9146fb09900b540e4faadcfb916fce9080
	//JavaFx FXML Textbook pdf url
	//http://icarus.cs.weber.edu/~rball/JavaBook/JavaFXBook.pdf
	//Google scene builder and event handlers
	//Try adapt prof. JFX example code
	//User Oracle scene builder examples to learn how to connect
	//Java code to Scenebuilder GUI and execute on events.
	//ArrayList Methods:
	//.add() for adding elements
	//println(collection1) printing whole array in one statement.
	//.contains("Dallas") checks if element is inside slot. Boolean value.
	//.remove("Dallas") removes element from slot
	//(ArrayList<String>)(collection1.clone()) //casting clone to array list type object. Object casting.
	//ArrayList code from page 779 chapter 20 Lists, Stacks, Queues, and Priority Queues (Liang, 2011)
	//.retainAll()
	//.removeAll()

	public static void main(String[] args) {//Main method that starts when program starts.
		// TODO Auto-generated method stub
		//Songs taking from billboard.com Title: "The Hot 100"
		//https://www.billboard.com/charts/hot-100
		//Watch out ArrayList is zero based when starting at first element.
		//Going to need a for loop for sure to traverse the items in the array list and probably
		//check against a variable we store the user's input in and if the element matches the element's index
		//the current for loop iteration happens to be on then print out the content of this array list slot.
			ArrayList<String> collection1 = new ArrayList<>();//Compiler didn't like collection1 not used when created. Yellow underline.
			collection1.add("Dummy Enrty");//ArrayList index starts at zero and no user knows this.
			collection1.add("Post Malone - Circles, production year 2019");//1
			collection1.add("Roddy Rich - The Block, production year 2019");//2
			collection1.add("The Weekend - Blinding Lights, production year 2019");//3
			collection1.add("Dua Lipa - Don't Start Now, production year 2019");//4
			collection1.add("The Weekend - Heartless, production year 2019");//5
			collection1.add("Future and Drake - Life is Good, production year 2019");//6
			collection1.add("Harry Styles - Adore You, production year 2019");//7
			collection1.add("Justin Bieber and Quavo - Intentions, production year 2019");//8
			collection1.add("Doja Cat - Say So, production year 2019");//9
			collection1.add("Arizona Zervas - Roxannee, production year 2019");//10
			//End song's in list here
			//Now adding 10 movies 10 collection1 ArrayList
			//Got videos from "Esquire" from google search of "2019 movies."
			//https://www.esquire.com/entertainment/movies/g24561951/best-movies-of-2019
			collection1.add("The Death and Life of John F. Donovan, production year 2019");//11
			collection1.add("Fonzo, production year 2019");//12
			collection1.add("The Red Sea Diving Resort, production year 2019");//13
			collection1.add("J.T. Leroy, production year 2019");//14
			collection1.add("The Hummingbird Project, production year 2019");//15
			collection1.add("In the Tall Grass, production year 2019");//16
			collection1.add("Mathias and Maxime, production yer 2019");//17
			collection1.add("Run this Down, production year 2019");//18
			collection1.add("Panda vs Aliens, production year 2019");//19
			collection1.add("Genesis, production year 2019");//20

			//Next I needed to lookup how to generate random number between 1-20
			//which simulates the possible index the user might put into the
			//text box.
			//Got concepts and examples from "Geek's for Geek's"
			//https://www.geeksforgeeks.org/java-math-random-method-examples
			//store index value into an integer variable fit to hold it.
			//Then I googled how to check in Java if input is a number.
			//I'm working on exception handling for user input now.
			//I'm starting small before I put them into try catch.
			//I'm going to check if is number and if is in range 1-20.

			//Found this way to check if input variable has a number value from stack overflow web site.
			//https://stackoverflow.com/questions/19925047/how-to-check-the-input-is-an-integer-or-not-in-java
			//Found this way to check the scanner object before putting it into a variable of that's
			//Expecting a certain data type.
			//https://www.quora.com/How-do-you-check-whether-a-user-enters-an-integer-input-character-input-or-string-input-in-Java

			//had to declare this var at top so I could use it elsewhere and inside other
			//place but still wanting the same storage bin to be accessed and changed from different places.
			int userIndex = 0;
			Scanner scanner = new Scanner(System.in);//Creating scanner object variable.

			//I'm most proud of this challenge I overcame close to end of coding processing of app
			//I had trouble performing both checks of number between range and if number.
			//This first checks if number is in range and then steps inside
			//to not let anyone pass until the number is in range.
			//Then call method to validate if number when assigning scanner object to
			//user index variable after each iteration of asking and store user input.
			if(userIndex >= 1 && userIndex <= 20){
			userIndex = validateIfNumber(scanner);
			}
			else{
				boolean inputIsValid = false;
				while(!inputIsValid){
					userIndex = validateIfNumber(scanner);
					if(userIndex >= 1 && userIndex <= 20)
					{
						inputIsValid = true;
					}

				}

			}
			//Method I created where I put try catch to check for number
			//in a method. It's cleaner coding and the method can be used in 1 statement on
			//any scanner object elsewhere in the program. I got the code from my first assignment.
			//I remember finding a similar example on the web.

			//userIndex = validateIfNumberBetweenRange(userIndex, scanner);















			//This for loop checks each element at each slot and
			//compares them to see if their equal and if they are
			//They can print the element at this location.
			for(int i = 1; i < collection1.size(); i++){
				//This for loop checks each element one slot at a time
					if(userIndex == collection1.indexOf(collection1.get(i))){
						//This if statement checks if the index of the element stored
						//here matches the random number between 1-20 that simulates
						//what a user might input as an index value into an text field.
						System.out.println(collection1.get(i));
					}
			}




			//Tried to print file1 to see if that's how you display the image
			//It did not work.
			//It just printed the URL path as string output.
			//Page 480 Chapter 12 Liang (2011), has the print writer class
			//This class has methods for printing file objects.
			//I was wrong. Need to use javafx and image class.



	}//End Main method


	//Need to clear scanner object or my while loops always think
	//There's a string in there and they never get to
	//If loop where a number is entered and my boolean switch
	//Can get flipped to say the loop can end.

	//Method returns integer value
	//Method requires a scanner object parameter it can access and change.
	public static int validateIfNumber(Scanner scanner){
	boolean continueInput = true;
	int userIndex = 0;
	do {
		try {
			System.out.println("Enter input as integer");
			userIndex = scanner.nextInt();
			continueInput = false;
			return userIndex;
		}
		catch (InputMismatchException ex) {
			System.out.println("try again, must be an integer");
			scanner.nextLine();
		}
	}
	while(continueInput);
	return userIndex;

	}//End number validate method


//End Testing Collection class
}

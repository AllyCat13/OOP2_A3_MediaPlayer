
import java.util.ArrayList;//Need to import to be able to use array lists. I had variables not recognized before import.
import java.util.Scanner;//Need this to get user input for index value for song or movies.
public class TestCollection {


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
			collection1.add("Post Malone - Circles, production year 2019");//0
			collection1.add("Roddy Rich - The Block, production year 2019");//1
			collection1.add("The Weekend - Blinding Lights, production year 2019");//2
			collection1.add("Dua Lipa - Don't Start Now, production year 2019");//3
			collection1.add("The Weekend - Heartless, production year 2019");//4
			collection1.add("Future and Drake - Life is Good, production year 2019");//5
			collection1.add("Harry Styles - Adore You, production year 2019");//6
			collection1.add("Justin Bieber and Quavo - Intentions, production year 2019");//7
			collection1.add("Doja Cat - Say So, production year 2019");//8
			collection1.add("Arizona Zervas - Roxannee, production year 2019");//9
			//End song's in list here
			//Now adding 10 movies 10 collection1 ArrayList
			//Got videos from "Esquire" from google search of "2019 movies."
			//https://www.esquire.com/entertainment/movies/g24561951/best-movies-of-2019
			collection1.add("The Death and Life of John F. Donovan, production year 2019");//1
			collection1.add("Fonzo, production year 2019");//2
			collection1.add("The Red Sea Diving Resort, production year 2019");//3
			collection1.add("J.T. Leroy, production year 2019");//4
			collection1.add("The Hummingbird Project, production year 2019");//5
			collection1.add("In the Tall Grass, production year 2019");//6
			collection1.add("Mathias and Maxime, production yer 2019");//7
			collection1.add("Run this Down, production year 2019");//8
			collection1.add("Panda vs Aliens, production year 2019");//9
			collection1.add("Genesis, production year 2019");//10

			//Next I needed to lookup how to generate random number between 1-20
			//which simulates the possible index the user might put into the
			//text box.
			//Got concepts and examples from "Geek's for Geek's"
			//https://www.geeksforgeeks.org/java-math-random-method-examples

			Scanner input = new Scanner(System.in);//Create scanner object variable input
			System.out.println("Enter index value please, range:1-20");//prompt user for index value
			int userIndex = input.nextInt();//store index value into an integer variable fit to hold it.

			//int highestVal = 20;
			//int lowestVal = 1;
			//int userRandom = (int)(Math.random() * highestVal) + lowestVal;//Random number generator is working
																			//Prints from 1-20 including 1 and 20


			//This for loop checks each element at each slot and
			//compares them to see if their equal and if they are
			//They can print the element at this location.
			for(int i = 0; i < collection1.size() -1; i++){
				//This for loop checks each element one slot at a time
					if(userIndex == collection1.indexOf(collection1.get(i))){
						//This if statement checks if the index of the element stored
						//here matches the random number between 1-20 that simulates
						//what a user might input as an index value into an text field.
						System.out.println(collection1.get(i));
					}
			}


	}

}

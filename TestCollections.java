
import java.util.ArrayList;//Need to import to be able to use array lists. I had variables not recognized before import.
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
			//Now adding 10 movies 10 collection1 ArrayList
			collection1.add("The Death and Life of John F. Donovan, production year 2019");
			collection1.add("Fonzo, production year 2019");
			collection1.add("The Red Sea Diving Resort, production year 2019");
			collection1.add("J.T. Leroy, production year 2019");
			collection1.add("");




			System.out.println(collection1);

	}

}

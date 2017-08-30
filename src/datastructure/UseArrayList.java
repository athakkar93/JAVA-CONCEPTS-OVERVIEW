package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> aList = new ArrayList<>();

		aList.add("Super Mario");
		aList.add("Luigi");
		aList.add("Bowser");
		aList.add("Donkey Kong");
		aList.add("MegaMan");
		aList.add("Master Chief Spartan 117");

		aList.remove("Luigi");

		System.out.println(aList.get(aList.size()));

		for(String name: aList){
			System.out.println(name);

			/////connecting to DB//////

			ConnectDB connectDB = new ConnectDB();
			connectDB.InsertDataFromArrayListToMySql(aList,"User","Name");
			connectDB.readDataBase("User","Name");
		}

	}

}

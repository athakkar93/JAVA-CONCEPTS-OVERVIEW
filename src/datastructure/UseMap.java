package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		ArrayList<String> list = new ArrayList<>();
		Map<Integer,String> fighters = new LinkedHashMap<>();


		fighters.put(1, "Stephen Thompson");
		fighters.put(2, "Georges St. Pierre");
		fighters.put(3, "Nate Diaz");
		fighters.put(4, "Nick Diaz");
		fighters.put(5, "Conor McGregor");
		fighters.put(6, "Anderson Silva");
		fighters.put(7, "Ryan Hall");

		for (String x: list){
			System.out.println(x);
		}

		for (Map.Entry<Integer, String> x: fighters.entrySet()){
			System.out.println(x.getValue());
		}

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " wants to knockout or submit all of his competition");
		}
	}

}

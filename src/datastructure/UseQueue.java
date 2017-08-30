package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> playstationNewReleaseLine = new LinkedList<String>();

		playstationNewReleaseLine.add("Anand");
		playstationNewReleaseLine.add("Sayem");
		playstationNewReleaseLine.add("Fahim");
		playstationNewReleaseLine.add("Ibrahim");
		playstationNewReleaseLine.add("Debashish");
		playstationNewReleaseLine.add("Mafi Bhai");

		System.out.println(playstationNewReleaseLine);

		playstationNewReleaseLine.remove("Mafi Bhai");

		System.out.println(playstationNewReleaseLine.peek());

		System.out.println(playstationNewReleaseLine.poll());

		System.out.println(playstationNewReleaseLine);

		for (String person: playstationNewReleaseLine){
			System.out.println(person + " is waiting for the new PlayStation release");
		}

		Iterator it = playstationNewReleaseLine.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " is waiting for the new PlayStation release");
		}


	}

}

package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
			ArrayList<String> x = new ArrayList<String>();
		//2. Add five Strings to your list
			x.add("a");
			x.add("b");
			x.add("c");
			x.add("d");
			x.add("e");
		//3. Print all the Strings using a standard for-loop
			for(int i = 0; i<x.size(); i++) {
				System.out.println(x.get(i));
			}
		//4. Print all the Strings using a for-each loop
			for(String a : x) {
				System.out.println(a);
			}
		//5. Print only the even numbered elements in the list.
			for(int i = 0; i<x.size(); i++) {
				if(i%2==0) {
					System.out.println(x.get(i));
				}
			}
		//6. Print all the Strings in reverse order.
			for(int i = x.size()-1; i>=0; i--) {
				System.out.println(x.get(i));
			}
		//7. Print only the Strings that have the letter 'e' in them.
			for(String b : x) {
				if(b.contains("e")) {
					System.out.println(b);
				}
			}
	}
}

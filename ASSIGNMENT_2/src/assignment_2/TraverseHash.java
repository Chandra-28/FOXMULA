package assignment_2;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class TraverseHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	Set<Integer> numbers = new HashSet<>();
	numbers.add(101);
	numbers.add(365);
	numbers.add(2223);
	System.out.println(" Given Set: " + numbers);

		    
	Iterator<Integer> iterate = numbers.iterator();
	
	System.out.println();
	System.out.println(" Iterating over the Set:");
	
	while(iterate.hasNext()) {
		System.out.print(iterate.next() + ", ");
		    }
		  
		
	}

}

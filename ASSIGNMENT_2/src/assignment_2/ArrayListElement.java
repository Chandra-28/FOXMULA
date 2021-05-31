package assignment_2;

import java.util.*;

public class ArrayListElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i = 0; i<n;i++) {
			
			int k = sc.nextInt();
			al.add(k);
		}
		int f = sc.nextInt();	
		
		if(al.contains(f))
			System.out.println("The item is present");
		else
			System.out.println("The item isn't present");
		
	}

}

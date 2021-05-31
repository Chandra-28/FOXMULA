package assignment_2;

import java.util.*;


public class SetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<String> al = new HashSet<String>();
		int n=sc.nextInt();
		for(int i = 0; i<n;i++) {
			
			String k = sc.nextLine();
			al.add(k);
		}
		String f = sc.nextLine();	
		
		if(al.contains(f))
			System.out.println("The item is present");
		else
			System.out.println("The item isn't present");
		
	}

}

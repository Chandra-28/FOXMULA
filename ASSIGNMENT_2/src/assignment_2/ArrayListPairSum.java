package assignment_2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayListPairSum {
	static void pairPrint(ArrayList<Integer> al, int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < al.size(); ++i)
		{
			int temp = sum - al.get(i);

			
			if (s.contains(temp)) {
				System.out.println(
					"Pair with given sum "
					+ sum + " is (" + al.get(i)
					+ ", " + temp + ")");
			}
			s.add(al.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i = 0; i<n;i++) {
			
			int k = sc.nextInt();
			al.add(k);
		}
		int sum = sc.nextInt();
		
		pairPrint(al,sum);
			
	}
		
}

		

	

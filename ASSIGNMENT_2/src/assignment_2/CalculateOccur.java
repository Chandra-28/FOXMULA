package assignment_2;

import java.util.*;

public class CalculateOccur {
	static void arrayListCount(ArrayList<Integer> al)
    {
        
         
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
         
       
         
        for (int i : al) 
        {
            if(countMap.containsKey(i))
            {
               
                 
                countMap.put(i, countMap.get(i)+1);
            }
            else
            {
                
                 
                countMap.put(i, 1);
            }
        }
         
        System.out.println("Input Array : "+al);
         
        System.out.println("Element Count : "+countMap);
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
		
		arrayListCount(al);
		
	}

}

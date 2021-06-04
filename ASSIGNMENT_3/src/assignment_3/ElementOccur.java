package assignment_3;

import java.util.*;

public class ElementOccur {
	
protected HashMap<Integer,Integer> elementOccur(int arr[],int n) {
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
		if(hmap.containsKey(arr[i])) {
			hmap.put(arr[i], hmap.get(arr[i])+1);
			}
		else {
			hmap.put(arr[i],1);	
			}
		}
		return hmap;
	}

protected HashMap<Integer,Integer> printSortedOccur(int arr[],int n){
	List<Map.Entry<Integer, Integer> > list =new LinkedList<Map.Entry<Integer, Integer> >(elementOccur(arr,n).entrySet());
               
 
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> obj1,
                               Map.Entry<Integer, Integer> obj2)
            {
                return (obj1.getValue()).compareTo(obj2.getValue());
            }
        });
         
        
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> imap : list) {
            temp.put(imap.getKey(), imap.getValue());
        }
        return temp;
}
}

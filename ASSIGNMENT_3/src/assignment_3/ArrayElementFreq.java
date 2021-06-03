package assignment_3;

import java.util.*;

public class ArrayElementFreq {
static HashMap<Integer,Integer> elementOccur(int arr[],int size) {
	
	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	for(int i=0;i<size;i++) {
	if(hmap.containsKey(arr[i])) {
		hmap.put(arr[i], hmap.get(arr[i])+1);
		}
	else {
		hmap.put(arr[i],1);	
		}
	}
	return hmap;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,2,2,3,3,4};
		int size=arr.length;
		
		System.out.println(elementOccur(arr,size));
	}

}

package assignment_3;



public class SortOfFrequency {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementOccur eoccur = new ElementOccur();
		
		int arr[]= {1,2,3,1,2,2,3,3,4};
		int n=arr.length;
		
		System.out.println(eoccur.printSortedOccur(arr,n));

	}

}

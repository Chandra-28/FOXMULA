package assignment_3;

import java.util.*;

 

public class customException {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackException back = new BackException();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		try{  
		      back.checkException(number);  
		      }catch(Exception e){System.out.println(e);}  
		  
		        
		  } 
	}



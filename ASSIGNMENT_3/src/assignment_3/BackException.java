package assignment_3;

final class InvalidNumberException extends Exception{  
	 InvalidNumberException(String str){  
	  super(str);  
	 }  
	} 

public class BackException {
	protected void checkException(int number)throws InvalidNumberException{  
	     
		int start=0,flag=0;
		      
		  int n=number;    
		  start=n/2;      
		  if(n==0||n==1){  
		         
		  }else{  
		   for(int i=2;i<=start;i++){      
		    if(n%i==0){      
		           
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0 && n%2==1)  { 
			   throw new InvalidNumberException("Number is invalid"); 
		   
		   } 
		   }
		
	      
	   }
}

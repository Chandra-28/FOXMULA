package assignment_1;

import java.util.Scanner;

public class StackImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1=new Stack();
        Stack stack2=new Stack();
        
        int input=0;
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1. Push to Stack-1");//Modify your menu
            System.out.println("2. Push to Stack-2");
            System.out.println("3. Pop from Stack-1");
            System.out.println("4. Pop from Stack-2");
            System.out.println("Enter any other value to exit");
           int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Enter the number to push in first stack");
                    input=sc.nextInt();
                    stack1.push(input);
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack1.getSize());
                    }
                    break;
                case 2 :
                    System.out.println("Enter the number to pushin second stack");
                    input=sc.nextInt();
                    stack2.push(input);
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack2.getSize());
                    }
                    break;
                case 3 :
                    stack1.pop();
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack1.getSize());
                    }
                    break;
                case 4 :
                    stack2.pop();
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack2.getSize());
                    }
                    break;
                default :
                    exit = true;
            }
        }
	}

}

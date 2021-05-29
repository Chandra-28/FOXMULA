package assignment_1;

import java.util.*;
public class Stack{

	 class Node {
			private int data;
		    private Node next;

		    public int getData() {
		        return data;
		    }

		    public Node getNext() {
		        return next;
		    }

		    public Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		    
		}
    public Node top = null;
    public Node bottom = null;


    private int size = 0;


    public int getSize()
    {
        return size;
    }

    boolean checkEmpty()
    {
        return (size == 0);
    }

    public void push(int data) {

        Node newNode = new Node(data);

        if(this.checkEmpty()) {

            top = newNode;
            bottom=newNode;
            size=1;
        }
        else {

            top.next = newNode;
            top = newNode;
            size++;
        }
    }
// returns the top most element and deletes it
    public int pop()
    {
        if (top == null) {
            System.out.println("No elements in stack ,Nothing was deleted");
            return 0;
        }
        else
        {
            Node temp=bottom;
            int element=top.getData();
            // If there is only one element in stack
            if(bottom.getNext()==null)
            {
                 top=null;bottom=null;
                 size=0;
            }
            else
            {
                for(temp=bottom; temp.getNext()!=top ; temp=temp.getNext())
                {}
                top=temp;
                size--;
            }
            return element;
        }
    }




   
}

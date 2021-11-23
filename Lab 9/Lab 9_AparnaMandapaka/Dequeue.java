package lab9;
import java.util.*;
import java.io.*;
import java.util.LinkedList;

public class Dequeue{

    // this is creating the attribute for queue and dequeue
    
    Queue<Integer> q;
    
    ArrayDeque<Integer> dq;

    //this is an constructor for the class
    
    Dequeue() {
        q = new LinkedList<>();
        dq = new ArrayDeque<>();
    }

    public void enqueue(int data){
    
        //it finds the correct position of the element
        
    	//in the dequeue and insert it there
    	
        while(!dq.isEmpty() && dq.getLast() < data){
        
            //this removes the last element from dequeue
            
            dq.removeLast();
        }
        
        //add the element at the end
        
        dq.addLast(data);
        
        q.add(data);
    }

  public void deque(){
  
        //return the last element of the dequeue
        
        if(dq.getFirst() == q.peek()){
        
            dq.removeFirst();
        }
        q.remove();//removes the element that user wanted to remove
        
    }

    //gives the maximum element from the queue
  
    int getMax() throws Exception{ // if the queue is empty then it will throw an exception
    	
        //check if the element is empty
    	
        if(q.isEmpty())
        
            throw new Exception("Queue is Empty"); // if the queue us empty and user tries to print anything then the 
            //it will throw an exception and let the user know that the queue is empty 
       
        else
            return dq.getFirst(); //if the queue is not empty then it will print the first element from the queue 
    }

    
    public static void main(String[] args) throws Exception {
        Dequeue dq = new Dequeue();
        while(true){ //provides the user with the option that they can choose, like they can add, delete or get the max value from the queue 
        
            System.out.println("Options ");
            System.out.println("1. Push"); //adds in the elements 
            
            System.out.println("2. Pop"); //gets the elements out
            
            System.out.println("3. Get Max"); // gets the max value of the queue 
           
            System.out.println("4. Quit");//breaks the program and exists out
            
            
           //takes in user input 
            Scanner input = new Scanner(System.in);
            
            //takes in user input and reads the option that the user choose 
            int choice = input.nextInt();
            
            if(choice == 1){
                System.out.println("Enter the element");
                int n = input.nextInt(); //stores the element 
                dq.enqueue(n);
            }
            else if(choice == 2){ 
                System.out.println("Element is removed"); //the element will be removed if the user choose option 2
                
                dq.deque(); //removes the element 
                
            }else if(choice == 3){ 
                System.out.println("The max element is " + dq.getMax()); //if the user chooses option 3, then it will return the maxium from the queue 
          
            }else if(choice == 4){
                break; // if the user chooses to quit the program then they choose option 4 which breaks the program
            }
        }
    }
}
//time complexity O(1)
//space complexityO(n)

//testcase 1 if the element is not present in the queue then it throws an exception that the queue is empty 
//testcase 2 if user tries to remove elements from empty queue, the user will be unable to do it since the empty queeu doesn't contain any elements'
//test case 3 if the user tries to find the maximum value of the empty set then a exception will be throwed 
//test case 4 if the user enters the negative element then it returns the negative element as the max value 
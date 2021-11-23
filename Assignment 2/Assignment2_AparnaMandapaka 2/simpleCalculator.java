package assignment2;
import java.util.Stack;
import java.util.Scanner;
public class simpleCalculator {

	public int evaluateFunction(String expression){
        //this is basically the stack for numbers

        Stack<Integer> numbers = new Stack<>();

       //below is the stack for the operators

        Stack<Character> operations = new Stack<>();
        for(int i=0; i<expression.length();i++) {
            char c = expression.charAt(i);
           //the below if statement checks if the user has provided a number or not

            if(Character.isDigit(c)){
              //now the digit could be greater than a one digit number

                int num = 0;
                while (Character.isDigit(c)) {
                    num = num*10 + (c-'0');
                    i++;
                    if(i < expression.length())
                        c = expression.charAt(i);
                    else
                        break;
                }
                i--;
              //the following commands would push/put the number or operators into the stack 

                numbers.push(num);
            }else if(c=='('){
               //if there is no number and just operators then it pushes it into the operator stack

                operations.push(c);
            }
           //now we are going to evaluate the whole braces of parentheses

            else if(c==')') {
                while(operations.peek()!='('){
                    int output = performOperation(numbers, operations);
                  //now all the produced output is going to go back into the stack

                    numbers.push(output);
                }
                operations.pop();
            }
           //now we know tell the system to treat character as an operator

            else if(isOperator(c)){
    
                while(!operations.isEmpty() && precedence(c)<=precedence(operations.peek())){
                    int output = performOperation(numbers, operations);
                    //now push it back to the stack
                    numbers.push(output);
                }
            //now we will push the current operator to stack 


                operations.push(c);
            }
        }

        while(!operations.isEmpty()){
            int output = performOperation(numbers, operations);
            //push it back to stack
            numbers.push(output);
        }
        return numbers.pop();
    }

  //now we will be checking the precedence here 

   public static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public int performOperation(Stack<Integer> numbers, Stack<Character> operations) {
        int vara = numbers.pop(); //var means variable
        int varb = numbers.pop();
        char operation = operations.pop();
        switch (operation) {
            case '+':
                return vara + varb;
            case '-':
                return varb - vara;
            case '*':
                return vara * varb;
            case '/':
                if (vara == 0) throw new UnsupportedOperationException("Can't be divide by zero");
                return varb / vara;
        } 
        
        //test case, for the division operator if divided by any number the calculator gives an output expect for 0
        //when the user tries to divide a number by 0, the program throws an exception 
        
        //testcase, if the numerator is divided by a larger denominator the code gives an output of "0", which means the code
        //cannot or does not produce decimal values if the denominator is higher than numerator 
        //it just rounds to closet number which is usually 0
        return 0;
    }

  //now we are going to check the operators 

    public boolean isOperator(char s){
        return (s=='+'||s=='-'||s=='/'||s=='*'||s=='^');
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleCalculator ee = new simpleCalculator();

     //this takes the input from the user 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter In-Fix expression : ");
        String expression = input.nextLine();

      //the following print statement prints out the in-fix expression
        System.out.println("In-Fix Evaluation : " + ee.evaluateFunction(expression));
    }

//the time complexity of this code is O(n)
//the space complexity is O(n)
	}

//Question2
//ArrayDeque class is basically the implementation of a resizable 
//array structure which implements the Deque interface.  
//If we use the Deque class for the solution 1, then the efficiency of the program will increase.
//There would be no effect on the output or the code 
//because the ArrayDeque contains the same operations as the Stacks therefore it would make no difference even if we use the ArrayDeque,
//maybe the structure of the code might look different than the Stack code. 
//Overall the stack and arraydeque act the same way, but in the simple calculator section 
//we need the calculator to work as first in last out, which is usually a advantageous part of the Stack
//But if we see it in time complexity then ArrayDeque is much faster than the Stack

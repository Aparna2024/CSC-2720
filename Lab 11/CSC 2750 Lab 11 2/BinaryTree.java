package lab11;

//this is basically a class to store a binary tree node 
class Node {

	 int data;

	 Node left, right;

	 

	 public Node(int item) {

		 data = item;

		 left = right = null;

	 }

}
//this class is used to print in-order traversal

public class BinaryTree

{

	 Node rootNode;

	 Node previousNode;

	 
//the following method sees if the binary tree is in Binary Search Tree or not 
	 boolean isBinaryTree() {
//in order traversal stores the previous node
		 //the role of the previous node is that it checks if the current node is greater or smaller than the node
		 //if the node is not greater than the previous node, then its not a binary tree
		 previousNode = null;

		 return isBinaryTree(rootNode);

		 

	 }

	 boolean isBinaryTree(Node node)

	 {

		 if(node != null)

		 {
//this checks if the left node is in the first in-order or not
			 if(!isBinaryTree(node.left))
//checks the left node's elements 
				 return false;

			 
//this only allows certain values in the node
			 if(previousNode != null && node.data <= previousNode.data) //checks recursively 

				 return false;

			 previousNode = node;

			 

			 return isBinaryTree(node.right); //this checks the right side of the node 

		 }

		 return true;

		 }

	

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();

		tree.rootNode = new Node(4);

		tree.rootNode.left = new Node(2);

		tree.rootNode.right = new Node(6);

		tree.rootNode.left.left = new Node(1);

		tree.rootNode.left.right = new Node(3);

		tree.rootNode.right.left = new Node(5);

		tree.rootNode.right.right = new Node(7);

		

		if(tree.isBinaryTree())

			System.out.println("True");

		else

			System.out.println("False");

	}


//Time complexity O(n)
	//Space complexity O(n)
	

}
//test case: the null elements inside the node or even different type of information cannot be compared like an integer and a word
//testcase:the values are inputted as ascending order, like, 1,2,3,4,5,6,7 the program will return false 


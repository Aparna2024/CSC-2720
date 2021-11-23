package Assignment3;

public class BST1 {
	
	//class to store binary tree nodes 
	static class Node{
		int data;
		Node left, right;
		
		public Node(int item) {
			data = item;
			left = null;
			right = null;
			
		}
	}
	//this is the node of BST
	Node root = null;
	
	//this following method performs inorder traversal 
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	//this method removes the root  and checks if one 
	//child node is null or not 
	
	public Node deleteNode(Node root, int data) {
		
		if(root == null) //if the tree is empty it returns to the root
			
		{
			return root;
			
		}
		//if its not empty then it does recursion down the tree
		
		if(data < root.data)
			
		{
			root.left = deleteNode(root.left, data);
			
		}
		else if(data > root.data) {
			
			root.right = deleteNode(root.right, data);
			//if the data is same as the root's node, then that node will be deleted
			
		} else {
			//this is the node either with one child or no child
			if(root.left == null) {
				
				return root.right;
				
			} else 
				
				if(root.right == null) {
					
					return root.left;
				}
			//this is the node with two children, which gets the inorder traversal
			root.data = minValue(root.right);
			//this deletes the inorder, which is the smallest node or element in the right subtree
			root.right = deleteNode(root.right, root.data);
			
		}
		return root;
	}
	
	public int minValue(Node root) {
		
		int value = root.data;
		while(root.left != null){ //if the root is not null, then the value will be equal to the root data from the left side
			value = root.left.data;
			root = root.left;
			
		}
		return value;
	}
	
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the binary tree and entering nodes 
		BST1 tree = new BST1();

		tree.root = new Node(4);

		tree.root.left = new Node(2);

		tree.root.right = new Node(6);

		tree.root.left.left = new Node(1);

		tree.root.left.right = new Node(3);

		tree.root.right.left = new Node(5);

		tree.root.right.right = new Node(7);

		tree.deleteNode(tree.root, tree.root.data); //deletes the node

		tree.inorder(tree.root);
	}

}

//Time complexity: O(n)
//Space complexity: O(n)
//test case 1: in the main method, if the user or the inbuild value passes an empty root to replace the elements
//test case 2: since this is a level order, it return the roots from the each depth value, the number doesn't matter
//test case 3: if one of the node element is negative then it does print that element onto the console, but not in ascending order 



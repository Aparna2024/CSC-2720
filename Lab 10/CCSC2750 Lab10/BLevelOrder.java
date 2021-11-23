package lab10;
import java.util.ArrayDeque;

//this is basically a class to store a binary tree node 
class Node {
        int data;
        Node left, right;

        public Node(int item) {
                data = item;
                left = right = null;
        }
}

//this class is used to print the level order traversal
class BinaryTree {
        // Root of the Binary Tree
        Node root;

        public BinaryTree() {
                root = null;
        }

}
//this class prints the nodes in level order using the arry for implementing queue 

public class BLevelOrder{
        public static void main(String[] args) {
        	//creating the binary tree and entering the nodes 
                BinaryTree tree = new BinaryTree(); 
                tree.root = new Node(4);
                tree.root.left = new Node(2);
                tree.root.right = new Node(6);
                tree.root.left.left = new Node(1);
                tree.root.left.right = new Node(3);
                tree.root.right.left = new Node(5);
                tree.root.right.right = new Node(7); 
               LevelOrder(tree.root);
        }

        public static void LevelOrder(Node s) {
                ArrayDeque<Node>q = new ArrayDeque<>();
                if(s==null) //checks if the nodes are empty 
                	return; 
                q.add(s); //if the node is not empty then it adds the number to the queue 
                while(!q.isEmpty()) {
                        Node c=q.peek();
                        System.out.print(c.data+" ");
                        //Enqueues the left node/child
                        if(c.left!=null)q.add(c.left);
                        //Enqueues the right node/child
                        if(c.right!=null)q.add(c.right);
                        q.remove(); // removes the number from the node/ queue 
                }
                
                //the whole program is that it puts the node into the queue and it loops the queue until it prints the node data 
                //then it pushes the elements in it into a queue and then removes the front 
        }
}
//time complexity is O(n)
//space complexity is O(n)
//test case: if the root is empty it returns nothing in the while loop
//test case: since its in the level order, it returns the roots from each depth level, the number doesn't matter
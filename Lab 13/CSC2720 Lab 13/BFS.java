package lab13;
import java.util.*;

public class BFS {
	
	  static class Graph {
		  
		//Number of Vertices  
		  int V; 
		
	       //this is the adjacency list 
	        LinkedList<LinkedList<Integer>> adj; 
	        
	        //Constructor
	   Graph(int V)
	     {
	       this.V = V;
	       
	       adj = new LinkedList<LinkedList<Integer>>();
	       
	       for (int i = 0; i < V; i++) 
	    	   
	            adj.add(new LinkedList<Integer>());
	        }
	   
	        //To add an edge to graph
	        void addEdge(int v, int w)
	        
	        {
	        	//to add w to the list of v
	            adj.get(v).add(w);
	           
	        }
	    }

	    public static void main(String[] args) {
	        int V = 6;
	        Graph g = new Graph(6);
	        g.addEdge(0, 1);
	        g.addEdge(0, 2); 
	        g.addEdge(2, 3);
	        g.addEdge(2, 4); 
	        g.addEdge(4, 5);  
	        g.addEdge(1, 3);
	        g.addEdge(3, 5);
	  
	 //I will be using the queue for the Breadth First Search traversal
	        Queue<Integer> bfs = new LinkedList<Integer>();
	        
	        //this first pushes the source node, which is '0' in this case 
	        bfs.add(0); 
	        
	        //boolean array make sures that whether the provided vertex is visited before or not
	        boolean[] visited = new boolean[V];
	        
	        System.out.println("Breadth First Search Traversal for the given graph is "); //prints on console
	       
	        //this marks the source as true 
	        visited[0] = true;
	        
	        while (bfs.isEmpty() == false){
	        	
	        	//this picks the node from the front or beginning of the queue 
	              int  top = bfs.remove(); 
	            System.out.print(top+" ");
	            
	            // this checks with the neighbours of this node
	            for (int element : g.adj.get(top)){
	            	
	                // if this element is not visited before, it marks this element as visited
	                // and push it into the queue
	                if(visited[element] == false){
	                	
	                visited[element] = true;
	                
	                bfs.add(element);
	                }
	            }
	        }
	    }
	}
//Time complexity:O(V + E)
//Space complexity: O(V ) 

//Test case 1: if we change the x coordinates points to 0's, like
//(0,1),(0,2),(0,3),(0,4),(0,5),(0,3),(0,5), then the output would still be 0 1 2 3 4 5

//Test case 2: if i change the y coordinates to 
//(0,1),(0,2),(0,3),(0,4),(0,5),(0,6),(0,7) then it gave me an exception error 
//test case 3: in the bfs.add() if we add 3 instead of 0, it gives an output of 3,5
//test case 4: if the user tries to pass the vertices that are not in the graph then they will 
//get an error
//test case 5: the change in index would give you a different order of nodes
//but we have to make sure that the number we are assigning as the root or node should be avaliable 
//within the graph


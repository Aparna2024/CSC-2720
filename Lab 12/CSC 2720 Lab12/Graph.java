package lab12;
import java.util.Iterator;
import java.util.LinkedList;


/* Class representing a directed graph using adjacency lists */
public class Graph
{
   int V; //Number of Vertices
   LinkedList<Integer>[] adj; // adjacency lists

   //Constructor
   Graph(int V)
   {
       this.V = V;
       adj = new LinkedList[V];
       for (int i = 0; i < adj.length; i++)
           adj[i] = new LinkedList<Integer>();
   }

   // To add an edge to graph
   
   void addEdge(int v, int w)
   {
       // Add w to the list of v.
	   
       adj[v].add(w);      
   }
  
   // A function used by DFS
   
void DFS(int ver, boolean visitedNode[])
{
// this is the current node and it marks it as visited and prints it 
visitedNode[ver] = true;

System.out.print(ver + " ");

// Recur for all the vertices adjacent to this vertex

Iterator<Integer> counter = adj[ver].listIterator();
  
// this loop continues until all the nodes in the graph not visited 

while (counter.hasNext())
{
   // Gets the current node
	
int num = counter.next();
  
// Checks if the node is visited or not 

if (!visitedNode[num])
	
   // this recursively calls the method to traverse all the connected nodes

	DFS(num, visitedNode);
}
}
  

public static void main(String []s)
{
   // Creates an object of class Graph
	
   Graph g = new Graph(6);
   
   // Creates an array that keeps track of visited nodes 
   
   boolean visitedNode[] = new boolean[6];
  
   // Calls the method to add edges
   
   g.addEdge(0, 1);
   g.addEdge(0, 2);
   g.addEdge(2, 3);
   g.addEdge(2, 4);
   g.addEdge(4, 5);
   g.addEdge(1, 3);
   g.addEdge(3, 5);
  
   System.out.println("\n\n The following is Depth First Traversal " +
           "(starting from vertex 0)");
  
   // Calls the method to perform depth first traversal
   
   g.DFS(0, visitedNode);
  
		}
}
//time complexity: O(V + E)

//space complexity: O(V)

//test case 1 if we change the x-coordinates or the left hand side points to all 0's '
//like (0,1),(0,2),(0,3),(0,4),(0,5) and give the command to g.DFS(0)
//then it would print an out put of 5,4,3,2,1,0 it prints the reverses order the starting number which is 
//(0,1) would make it to the end and the last number (0,5), would make it to the top

//test case 2 in the g.DFS() if no number is provided or if the provided number is out of range 
//then it would give an exception error

//test case 3 passing a start point that is not in the node will result in the exception or error
//message 

//test case 4, if the g.DFS(2, vistedNode), if 0 is replaced by 2 then the output would be 
//output 2,3,5,4 since our starting point would not be 0 anymore it changes the order 

//test case 5: the change in index would give you a different order of the nodes, 
//but we have to make sure that the number we are assigning as the root or node should be avaliable
//within the graph

//test case 6: if the vertex is not 0, then the output of elements and nodes are different 
//like lets say 
//g.addEdge(1, 1);
//g.addEdge(0, 2);
//g.addEdge(2, 3);
//g.addEdge(2, 4);
//g.addEdge(4, 5);
//g.addEdge(1, 3);
//g.addEdge(3, 5);
//then the output would be 0 2 3 5 4
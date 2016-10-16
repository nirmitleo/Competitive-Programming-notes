#Topological sort
1. Topological sorting of a Directed Acyclic Graph (DAG) is a linear ordering of all the vertices in the DAG so that the vertex *u* comes before vertex *v* if an edge *(u->v)* exists in the DAG.
2. Every DAG has at least one and possibly more topological sort(s).
3. There are two methods to generate the topological sort - 
  1. Modified DFS algorithm.
  2. Kahn's algorithm.


#Modified DFS algorithm
1. Create a visited[]. Mark all the nodes/vertices as unvisited.
2. Mark the *current node* as visited. 
3. For each node connected to the *current node* call the function with *neighbouring node* as the *current node*.
4. After all the *neighbouring nodes* have been visited, put the *current node* in the *tsStack*. 
5. *tsStack* contains topological sort in a reverse manner.

```
private Stack<Integer> tsStack;
public void ts(int u)
{
    visited[u] = true;
    for(int i = 0; i<nodes; i++)
    {
        if(g[u][i] && !visited[i])
        {
            ts(i);
        }
    }
    tsStack.push(u);
}
```

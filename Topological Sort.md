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


#Modified BFS algorithm (or Kahn's algorithm)
1. Create a inDegrees[]. Initially all the nodes/vertices have 0 in-degrees.
2. Iterate the graph[][], and initialize the inDegrees[].
3. Create a LinkedList<Integer> queue, and add all the nodes with 0 in-degrees.
4. While the queue is not empty
    4.1. Remove a node from the queue.
    4.2. Reduce the inDegrees of all the neighbouring nodes connected.
    4.3. If the inDegrees of the neighbouring node is equal to zero, then add to the queue.
    4.4. The order in which the nodes are added to the queue is the topological sort. 

```
int inDegrees[] = new int[NODES];
for(int i = 0; i<NODES; i++)
{
    for(int j = 0; j<NODES; j++)
    {
        if(g[i][j])
        {
            inDegrees[j]++;
        }
    }
}

LinkedList<Integer> queue = new LinkedList<Integer>();
for(int i = 0; i<NODES; i++)
{
    if(inDegrees[i] == 0)
    {
        queue.add(i);
    }
}


while(!queue.isEmpty())
{
    int u = queue.pollFirst();
    for(int i = 0; i<NODES; i++)
    {
        if(g[u][i])
        {
            inDegrees[i]--;
            if(inDegrees[i] == 0)
            {
                queue.add(i);
            }
        }
    }
}
```

import java.util.*;


class Graph
{
  int g[][],cost[],p[];
  int v,e;
  

  void creategraph()
  {
    int a,b,w;

    Scanner avl = new Scanner(System.in);
    System.out.println("Enter number of vertices ");
    v = avl.nextInt();
    System.out.println("Enter number of edges ");
    e = avl.nextInt();

    //create matrix of v+1 rows and v+1 cols

    g = new int[v+1][v+1];
	cost= new int[v+1];
	p=new int [v+1];

    

   
   

    //store edge information

    for (int i = 1; i<= e ; i++)
    {
      System.out.println("Enter Start node of edge no :"+i);
      a = avl.nextInt();
      System.out.println("Enter End node of edge no :"+i);
      b = avl.nextInt();
      System.out.println("Enter weight of node no :"+i);
      w = avl.nextInt();
      g[a][b] = w;
      
    }

  } // end creategraph

  void forward()
  {
    cost[v]=0;
    int l=0;
    for(int j=v-1;j>=1;j--)
    {
    	int min=32767,k;
    	//Find cost of j
    	for(k=1;k<=v;k++)
    	if(g[j][k]!=0)
    	if(g[j][k]+cost[k]<min)
    	{
    		min=g[j][k]+cost[k];
    		l=k;
    	}
    	k=l;
    	cost[j]=g[j][k]+cost[k];
    	p[j]=k;
    	
    	
    }
  }
  void display()
  {
  	System.out.println("The cost from Source=1 to Sink ="+v+" is :"+cost[1]);
  	System.out.println("The Path is :");
  	int i=1;
  	do
  	{
  		System.out.println("Vertex "+i+" is connected to vertex "+p[i]);
  		i=p[i];
  	}
  	while(i!=v);
  }

} //end Graph class


class MultiForward
{
  public static void main(String args[])
  {
    Graph g = new Graph();
    g.creategraph();
    g.forward();
    g.display();
  }
}

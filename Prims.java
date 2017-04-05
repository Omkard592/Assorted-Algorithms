import java.util.*;

class Graph
{

int g[][],v,e;

Scanner sc=new Scanner(System.in);

void createGraph()
{
	
	System.out.println("Enter the no. of verices ");
	v=sc.nextInt();

	System.out.println("Enter the no. of edges ");
	e=sc.nextInt();

	g=new int[v+1][v+1];

	for(int i=1;i<=e;i++)
	{
		System.out.println("Enter the start node ");
		int a=sc.nextInt();

		System.out.println("Enter the end node ");
		int b=sc.nextInt();

		System.out.println("Enter the weight of the edge no. "+i+" ");
		int w=sc.nextInt();

		g[a][b]=g[b][a]=w;
	}
}


void prim()
{
	int d[],p[],visited[],c,current;

	d=new int[v+1];
	p=new int[v+1];
	visited=new int[v+1];

	for(int i=1;i<=v;i++)
	{
		d[i]=32767;
		p[i]=visited[i]=0;
	}

	current=1;
	d[current]=0;
	visited[current]=1;
	c=1;

	while(c!=v)
	{
		for(int i=1;i<=v;i++)
		if(g[current][i]!=0 && visited[i]!=1)
		if(g[current][i]<d[i])
		{
			d[i]=g[current][i];
			p[i]=current;
			
		}

		int min=32767;

		for(int i=1;i<=v;i++)
		if(visited[i]!=1)
		if(d[i]<min)
		{
			min=d[i];
			current=i;
		}

		c++;
	
	}

	int mincost=0;

	for(int i=2;i<=v;i++)
	mincost=mincost+d[i];

	System.out.println("Minimum cost of the spanning tree is "+mincost);

	for(int i=2;i<=v;i++)
	System.out.println("Vertex "+i+" is connected to vertex "+p[i]+" by distance "+d[i]+"\n");
}

}//class


class Prims
{
public static void main(String args[])
{
	Graph g=new Graph();
	g.createGraph();
	g.prim();

}

}//class


	


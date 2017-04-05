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


void dijkstra()
{
	int d[],p[],visited[];
	int current,source,dest,dc;

	System.out.println("Enter the source vertex: ");
	source=sc.nextInt();

	System.out.println("Enter the destination vertex: ");
	dest=sc.nextInt();

	d=new int[v+1];
	p=new int[v+1];
	visited=new int[v+1];

	for(int i=1;i<=v;i++)
	{
		d[i]=32767;
		p[i]=visited[i]=0;
	}

	current=source;
	d[current]=0;
	visited[current]=1;
	

	while(visited[dest]!=1)
	{
		dc=d[current];
		for(int i=1;i<=v;i++)
		if(g[current][i]!=0 && visited[i]!=1)
		if(g[current][i]+dc<d[i])
		{
			d[i]=g[current][i]+dc;
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

		visited[current]=1;
	
	}

	int sd=d[dest];
	
	System.out.println("Shortest distace from vertex "+source+" to vertex "+dest+" is "+sd);

	
	int i=dest;

	do
	{
	
		System.out.println("Vertex "+i+" is connected to vertex "+p[i]+" by distance "+g[i][p[i]]);
		i=p[i];
	}while(i!=source);
}

}//class


class Dijkstras
{
public static void main(String args[])
{
	Graph g=new Graph();
	g.createGraph();
	g.dijkstra();

}

}//class


	


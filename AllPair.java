//Floyd-Warshall's All Pair Shortest Path Algorithm

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

	for(int i=1;i<=v;i++)
	for(int j=1;j<=v;j++)
	if(i==j)
	g[i][j]=0;
	else
	g[i][j]=32767;

	for(int i=1;i<=e;i++)
	{
		System.out.println("Enter the start node ");
		int a=sc.nextInt();

		System.out.println("Enter the end node ");
		int b=sc.nextInt();

		System.out.println("Enter the weight of the edge no. "+i+" ");
		int w=sc.nextInt();

		g[a][b]=w;
	}
}


void allP()
{
	
	for(int i=1;i<=v;i++)
	for(int j=1;j<=v;j++)
	for(int k=1;k<=v;k++)
	g[i][j]=Math.min(g[i][j],g[i][k]+g[k][j]);

	System.out.println("From\t\tTo\t\tDistance");
	for(int i=1;i<=v;i++)
	for(int j=1;j<=v;j++)
	System.out.println(i+"\t\t"+j+"\t\t"+g[i][j]);
}

}//class


class AllPair
{
public static void main(String args[])
{
	Graph g=new Graph();
	g.createGraph();
	g.allP();

}

}//class


	


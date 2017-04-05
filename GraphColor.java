import java.util.*;


class GraphTest
{
  	int g[][];
  	int v,e;
  	int x[],n;
  	
	Scanner sc=new Scanner(System.in);


void creategraph()
{
    	int a,b;
    	System.out.print("Enter number of vertices ");
    	v=sc.nextInt();

    	System.out.print("Enter number of edges ");
    	e=sc.nextInt();

    	//create matrix of v+1 rows and v+1 cols

    	g=new int[v+1][v+1];

   

    	//store edge information

    	for(int i=1;i<=e;i++)
    	{
      		System.out.print("Enter start node: ");
      		a=sc.nextInt();

		System.out.print("Enter end node: ");
      		b=sc.nextInt();

      		g[a][b]=g[b][a]=1;
    	}

}

  
void read()
{
    	//read number of colors and also make x array
    
    	System.out.print("Enter number of colors ");
    	n=sc.nextInt();

    	x=new int[v+1];
}


boolean color(int k,int i)
{
    	for(int j=1;j<=k-1;j++)
    	if(g[k][j]!=0&&x[j]==i)
       	return false;
    	
    	return true;
}


void graphcolor(int k)
{
	for(int i=1;i<=n;i++)
    	{
      		if(color(k,i))
      		{
       			x[k]=i;

       			if(k==v)
       			{
         			//print solution
         			for(int j=1;j<=v;j++)
         		 	System.out.print(x[j]+"   ");

         		System.out.println();

       			}

       			else
        		graphcolor(k+1);

      		}

     	}

}

}//class


public class GraphColor
{

	public static void main(String args[])
  	{
    		GraphTest g=new GraphTest();
    		g.creategraph();
    		g.read();
    		g.graphcolor(1);
  	}

}



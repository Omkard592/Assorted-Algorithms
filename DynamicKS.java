import java.util.*;

class Knapsack
{

	Scanner sc=new Scanner(System.in);
	int w[],p[],pr[][],n,m;
	
	
void read()
{
	System.out.println("Enter the no. of objects ");
	n=sc.nextInt();
	
	System.out.println("Enter the capacity of knapsack ");
	m=sc.nextInt();

	w=new int[n+1];
	p=new int[n+1];

	pr=new int[n+1][m+1];
	
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter weight of object no "+i+" ");
		w[i]=sc.nextInt();
		System.out.println("Enter profit of object no "+i+" ");
		p[i]=sc.nextInt();
			
	}

}
	

void fill()
{
		
	for(int j=0;j<=m;j++)
	for(int i=1;i<=n;i++)
	if(j-w[i]>=0)
	pr[i][j]=Math.max(pr[i-1][j],p[i]+pr[i-1][j-w[i]]);
	
	else
	pr[i][j]=pr[i-1][j];
		
}


void display()
{		
	int i,j;
	i=n;
	j=m;
	
	System.out.println("Solution for Knapsack using Dynamic method is "+pr[n][m]);
	System.out.println("Following objects were added");

	for(int c=n;c>=0;c--)
	{	try
		{	
			if(pr[i][j]!=pr[i-1][j])
			{
				System.out.println("Object "+i+" is added");
				j=j-w[i];
			}
		}
		catch(Exception e)
		{}
				
		i--;
	}

}

}//class



class DynamicKS
{

public static void main(String args[])
{

	Knapsack k=new Knapsack();
	
	k.read();
	k.fill();
	k.display();
}

}//class

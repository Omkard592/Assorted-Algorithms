import java.util.*;

class Knapsack
{

	Scanner sc=new Scanner(System.in);
	float w[],p[];
	int n,m;
	

void read()
{
	System.out.println("Enter the no. of objects ");
	n=sc.nextInt();

	System.out.println("Enter the capacity of knapsack ");
	m=sc.nextInt();

	w=new float[n+1];
	p=new float[n+1];
	
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter weight of object no "+i+" ");
		w[i]=sc.nextFloat();
		System.out.println("Enter profit of object no "+i+" ");
		p[i]=sc.nextFloat();
			
	}

}

	
void sort()
{	
	float t;

	for(int i=n-1;i>=1;i--)
	for(int j=1;j<=i;j++)
	if(p[j]/w[j]<p[j+1]/w[j+1])
	{
		t=p[j];
		p[j]=p[j+1];
		p[j+1]=t;

		t=w[j];
		w[j]=w[j+1];
		w[j+1]=t;
	}

}
	

void fill()
{
	float cr,pe;
	cr=m;
	pe=0.0f;

	int i=0;

	for(i=1;i<=n;i++)
	if(w[i]<=cr)
	{
		cr-=w[i];
		pe+=p[i];
	}
		
	else
	{
		System.out.println("\nThe solution of 0/1 knapsack is "+pe);
		break;
	}
	
	
	if(i<=n)
	{
		pe+=(cr/w[i])*p[i];
		System.out.println("The solution of fractional knapsack is "+pe);
	}

}
	
}//class


class GreedyKS
{

public static void main(String args[])
{

	Knapsack k=new Knapsack();
	
	k.read();
	k.sort();
	k.fill();
}

}//class

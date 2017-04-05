import java.util.*;


class mySumofsubset
{


int n,v[],x[],sumrequired;


void read()
{

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number of values");

	n=sc.nextInt();

	v=new int[n+1];

	System.out.println("Enter the values");

	for(int i=1;i<=n;i++)
	v[i]=sc.nextInt();

	x=new int[n+1];

	System.out.println("Enter the sum required ");

	sumrequired=sc.nextInt();

}


int sum(int k)
{

	int s=0;

	for(int i=1;i<=k;i++)
	s=s+x[i];

	return s;

}


boolean proper(int k,int i)
{

	for(int j=1;j<=k-1;j++)
	if(x[j]==v[i])
	return false;

	if(sum(k-1)+v[i]>sumrequired)
	return false;

	return true;

}


void sumset(int k)
{

	for(int i=k;i<=n;i++)
	{

		if(proper(k,i))
		{

			x[k]=v[i];

			if(sum(k)==sumrequired)
			{

				for(int j=1;j<=k;j++)
				System.out.print(x[j]+" ");

				System.out.println();

			}

			else
			sumset(k+1);

		}

	}

}

}//class




class Sumofsubset
{

	public static void main(String args[])
	{

		mySumofsubset m1=new mySumofsubset();

		m1.read();

		m1.sumset(1);

	}

}
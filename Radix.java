import java.util.*;


class Radix
{

int calcdig(int a[])
{

	int max=0,dig=0;

	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		max=a[i];
	}

	while(max!=0)
	{
		dig++;
		max=max/10;
	}

	return dig;

}


void radixSort(int a[],int d)
{

	int i,j,bucket[][],c[],e=1,digit,k,z;

	bucket=new int[a.length][10];

	c=new int[10];

	for(i=1;i<=d;i++)
	{
		for(j=0;j<=9;j++)
		c[j]=-1;

		for(j=0;j<=a.length-1;j++)
		{
			digit=(a[j]/e)%10;
			c[digit]++;
			bucket[c[digit]][digit]=a[j];
		}

		z=0;
		
		for(j=0;j<=9;j++)
		if(c[j]!=-1)
		for(k=0;k<=c[j];k++)
		{
			a[z]=bucket[k][j];
			z++;
			
		}
		
		e=e*10;
		
	}

}


public static void main(String args[])
{

	int n,arr[],ele;

	Scanner sc=new Scanner(System.in);

	System.out.println("\nEnter the size of array: ");
	n=sc.nextInt();

	arr=new int[n];

	System.out.println("Enter "+n+" elements\n");

	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();

	Radix obj=new Radix();

	obj.radixSort(arr,obj.calcdig(arr));

	System.out.println("\nElements after sorting");

	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
}

}//class
import java.util.*;

class Binary
{

void sort(int x[])
{
	int i,j,min,p,t;

	for(i=0;i<x.length-2;i++)
	{
		min=x[i];
		p=i;

		for(j=i+1;j<=x.length-1;j++)
		{
			if(x[j]<min)
			{
				min=x[j];
				p=j;
			}
		}

		t=x[i];
		x[i]=x[p];
		x[p]=t;
	}

}


void binarysearch(int a[],int x)
{

	sort(a);

	System.out.println("\nElements after sorting");

	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);


	int l,r,mid;
	l=0;
	r=a.length-1;
	mid=(l+r)/2;


	while(a[mid]!=x&&l<=r)
	{

		if(x<a[mid])
		r=mid-1;

		else
		l=mid+1;

		mid=(l+r)/2;
	}

	if(l>r)
	System.out.println("\nElement not found");

	else
	System.out.println("\nElement found at position "+(mid+1));
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

	System.out.println("Enter the element to be searched: ");
	ele=sc.nextInt();

	Binary obj=new Binary();

	obj.binarysearch(arr,ele);

}//psvm

}//class

import java.util.*;

class Merge
{

void simpleMerge(int a[],int f,int s,int t)
{
	int i,j,k,temp[],w;

	temp=new int[t-f+1];

	i=f;
	j=s;
	k=-1;

	while(i<=s-1&&j<=t)
	{
		if(a[i]<a[j])
		{
			k++;
			temp[k]=a[i];
			i++;
		}

		else
		{
			k++;
			temp[k]=a[j];
			j++;
		}

	}


	if(i>s-1)
	{
		for(w=j;w<=t;w++)
		{
			k++;
			temp[k]=a[w];
		}

	}

	else
	{
		for(w=i;w<=s-1;w++)
		{
			k++;
			temp[k]=a[w];
		}

	}


	for(w=0;w<=k;w++)
	{
		a[f+w]=temp[w];
	}

}


void mergeSort(int a[],int l,int r)
{
	int mid;

	mid=(l+r)/2;

	if(l!=r)
	{
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		simpleMerge(a,l,mid+1,r);
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

	Merge obj=new Merge();

	obj.mergeSort(arr,0,arr.length-1);

	System.out.println("\nElements after sorting");

	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);


}//psvm

}//class


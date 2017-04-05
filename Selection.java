import java.util.*;

class Selection
{

void selectionSort(int a[])
{
	int i,j,min,p,t;

	for(i=0;i<a.length-2;i++)
	{
		min=a[i];
		p=i;

		for(j=i+1;j<=a.length-1;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
				p=j;
			}
		}

		t=a[i];
		a[i]=a[p];
		a[p]=t;
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

	Selection obj=new Selection();

	obj.selectionSort(arr);

	System.out.println("\nElements after sorting");

	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);

}//psvm

}//class
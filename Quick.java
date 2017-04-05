import java.util.*;


class Quick
{

int partition(int a[],int l,int r)
{
	int x,i,j,t;

	i=l;
	j=r;
	x=a[l];

	while(i<j)
	{
		while(i<=r&&a[i]<=x)
		i++;

		while(a[j]>x)
		j--;

		if(i<j)
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}

	t=a[l];
	a[l]=a[j];
	a[j]=t;

	return j;
}


void quicksort(int a[],int l,int r)
{
	int p;

	if(l<r)
	{
		p=partition(a,l,r);
		quicksort(a,l,p-1);
		quicksort(a,p+1,r);
	}
}



public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the total number of elements: ");
	int n=sc.nextInt();

	int arr[]=new int[n];

	System.out.println("Enter "+n+" elements");

	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();

	Quick obj1=new Quick();

	obj1.quicksort(arr,0,n-1);

	System.out.println("\n\nTHE SORTED ARRAY IS\n");
	for(int i=0;i<n;i++)
	System.out.println(arr[i]);
	

}

}//class
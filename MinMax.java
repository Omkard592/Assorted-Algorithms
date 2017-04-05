//Recursive implementation to find min or max from a given array

import java.util.*;

class FindMinMax
{

int findMin(int a[],int l,int r)
{

int mid,min1,min2;

if(l<r)
{
mid=(l+r)/2;
min1=findMin(a,l,mid);
min2=findMin(a,mid+1,r);

if(min1<min2)
return min1;

else
return min2;
}

else
return a[l];
}


int findMax(int a[],int l,int r)
{

int mid,max1,max2;

if(l<r)
{
mid=(l+r)/2;
max1=findMax(a,l,mid);
max2=findMax(a,mid+1,r);

if(max1>max2)
return max1;

else
return max2;
}

else
return a[l];
}

}//class


class MinMax
{
public static void main(String args[])
{

	int n,arr[],min,max;


	Scanner sc=new Scanner(System.in);

	System.out.println("\nEnter the size of array: ");
	n=sc.nextInt();

	arr=new int[n];

	System.out.println("Enter "+n+" elements\n");

	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();


	FindMinMax obj=new FindMinMax();

	min=obj.findMin(arr,0,n-1);
	max=obj.findMax(arr,0,n-1);

	System.out.println("The minimum element is "+min);
	System.out.println("The maximum element is "+max);

}

}//class

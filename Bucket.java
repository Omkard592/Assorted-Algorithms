import java.util.*;


class Bucket
{


void bucketSort(int a[])
{

	int i,j,bucket[][],c[],digit,k,z;

	bucket=new int[a.length][10];

	c=new int[10];

	for(j=0;j<=9;j++)
	c[j]=-1;

	for(j=0;j<=a.length-1;j++)
	{
		digit=a[j];
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

	Bucket obj=new Bucket();

	obj.bucketSort(arr);

	System.out.println("\nElements after sorting");

	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
}

}//class
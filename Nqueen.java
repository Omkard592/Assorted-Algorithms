import java.util.*;


class NqueenTest
{

int n; 		//number of queens
int x[] ; 	//array which stores columns of queens


void read()
{
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter number of queens ");
    	n=sc.nextInt();

    		//create x array of n+1 elements
    	x=new int[n+1];

}


boolean place(int k,int i)
{
    	for(int j=1;j<=k-1;j++)
    	{
      		if(x[j]==i||Math.abs(x[j]-i)==(k-j))
       		return false;
    	}

    	return true;
}


void nqueen(int k)
{
    	for(int i=1;i<=n;i++)
    	{
      		if(place(k,i))
      		{
       			x[k]=i;
	
       			if(k==n)
       			{
         			//print solution
         			for(int j=1;j<=n;j++)
          			System.out.print(x[j]+"   ");

        			System.out.println();
       			}
       			
			else
        		nqueen(k+1);
      		}

    	 }

} 

} //class

   
public class Nqueen
{
     
	public static void main(String args[])
     	{
      		NqueenTest nq=new NqueenTest();
       		nq.read();
       		nq.nqueen(1);
     	}

}



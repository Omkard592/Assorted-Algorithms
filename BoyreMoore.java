import java.util.*;


class PatternMatching
{
	
	int bm(String t,String p)
	{
		int l=t.length();
		int m=p.length();
		int i=m-1;
		int j=m-1;
		
		do
		{
			
			if(t.charAt(i)==p.charAt(j))
			{
				if(j==0)
				return i;

				else
				{
					i--;
					j--;
				}
			}

			else
			{
				
				i=i+m-Math.min(j,1+p.lastIndexOf(t.charAt(i)));
				j=m-1;
				
				
			}
		}

		while(i<=l-1);
		return -1;
	}

}

class BoyreMoore
{
	public static void main(String args[])
	{
		String t,p;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Text:");
		t=sc.nextLine();

		System.out.println("Enter Pattern:");
		p=sc.nextLine();

		PatternMatching pm=new PatternMatching();
		int i=pm.bm(t,p);

		if(i==-1)
		System.out.println("Match Not Found");

		else
		System.out.println("Match found at position:"+i);
	}
}

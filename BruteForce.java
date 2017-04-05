import java.util.*;


class PatternMatching
{
	int bf(String t,String p)
	{
		int l=t.length();
		int m=p.length();

		for(int i=0;i<=l-m;i++)
		{
			int j=0;

			while(t.charAt(i+j)==p.charAt(j))
			{
				j++;
				if(j==m)
				return i;//Match Found
			}
		}
		return -1;
	}
}


class BruteForce
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
		int i=pm.bf(t,p);

		if(i==-1)
		System.out.println("Match Not Found");
		else
		System.out.println("Match found at position:"+i);
	}
}

import java.util.*;
class counter 
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner (System.in);
		String dna;
		int a=0;
		int t=0;
		int g=0;
		int c=0;
		int i;
		System .out.println("Enter dna sequence");
		dna=sc.next().toUpperCase();
		dna=dna.replaceAll("[^ATGC]","");
		if(dna==null ||dna.isEmpty())
		{
			return;
		}
		for (i=0;i<dna.length();i++)
		{
			char base =dna.charAt(i);
			if(base=='A') a++;
			else if (base=='T') t++;
			else if (base=='G')g++;
			else if (base=='C')c++;
		}
		System.out.println("A:"+a);
		System.out.println("T:"+t);
		System.out.println("G:"+g);
		System.out.println("C:"+c);
	}
}
		

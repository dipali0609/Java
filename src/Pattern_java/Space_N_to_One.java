package Pattern_java;

public class Space_N_to_One 
{
public static void main(String[] args) 
{
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<i;j++)
	{
		System.out.print(" ");
	}
	for(int k=n;k>=i;k--)
	{
		System.out.print("*");
	}
	System.out.println();
}

}
}

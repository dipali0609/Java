
//public class Number 
//{
//	public static void print(int n)
//	{
//		if(n<=100)
//		{
//			System.out.println(n);
//			n++;
//			print(n);
//		}
//	}
//public static void main(String[] args) 
//{
//	print(1);
//}
//}

public class Number
{
	public static void print(int n)
	{
		if(n>0)
		{
			System.out.println(n);
			n--;
			print(n);
		}
		
	}
	public static void main(String[] args) {
		print(100);
	}
}
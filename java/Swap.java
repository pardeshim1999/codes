class Swap
{
	public static int a=20;
	public static int b=30;
	public static void main(String args[])
	{

		System.out.println("Value of A before swap="+a);
		System.out.println("Value of B before swap="+b);

		swap(a,b);

		System.out.println("Value of A after swap="+a);
		System.out.println("Value of B after swap="+b);
	}

	static int swap(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;

		a=x;
		b=y;
		return temp;
	}
}

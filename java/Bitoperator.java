class Bitoperator
{
	public static void main(String args[])
	{
		int a=60;
		int b=13;
		int c=0;
	System.out.println("Value of A="+ a);
	System.out.println("Value of B="+ b);

	c=a&b;
	System.out.println("a&b="+ c);

	c=a|b;
	System.out.println("a|b="+ c);

	c=a^b;
	System.out.println("a^b="+c);

	c=a<<2;
	System.out.println("a<<2="+c);

	c=b<<2;
	System.out.println("b<<2="+c);

	c=a>>2;
	System.out.println("a>>2="+c);

	c=b>>2;
	System.out.println("b>>2="+c);
	}
}

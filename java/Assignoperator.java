class Assignoperator
{
	public static void main(String args[])
	{
		int a=20;
		int b=15;

		System.out.println("A="+ a);
		System.out.println("B="+ b);

		a+=b;
		System.out.println("a+b="+ a);

		a-=b;
		System.out.println("a-b="+ a);

		a*=b;
		System.out.println("a*b="+ a);

		a/=b;
		System.out.println("a/b="+ a);

		a%=b;
		System.out.println("a%b="+ a);

		a<<=2;
		System.out.println("a<<2="+ a);

		b<<=2;
		System.out.println("b<<2="+ b);

		a>>=2;
		System.out.println("a>>2="+ a);

		b>>=2;
		System.out.println("b>>2="+ b);
	}
}

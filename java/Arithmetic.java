class Arithmetic
{
	public static void main(String args[])
	{
		int a=70;
		int b=30;
		int c=0;

		System.out.println("A="+ a);
		System.out.println("B="+ b);

		c=a+b;
		System.out.println("Addition:"+ c);

		c=a-b;
		System.out.println("Substraction:"+c);

		c=a*b;
		System.out.println("Multiplication:"+ c);

		c=a/b;
		System.out.println("Division:"+ c);

		c=a%b;
		System.out.println("Modulus:"+ c);

		c=++a;
		System.out.println("Preincrement of a1:"+ c);
		c=++a;
		System.out.println("Preincrement of a2:"+ c);
		c=++a;
		System.out.println("Preincrement of a3:"+ c);
		c=++a;
		System.out.println("Preincrement of a4:"+c);

		c=--a;
		System.out.println("Predecrement of a4:"+c);
		c=--a;
		System.out.println("Predecrement of a3:"+c);
		c=--a;
		System.out.println("Predecrement of a2:"+c);
		c=--a;
		System.out.println("Predecrement of a1:"+c);

		c=a++;
		System.out.println("Postincrement of a1:"+c);
		c=a++;
		System.out.println("Postincrement of a2:"+c);
		c=a++;
		System.out.println("Postincrement of a3:"+c);
		c=a++;
		System.out.println("Postincrement of a4:"+c);

		c=a--;
		System.out.println("Postdecrement of a4:"+c);
		c=a--;
		System.out.println("Postdecrement of a3:"+c);
		c=a--;
		System.out.println("Postdecrement of a2:"+c);
		c=a--;
		System.out.println("Postdecrement of a1:"+c);

	}
}


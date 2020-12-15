class Switch
{
	public static void main(String args[])
		{
			int a=30;
			int b=20;
			int c=0;
			char ch;
			ch=2;

			System.out.println("A="+ a);
			System.out.println("B="+ b);
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");

			switch(ch)
				{
					case 1:
					c=a+b;
					System.out.println("Addition of two number is "+ c);
					break;

					case 2:
                                        c=a-b;
                                        System.out.println("Subtraction of two number is "+ c);
                                        break;

					case 3:
                                        c=a*b;
                                        System.out.println("Multiplication of two number is "+ c);
                                        break;

					case 4:
                                        c=a+b;
                                        System.out.println("Division of two number is "+ c);
                                        break;

					default:
					System.out.println("Thank you");


				}
		}
}

class Calculation //subclass
	{
		int z;

		public void add(int x,int y)
			{
				z=x+y;
				System.out.println("the sum of the given numbers:"+z);
			}
		public void substraction(int x,int y)
			{
				z=x-y;
				System.out.println("the diff between the given numbers:"+z);
			}
	}
public class Multipleinheritance extends Calculation  //main class
	{
		public void multiplication(int x, int y)
			{
				z=x*y;
				System.out.println("the product of the given numbers:"+z);
			}
public static void main(String args[])
	{
		int a=20;
		int b=10;

		Multipleinheritance demo = new Multipleinheritance();
		demo.add(a,b);
		demo.substraction(a,b);
		demo.multiplication(a,b);
	}

}

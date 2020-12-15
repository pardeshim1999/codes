class Logicoprator
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;

		System.out.println("A="+a);
 		System.out.println("B="+b);
 		System.out.println("C="+c);
 		System.out.println("D="+d);

		if((a==b) && (c==d))
		{
			System.out.println("(a==b) && (c==d) is right");
		}
		else
		{
			System.out.println("(a==b) && (c==d) is wrong");
		}

		if((a!=b) && (c==d))
                {
                        System.out.println("(a!=b) && (c==d) is right");
                }
                else
                {
                        System.out.println("(a!=b) && (c==d) is wrong");
		}

 		 if((a==b) && (c!=d))
                {
                        System.out.println("(a==b) && (c!=d) is right");
                }
                else
                {
                        System.out.println("(a==b) && (c!=d) is wrong");
		}

  		if((a!=b) && (c!=d))
                {
                        System.out.println("(a!=b) && (c!=d) is right");
                }
                else
                {
                        System.out.println("(a!=b) && (c!=d) is wrong");
                }
  		if((a==b) || (c==d))
                {
                        System.out.println("(a==b) || (c==d) is right");
                }
                else
                {
                        System.out.println("(a==b) || (c==d) is wrong");
                }
 		 if((a==b) || (c!=d))
                {
                        System.out.println("(a==b) || (c!=d) is right");
                }
                else
                {
                        System.out.println("(a==b) || (c!=d) is wrong");
                }
		  if((a!=b) || (c!=d))
                {
                        System.out.println("(a!=b) || (c!=d) is right");
                }
                else
                {
                        System.out.println("(a!=b) || (c!=d) is wrong");
		}
                 if(!((a==b) || (c==d)))
                {
                        System.out.println("!((a==b) || (c==d)) is right");
                }
                else
                {
                        System.out.println("!((a==b) || (c==d)) is wrong");
                }
                 if(!((a==b) || (c!=d)))
                {
                        System.out.println("!((a==b) || (c!=d)) is right");
                }
                else
                {
                        System.out.println("!((a==b) || (c!=d)) is wrong");
                }
                  if(!((a!=b) || (c!=d)))
                {
                        System.out.println("!((a!=b) || (c!=d)) is right");
                }
                else
                {
                        System.out.println("!((a!=b) || (c!=d)) is wrong");
                }
 if(!((a==b) && (c==d)))
                {
                        System.out.println("!((a==b) && (c==d)) is right");
                }
                else
                {
                        System.out.println("!((a==b) && (c==d)) is wrong");
                }
                 if(!((a==b) && (c!=d)))
                {
                        System.out.println("!((a==b) && (c!=d)) is right");
                }
                else
                {
                        System.out.println("!((a==b) && (c!=d)) is wrong");
                }
                  if(!((a!=b) && (c!=d)))
                {
                        System.out.println("!((a!=b) && (c!=d)) is right");
                }
                else
                {
                        System.out.println("!((a!=b) && (c!=d)) is wrong");
                }


	}
}

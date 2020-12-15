public class Emp
{
	// this instance variable is visible for any child class.
        public String name;

	// salary visible is visible in Emp class only.
        private double salary;

	// the name variable is assigned in the constructor.
        public Emp (String empname)
                {
                        name = empname;

                }
	// the salary variable is assigned a value.

        public void setsalary(double empsal)
                {
                        salary = empsal;
                }
        public void printEmp()
                {
                        System.out.println("name: "+ name);
                        System.out.println("salary:"+ salary);

                }
        public static void main(String args[])
		{
			Emp empone = new Emp("Manesh");
			empone.setsalary(100000);
			empone.printEmp();

			Emp emptwo = new Emp("abhisekh");
			emptwo.setsalary(15000);
			emptwo.printEmp();

			Emp empthree = new Emp("chaitanya");
			empthree.setsalary(20000);
			empthree.printEmp();

			emptwo.printEmp();

		}
}

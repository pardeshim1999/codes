public class Stud
{
	public String name;
	private double rollcall;
	public String division;
	public String dept;
	public Stud (String studname)
		{
			name = studname;
		}
	public void  Studiv (String divname)
		{
			division = divname;
		}
	public void Studept (String depname)
		{
			dept = depname;
		}
	public void rollcall(double studroll)
		{
			rollcall = studroll;
		}
	public void printStud()
		{
			System.out.println("Student Name:"+ name);
			System.out.println("Student Roll N0:"+ rollcall);
			System.out.println("Student Division:"+ division);
			System.out.println("Student Department:"+ dept);
		}
	public static void main(String args[])
		{
			Stud studone = new Stud("Manish pardeshi");
			studone.rollcall(001);
			studone.Studiv("A");
			studone.Studept("Computer");

			studone.printStud();
		}
}






































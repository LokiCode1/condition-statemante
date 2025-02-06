import java.util.Scanner;
class SeasonProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Month:");
		
		String month = sc.nextLine().toUpperCase();
		
		String ans = (month.equals("OCT")||month.equals("NOV")||
			          month.equals("DEC")||month.equals("JAN"))?(month+" is Winter"):
			        ((month.equals("FEB")||month.equals("MAR")||
			          month.equals("APR")||month.equals("MAY"))?(month+" is Summer"):
			        ((month.equals("JUN")||month.equals("JUL")||
			          month.equals("AUG")||month.equals("SEP"))?(month+" is Monsun"):
			         ("Invailid Data")));
		System.out.println(ans);
		
	}
}

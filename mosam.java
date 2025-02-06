import java.util.Scanner;
class SeasonsProgram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month");
		int month = sc.nextInt();
		String ans = (month==10 || month==11 || month==12 || month==1 )?("Winter"):
			         ((month==2 || month==3 || month==4 || month==5 )?("Summer"):("Monsoon"));
		System.out.println(ans);
		
		
	}
}

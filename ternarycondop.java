import java.util.Scanner;
class TernaryCondOp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		 
		String ans = (num%2==0 && num%5==0)?(num + " Hey2 Hey5"):((num%2==0)?(num + " Hey2 "):((num%5==0)?(num + " Hey5 "):(num + "   ")));
		System.out.println(ans);
	}
}

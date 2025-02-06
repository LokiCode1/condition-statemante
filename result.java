import java.util.Scanner;
class Result1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int mark = sc.nextInt();
		float per = (mark/600f)*100f;
		String ans = (per>=35)?("You are pass"):("Your are Fail");
		System.out.println(ans);
		String grade = (per>=75)?("grade A"+ per +"%"):
			           (per>=60);
	}
}

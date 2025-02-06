import java.util.Scanner;
class ResultGrade 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Physics:");
		float pMark = sc.nextFloat();
		
		System.out.println("Enter marks of Chemistry:");
		float cMark = sc.nextFloat();
		
		System.out.println("Enter marks of Biology:");
		float bMark = sc.nextFloat();
		
		System.out.println("Enter marks of Mathamatics:");
		float mMark = sc.nextFloat();
		
		System.out.println("Enter marks of Marathi:");
		float maMark = sc.nextFloat();
		
		System.out.println("Enter marks of English:");
		float eMark = sc.nextFloat();
		
		System.out.println("Enter Total Marks:");
		float total = sc.nextFloat();	
		
		float per = ((pMark + cMark + bMark + mMark + maMark + eMark )/total)*100f;
		
		String ans = (per>=75)?("Pass With " +per+ "% and A grade"):
			         ((per>=60)?("Pass with " +per+"% and B grade"):
			         ((per>=50)?("Pass with " +per+ "% and C grade"):
			         ((per>=35)?("Pass with " +per+ "% and D grade"):
			          ("Fail With " + per+"%"))));
		System.out.println(ans);
	}
}

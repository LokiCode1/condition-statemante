import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		char value = sc.next().charAt(0);
	    String ans = (value == 'a' || value == 'e' || value == 'i'|| value == 'o' || value == 'u'||
			value == 'A' || value == 'E' || value == 'I'|| value == 'O' || value == 'U' )?("Its vowel"):("Its consonant");
			               
		System.out.println(ans);				   
						   
						   
	}
}

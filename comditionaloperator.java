class CondOperExample 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 44;
		int c = 555;
		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);
	}
}

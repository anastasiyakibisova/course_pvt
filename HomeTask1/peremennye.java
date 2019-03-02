
public class peremennye {
	public static void main(String [] args) {
		int a=65050;
		short b=5;
		long c=2147483648L;
		double d=987.15d;
		float f=9.25f;
		char e='a';
		boolean g=true;
		int result1=a+b; ///сумма int и short
		double result2=c-d;// разность long и double
		double result3=f*d;// произведение float и double
		if (c>d) // результат сравнения long > double
		{
			g=true;
		}
		else
		{
			g=false;
		}
		System.out.println(" результат сравнения long > double "+g);
		if (f<a)//float < int
		{
			g=true;
		}
		else
		{
			g=false;
		}
		System.out.println(" результат сравнения float < int " +g);
		if (result2==result3)// также результат сравнения на равенство и неравенство двух любых переменных
		{
			System.out.println(" result3 = result2");
		}
		else
		{
				System.out.println(" result3 != result2");
		}
		System.out.print(result1+"   ");
		System.out.printf("%2f", f);
		System.out.print("\n");
		System.out.println(result2);
		System.out.println(result3);
	}

}

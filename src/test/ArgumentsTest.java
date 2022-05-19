package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();
		sum(6,5);
		

	}
	public static void sum() {
		int a=4+5;
		System.out.println(a);
	}
	public static void sum (int p, int q)
	{
		int b = p+q;
		System.out.println(b);
	}
}

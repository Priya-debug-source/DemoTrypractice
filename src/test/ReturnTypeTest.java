package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x= sum(4,5);
		System.out.println(x);
		
		String y=test();
		System.out.println(y);
			
		}
public static int sum(int p, int q) {
	
		int b=p+q;
		return b;
	
	}
public static String test() {
	String s="hello";
	String r="world";
	return r;
}

}

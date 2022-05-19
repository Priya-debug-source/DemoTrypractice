package test;

import java.util.ArrayList;

public class ArrayListTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> all=new ArrayList<String>();
		
		all.add("abc");
		all.add("fg");
		all.add("sdhcdj");
		all.add("adf");
		all.add("adf");
		all.add("rtc");
		all.add("dffc");
		all.add("aere");
		System.out.println(all.get(4));
		
		
		System.out.println(all.size());
		
		
		
		all.remove(1);
		System.out.println(all.get(1));
		
		
		for(int i=0; i<all.size(); i++) {
			System.out.println(all.get(i));
		}
	}

}

package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tools = {"selenium", "jira","QC","QTP"};
		System.out.println(tools.length);
//		System.out.println(tools[3]);

		for(int i=0; i<tools.length; i++) {
			System.out.println(tools[i]);
			if(tools[i].equals("QC")){
				break;
			}
		}
		
		
	}
	

}

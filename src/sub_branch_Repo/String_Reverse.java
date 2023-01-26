package sub_branch_Repo;

public class String_Reverse {

	public static void main(String[] args) {
	
		String city="rupaloS";
		int len=city.length();
		
		String city1="";
		
		for(int i=len-1;i>=0;i--) {
			
			city1=city1+city.charAt(i);
		}
		
		System.out.println(city1);
		
		System.out.println(city);
		
	}

}

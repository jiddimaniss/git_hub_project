package sub_branch_Repo;

public class prime_no {

	public static void main(String[] args) {

    String name="Santosh Jiddimani";
    
    int len= name.length();
     
    for(int i=0;i<=len-1;i++) {
    	char aa=name.charAt(i);
    	
    	if(aa>=65 && aa<=90) {
    		
    		System.out.print(aa);
    	}
    }

	}

}

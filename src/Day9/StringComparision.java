package Day9;

public class StringComparision {

	public static void main(String[] args) {
		//case1
		
		/*String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2); 	//true
		System.out.println(s1.equals(s2));	//true
		*/
		
		//case2
		
		/*String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2); 	//false  //to compare the objects
		System.out.println(s1.equals(s2));	//true //to compare values of object*/
		
		//Case3
		
		/*String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2); 	//false  //to compare the objects
		System.out.println(s1.equals(s2));	//true //to compare values of object*/
		
		//case4
		
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s1==s2);		//false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2==s3);    //true
		System.out.println(s2.equals(s3));	//true
		
		System.out.println(s1==s3);		//false
		System.out.println(s1.equals(s3));	//true
		
	}

}

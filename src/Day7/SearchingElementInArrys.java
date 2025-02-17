package Day7;

public class SearchingElementInArrys {

	public static void main(String[] args) 
	{
	int a[]= {10,20,30,40,50};
	int search_element=30;
	
	boolean status=false; //false - notfound   true-found
	
	/*for(int i=0; i<a.length;i++)
	{
	
		if(a[i]==search_element)
		{
			System.out.println("Element found" + i);
			status=true;
			break;
		}
	}*/
	
	for(int x:a)
	{
	
		if(x==search_element)
		{
			System.out.println("Element found");
			status=true;
			break;
		}
	}
	
	if(status==false)
	{
		System.out.println("Element Not found");
	}


	}}

package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.setAccno(101);
		acc.setAmount(5600000);
		acc.setName("john");
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
		

	}

}

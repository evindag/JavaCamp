package throwDemo;

public class Main {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		System.out.println("Account : " +manager.getBalance());
		manager.deposit(100);
		System.out.println("Account : " +manager.getBalance());
		try {
			manager.withdraw(90);
		} catch (BalanceInsufficentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Account : " +manager.getBalance()); 
		try {
			manager.withdraw(90);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Account : " +manager.getBalance());
		
		
	}

}

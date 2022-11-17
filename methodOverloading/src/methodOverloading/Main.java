package methodOverloading;

public class Main {

	public static void main(String[] args) {
		fourTransactions fourTransactions= new fourTransactions(); 
		System.out.println(fourTransactions.sum(2, 3));
		fourTransactions.sum(2,3,5);
	}

}

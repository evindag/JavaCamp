package packages;
import math.FourTransactions;
import math.Logarithm;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name : ");
		String name = scanner.nextLine();
		System.out.println("Hello e" + name);
		
		
		FourTransactions fourTransactions = new FourTransactions();
		fourTransactions.sum(3, 4);
		Logarithm logarithm = new Logarithm();
	}
}

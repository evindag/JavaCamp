package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1,"Evin","Dağ"));
		customers.add(new Customer(2,"Ayşe","Aksu"));
		customers.add(new Customer(3,"Serhat","Yılmaz"));
		
		for(Customer customer:customers) {
			System.out.println(customer.firstName);
		}
	}
}

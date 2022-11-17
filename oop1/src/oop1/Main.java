package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		Product product1 = new Product();
		product1.setName("D kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(4);
		product1.setImageUrl("sff");
	

		Product product2 = new Product();
		product2.setName("D kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(4);
		product2.setImageUrl("sff");
		
		Product product3 = new Product();
		product3.setName("D kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(4);
		product3.setImageUrl("sff");
		
		
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			System.out.println("</ul>");
			IndividualCustomer individualCustomer= new IndividualCustomer();
			individualCustomer.setId(1);
			individualCustomer.setPhone("8274784783");
			individualCustomer.setCustomerNumber("12356");
			individualCustomer.setFirstName("Evin");
			individualCustomer.setLastName("Dağ");
			
			CorporateCustomer corporateCustomer = new CorporateCustomer();
			corporateCustomer.setId(2);
			corporateCustomer.setCompanyName("kodlama.io");
			corporateCustomer.setPhone("27323737");
			corporateCustomer.setTaxtNumber("26366");
			corporateCustomer.setCustomerNumber("12344");
			
			Customer[] customers = {individualCustomer,corporateCustomer};
			
		}

	}

}

package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(id=1,name="Phone",description="iphone", price=5000,stockAmount=25);
		Product product= new Product();
		product.setId(1);
		product.setName("Phone");
		product.setDescription("Iphone");
		product.setPrice(5000);
		product.setStockAmount(25);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		

	}

}

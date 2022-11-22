package staticProject;

public class ProductValidator {
	
	static {
		System.out.println(" static constructor block worked");
	}
	public ProductValidator() {
		System.out.println("constructor block worked");
	}
	public boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public static class product{
		public static void delete() {
			
		}
	}
}

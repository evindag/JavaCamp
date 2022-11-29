package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try
		{
			int[] numbers = new int[] {1,2,3};
			System.out.println(numbers[5]);
		}catch(Exception exception) {
			System.out.println("There is exception : " + exception);
		}finally {
			System.out.println("Its always runing.");
		}

	}

}

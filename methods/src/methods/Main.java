package methods;

public class Main {

	public static void main(String[] args) {
		
			String message ="Today weather is beautiful.";
			String newMessage = city();
			System.out.println(newMessage);
			
			int number= sum(5,7);
			System.out.println(number);
			int Sum= sum2(2,3,4,5);
	        System.out.println(Sum);
		}

		public static void add() {
			System.out.println("added");
		}

		public static void remove() {
			System.out.println("removed");

		}

		public static void update() {
			System.out.println("updated");

		}
		public static int sum(int number1, int number2) {
			return number1+number2;
		}
		public static int sum2(int... numbers) {
			int Sum=0;
			for (int number:numbers) {
				Sum+=number;
			}
			return Sum;
		}
		public static String city() {
			return "ankara";
		}

	}



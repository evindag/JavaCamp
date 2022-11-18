package Overriding;

public class StudentCreditManager extends BaseCreditManager{
	public double calculate(double total) {
		return total * 1.10;
	}
}

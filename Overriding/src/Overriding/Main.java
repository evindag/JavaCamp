package Overriding;

public class Main {
	public static void main(String[] args) {
	//	TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
	//	System.out.println(teacherCreditManager.calculate(1000));
	//}
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {
				new TeacherCreditManager(),new FarmingCreditManager(),new StudentCreditManager()};
		for(BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(1000));
		}
	}

}

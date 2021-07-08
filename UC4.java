package emp;

public class UC4 {
	public static void main(String[] args) {
		//variables
		int empHours = 0;
		int empWage = 0;
		//constants
		int PART_TIME =1;
		int FULL_TIME=2;
		int EMP_PER_HOUR_RATE =20;
		//calculation
		int empCheck = (int)Math.floor(Math.random()*10)%3;
		switch (empCheck) {
		case 1:
			empHours =4;
			break;
		case 2:
			empHours =8;
			break;

		default:
			empHours = 0;
			break;
		}
		empWage = empHours * EMP_PER_HOUR_RATE;
		System.out.println("The employee wage for a day = "+ empWage);
	}

}

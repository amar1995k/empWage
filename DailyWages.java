package emp;

public class DailyWages
{
	
	public static void main(String[] args)
	{
		//constants
		int IS_FULL_TIME = 1;
			//computation
		double empCheck = Math.floor(Math.random() * 10)% 2 ;
		if (empCheck == IS_FULL_TIME) 
		{
			System.out.println("Employee is Present");
			int HOUR=8;
			int WAGE_PER_HOUR=20;
			int x ;
			x = HOUR*WAGE_PER_HOUR;
			System.out.println(" Total Wage of a day " + x);
			
		} 
		else
		{
			System.out.println("Employee is Abscent");
	
		}
	}

}



package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {
//		creating object
		EmployeeWageComputation e = new EmployeeWageComputation();
		e.employeeDailyWage();
	}
//	constants
	static int IS_FULLTIME = 1;
	static int IS_PART_TIME = 2;
	static int EMP_WAGE_PER_HR = 20;

	
//	generating random value (0 &1)
	double EMP_CHECK = Math.floor(Math.random() * 10) % 3;
	int empHrs = 0;
	
//	creating method to calculate daily wage
	public void employeeDailyWage() {
		
		if (IS_FULLTIME == EMP_CHECK) {
			empHrs=8;	
		}else if (IS_PART_TIME == EMP_CHECK) {
			empHrs = 4;
		}
		else {
			empHrs = 0;
		}
		int empWage = EMP_WAGE_PER_HR * empHrs;
		System.out.println("Daily Employee Wage is " + empWage);
	}
}
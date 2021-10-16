package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {
	
		EmployeeWageComputation e = new EmployeeWageComputation();
		e.employeeDailyWage();

	}
//	constants
	static int IS_PRESENT = 1;
	static int EMP_WAGE_PER_HR = 20;
	static int WORK_HRS = 8;
	
//	generating random value (0 &1)
	double EMP_CHECK = Math.floor(Math.random() * 10) % 2;
	int empHrs = 0;
	
//	creating method to calculate daily wage
	public void employeeDailyWage() {
		
		if (IS_PRESENT == EMP_CHECK) {
			empHrs=8;
		}else {
			empHrs = 0;
		}
		int empWage = EMP_WAGE_PER_HR * empHrs;
		System.out.println("Daily Employee Wage is " + empWage);
	}
}

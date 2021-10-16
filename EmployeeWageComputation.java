package com.bridgelabz.oops;

public class EmployeeWageComputation {
	
//	CONSTANTS
	
	static int IS_FULLTIME = 1;
	static int IS_PART_TIME = 2;
	static int IS_ABSENT = 0;
	static int EMP_WAGE_PER_HR = 20;
	
//	generating random number(0,1,2)
	
	double  emp_Check = Math.floor(Math.random() * 10) % 3;
	int EMP_CHECK = (int) emp_Check;
	static int empHrs = 0;
	
	public void empCheck() {
		switch(EMP_CHECK) {
		case (1):
			empHrs = 8;
			break;
		case (2):
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
	int empWage = EMP_WAGE_PER_HR * empHrs;
	System.out.println("Daily Employee Wage is " + empWage);
	}

	
	public static void main(String[] args) {
//		creating object
		EmployeeWageComputation e = new EmployeeWageComputation();
		e.empCheck();
	}
}
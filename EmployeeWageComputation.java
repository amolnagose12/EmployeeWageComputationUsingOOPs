package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		EmployeeWageComputation e = new EmployeeWageComputation();
		e.empCheck();
	}
	
	public void empCheck() {
//		constants
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_WAGE_PER_HR = 20;
		int NO_OF_WORKING_DAYS = 20;
		int empHrs = 0;
//		GENERATING VALUES 0,1,2 
		double EMP_CHECK = Math.floor(Math.random() * 10) % 3;
		
//		computing emp wage for 20days
		for (int day = 1; day <= NO_OF_WORKING_DAYS; day++) {
			
			if (IS_FULL_TIME == EMP_CHECK) {
				empHrs=8;
				
			}else if (IS_PART_TIME == EMP_CHECK) {
				empHrs = 4;	
			}
			else {
				empHrs = 0;
			}
		}
		int empWage = EMP_WAGE_PER_HR * empHrs;
		System.out.println("Daily Employee Wage is " + empWage);
	}
}

package com.bridgelabz.oops;

public class EmployeeWageComputation{
	

	static int IS_PRESENT = 1;
	
//	getting 0 & 1 random value
	static double RANDOM_CHECK = Math.floor(Math.random() * 10) % 2;
	
//	creating function to check Employee Attendence
	static void empCheck() {
		if (IS_PRESENT == RANDOM_CHECK) {
			System.out.println("Employee Is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}
	
	public static void main(String[] args) {
//		calling function
		empCheck();
	}
}
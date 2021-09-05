package com.greatlearning.assesment1.driver;

import com.greatlearning.assesment1.departments.AdminDepartment;
import com.greatlearning.assesment1.departments.HrDepartment;
import com.greatlearning.assesment1.departments.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepartment hrdept = new HrDepartment();
		TechDepartment tdept= new TechDepartment();
		AdminDepartment addept= new AdminDepartment();
		System.out.println("Welcome to "+addept.departmentName()+"\n"+addept.getTodaysWork()+"\n"+addept.getWorkDeadline()+"\n"+addept.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to "+hrdept.departmentName()+"\n"+hrdept.getTodaysWork()+"\n"+hrdept.getWorkDeadline()+"\n"+hrdept.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to "+tdept.departmentName()+"\n"+tdept.getTodaysWork()+"\n"+tdept.getWorkDeadline()+"\n"+tdept.getTechStackInformation()+"\n"+tdept.isTodayAHoliday());
		System.out.println();
	}
}



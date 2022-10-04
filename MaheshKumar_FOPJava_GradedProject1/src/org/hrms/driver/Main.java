package org.hrms.driver;

import org.hrms.admin.AdminDepartment;
import org.hrms.hr.HrDepartment;
import org.hrms.tech.TechDepartment;

public class Main {

	public static void main(String[] args) {

		String note = "Welcome to"; // Common note
		String str;

		// Admin department display all its functionalities
		AdminDepartment instanceObj = new AdminDepartment(); // Initialize AdminDepartment

		str = instanceObj.departmentName();
		System.out.println(note + " " + str);

		str = instanceObj.getTodaysWork();
		System.out.println(str);

		str = instanceObj.getWorkDeadline();
		System.out.println(str);

		str = instanceObj.isTodayAHoliday();
		System.out.println(str);

		System.out.println();

		// HR department display all its functionalities
		HrDepartment instanceObj1 = new HrDepartment(); // Initialize HrDepartment

		str = instanceObj1.departmentName();
		System.out.println(note + " " + str);

		str = instanceObj1.doActivity();
		System.out.println(str);

		str = instanceObj1.getTodaysWork();
		System.out.println(str);

		str = instanceObj1.getWorkDeadline();
		System.out.println(str);

		str = instanceObj1.isTodayAHoliday();
		System.out.println(str);

		System.out.println();

		// Tech department display all its functionalities
		TechDepartment instanceObj2 = new TechDepartment(); // Initialize TechDepartment

		str = instanceObj2.departmentName();
		System.out.println(note + " " + str);

		str = instanceObj2.getTodaysWork();
		System.out.println(str);

		str = instanceObj2.getWorkDeadline();
		System.out.println(str);

		str = instanceObj2.getTechStackInformation();
		System.out.println(str);

		str = instanceObj2.isTodayAHoliday();
		System.out.println(str);

	}

}

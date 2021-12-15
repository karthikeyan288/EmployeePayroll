package com.File_IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollServices {

		public enum IOService {
			CONSOLE_IO, FILE_IO, REST_IO
		} 
		private static final String HOME = "Data/abc/emp.txt" ;

		private List<EmployeePayroll_Info> EmployeePayrollList;

		EmployeePayRollServices(List<EmployeePayroll_Info> EmployeePayRollList) {
			this.EmployeePayrollList = EmployeePayRollList;
		}
		public static void main(String[] args) {
			List< EmployeePayroll_Info> EmployeePayRollList = new ArrayList<>();
			EmployeePayRollServices employeePayRollService = new EmployeePayRollServices(EmployeePayRollList);
			Scanner consoleInputReader = new Scanner(System.in);
			employeePayRollService.readEmployeePayRollData(consoleInputReader);
			employeePayRollService.writeEmployeePayRollData();
		}
		
		public void printData() {
			try {
				Files.lines(new File(HOME).toPath());
				for (EmployeePayroll_Info employeePayroll_Info : EmployeePayrollList) {
					System.out.println(employeePayroll_Info);
				}
				} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private void readEmployeePayRollData(Scanner consoleInputReader) {
			System.out.println("Enter Employee ID:");
			int id=consoleInputReader.nextInt();
			System.out.println("Enter Employee Name:");
			String name=consoleInputReader.next();
			System.out.println("Enter Employee Salary");
			double salary=consoleInputReader.nextDouble();
			EmployeePayrollList.add(new EmployeePayroll_Info(id, name, salary));
		}
		
		private void writeEmployeePayRollData() {
			System.out.println("\nWriting Employee Payroll detail to console\n"+ EmployeePayrollList);
		}
	}	


package com.labcode.gl;

import java.util.Scanner;

class Employee {
	private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private static final String LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBER_CHARS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";
public Employee() {
	this.firstName = "Puja";
    this.lastName = "Suryawanshi";
}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
        this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 public static String generatePassword(int len) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < len; i++) {
	            int index = (int) (Math.random() * 4);
	            switch (index) {
	                case 0:
	                    sb.append(LOWER_CASE_CHARS.charAt((int) (Math.random() * LOWER_CASE_CHARS.length())));
	                    break;
	                case 1:
	                    sb.append(UPPER_CASE_CHARS.charAt((int) (Math.random() * UPPER_CASE_CHARS.length())));
	                    break;
	                case 2:
	                    sb.append(NUMBER_CHARS.charAt((int) (Math.random() * NUMBER_CHARS.length())));
	                    break;
	                case 3:
	                    sb.append(SPECIAL_CHARS.charAt((int) (Math.random() * SPECIAL_CHARS.length())));
	                    break;
	            }
	        }
	        return sb.toString();
	    }
	 public static String generateEmailAddress(Employee employee) {
	        return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + employee.getDepartment().toLowerCase() + ".abc.com";
	    }
	 public static void showCredentials(Employee employee) {
	        System.out.println("Dear " + employee.getFirstName() + ", Your generated credentials are as follows:\n");
	        System.out.println("\nEmail: " + employee.getEmail());
	        System.out.println("\nPassword: " + employee.getPassword());
	    }
	    
	
	public void display() {

		System.out.println("firstName:"+firstName);

		System.out.println("lastName"+lastName);
	}
	
	public static void main(String[] args){
//	Employee e1 = new Employee();
//	e1.display();
//	
//	Employee e2 = new Employee("Chetan","Suryawanshi");
//	e2.display();
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter the first name: ");
	        String firstName = scanner.nextLine();
	        System.out.print("Please enter the last name: ");
	        String lastName = scanner.nextLine();
	        Employee employee = new Employee(firstName, lastName);
	        System.out.println("Please enter the department from the following");
	        System.out.println("1. Technical");
	        System.out.println("2. Admin");
	        System.out.println("3. Human Resource");
	        System.out.println("4. Legal");
	        int choice = scanner.nextInt();
	        switch (choice) {
	            case 1:
	                employee.setDepartment("Technical");
	                break;
	            case 2:
	                employee.setDepartment("Admin");
	                break;
	            case 3:
	                employee.setDepartment("HumanResource");
	                break;
	            case 4:
	                employee.setDepartment("Legal");
	                break;
	            default:
	                System.out.println("Invalid input");
	                break;
	        }
	        employee.setEmail(generateEmailAddress(employee));
	        employee.setPassword(generatePassword(8));
	        showCredentials(employee);
}
}

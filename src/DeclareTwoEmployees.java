import java.util.Scanner;

public class DeclareTwoEmployees   {

	public static void main(String[] args) {
		Employee clerk = new Employee();
		Employee driver = new Employee();

		clerk = getData(clerk);
		driver = getData(driver);

		System.out.println("Clerk details:");
		System.out.println(clerk.getEmpNum() + " " + clerk.getEmpFirstName() + " " + clerk.getEmpLastName() + " " + clerk.getEmpSalary() + " RON");

		System.out.println("Driver details:");
		System.out.println(driver.getEmpNum() + " " + driver.getEmpFirstName() + " " + driver.getEmpLastName() + " " + driver.getEmpSalary() + " RON");
	}

	public static Employee getData(Employee emp){
		int num = 0;
		String firstName, lastName;
		double salary;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number >> ");
		num = keyboard.nextInt();
		//Remove the Enter key that remains in the input buffer after the last numeric entry
		keyboard.nextLine();
		System.out.print("Enter first name >> ");
		firstName = keyboard.nextLine();
		System.out.print("Enter last name>> ");
		lastName = keyboard.nextLine();
		System.out.print("Enter salary >> ");
		salary = keyboard.nextDouble();
		keyboard.nextLine();
		emp.setEmpNum(num);
		emp.setEmpFirstName(firstName);
		emp.setEmpLastName(lastName);
		emp.setEmpSalary(salary);
		return emp;
	}


}

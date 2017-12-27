package Assaignment.Izeal;

import com.sun.xml.xsom.impl.scd.ParseException;

public class ManagerTest {
	public static void main(String[] args) throws ParseException {
		Employee employee = new Employee("12/11/2017", "John", 8696);
		Employee employee1 = new Employee("12/11/2017", "mat", 6478);
		Employee employee2 = new Employee("12/11/2017", "ken", 9622);
		
		
		System.out.println("employee details:");
		employee.print();
		employee1.print();
		employee2.print();
		//employee.hire_year("12/11/2017");
		System.out.println("After Increment");
	employee.raise_salary(0.6);
		employee1.raise_salary(0.6);
		employee2.raise_salary(0.6);
		//System.out.println("\nraise john salary by 6 %: "+employee.raise_salary(6));
		//System.out.println("raise mat salary by 6 %: "+employee1.raise_salary(6));
		//System.out.println("raise ken salary by 6 %: "+employee2.raise_salary(6));
		System.out.println("\nmanager details");
		manager manager = new manager("05/12/2013", "smith", 10347);
		manager.print();
		manager.setSecretaryname("sasi");
		System.out.println("\nsecratory name: "+manager.getSecretaryname());
		
		//System.out.println(manager.raise_salary(6));
		
	}


}

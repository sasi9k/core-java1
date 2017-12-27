package Assaignment.Izeal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee {
	protected String hire_date;
	protected String name;
	protected double salary;
	public double percent;

	public Employee(String hdate, String nam, double sal) {
		hire_date = hdate;
		name = nam;
		salary = sal;
	}

	public void print() {
		System.out.println("\nHire_date=" + hire_date);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}

	public int hire_year(String hire_date) throws ParseException { 
		this.hire_date=hire_date;
		DateFormat df = new SimpleDateFormat("mm/dd/yyyy"); 
		Date startDate = df.parse(hire_date); 
		return startDate.getYear(); 
 }

	public void raise_salary(double percent) {
		double salary1 = salary * (1 + (percent / 100));
		//return salary1;
	System.out.println(salary1);
	}
}

class manager extends Employee {
	private String Secretaryname;

	public manager(String hdate, String nam, int sal) {
		super(hdate, nam, sal);
	}

	public void raise_salary(double percent) {
		double salary1 = (1/2)*(salary * (1 + (percent / 100)))*12;
		//return salary1;
}

	public String getSecretaryname() {
		return Secretaryname;
	}

	public void setSecretaryname(String secretaryname) {
		Secretaryname = secretaryname;
	}

}




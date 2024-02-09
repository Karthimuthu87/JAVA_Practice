package FirstPackage;

public class EncapsulationExample {

		    public static void main(String[] args) {
	        Employee employee = new Employee();
	        employee.setName("John Smith");
	        employee.setAge(30);
	        employee.setSalary(50000);

	        System.out.println("Name: " + employee.getName());
	        System.out.println("Age: " + employee.getAge());
	        System.out.println("Salary: " + employee.getSalary());
	    }
	}



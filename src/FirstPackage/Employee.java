package FirstPackage;

public class Employee {

	    private String name;
	    private int age;
	    private double salary;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if(age < 18 || age > 65) {
	            throw new IllegalArgumentException("Age must be between 18 and 65");
	        }
	        this.age = age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        if(salary < 0) {
	            throw new IllegalArgumentException("Salary must be greater than or equal to 0");
	        }
	        this.salary = salary;
	    }
	}


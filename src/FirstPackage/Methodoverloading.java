package FirstPackage;

public class Methodoverloading {

					  
			  // method with one int parameter
			  public void sum(int a) {
			    System.out.println("Sum is " + a);
			  }
			  
			  // method with two int parameters
			  public void sum(int a, int b) {
			    System.out.println("Sum is " + (a + b));
			  }
			  
			  // method with two double parameters
			  public void sum(double a, double b) {
			    System.out.println("Sum is " + (a + b));
			  }
			  
			  public static void main(String[] args) {
			    Methodoverloading obj = new Methodoverloading();
			    
			    obj.sum(10); // calls the method with one int parameter
			    obj.sum(10, 20); // calls the method with two int parameters
			    obj.sum(10.5, 20.5); // calls the method with two double parameters
			  }
		
}


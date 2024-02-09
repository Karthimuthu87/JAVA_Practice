package javaAssessment;

public class Variablesexample {

	static int instvar = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variablesexample obj = new Variablesexample();
		obj.method();
	}	
		
	 public void method()
	 {
		 int x = 10;
		 System.out.println(x);
		 
		 if (x < 5)
		 {
			 int y = 20;
			 System.out.println(x);
			 System.out.println(y);
			 
		 }
		 System.out.println(x);
		 System.out.println(instvar);
	 }
	

		


		
		

	}



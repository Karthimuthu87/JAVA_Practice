package FirstPackage;

public class WrapperClass {
	
	
	    public static void main(String[] args) {
	        
	        Integer num1 = 10; 
	        Integer num2 = 20; 

	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);

	        int sum = num1.intValue() + num2.intValue(); 
	        System.out.println("sum = " + sum);

	        
	        Boolean bool1 = true; 
	        Boolean bool2 = false; 

	        System.out.println("bool1 = " + bool1);
	        System.out.println("bool2 = " + bool2);

	        boolean boolResult = bool1.booleanValue() || bool2.booleanValue(); 
	        System.out.println("boolResult = " + boolResult);
	    }
	}



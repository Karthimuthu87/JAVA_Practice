package javaAssessment;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive Datatype
		int num = 12;
		float age = 23.5f;
		char character = 'a';
		boolean day = true;
		
		//Reference Datatype
		
		String name = "Karthi";
		int[] numbers = { 1,2,3,4,5};
		
		System.out.println("Primitive DataTypes");
		System.out.println("***********************");
		System.out.println("Integer Value:"+ num);
		System.out.println("Float Value:"+ age);
		System.out.println("Character:"+ character);
		System.out.println("Is it a Day time:"+ day);
		
		System.out.println("\nReference DataTypes");
		System.out.println("***********************");
		System.out.println("Name of the person:"+ name);
		System.out.println("Numbers:" );
				for( int nums : numbers)
			{
				System.out.print(nums + " ");
			}
	}
}
		
			
	
	

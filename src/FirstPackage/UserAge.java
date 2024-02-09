package FirstPackage;

import java.util.*;

public class UserAge {


	public static void main(String[] args) {
		
		System.out.println("Enter User's age in years and Months:");
		Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
				
			  sc.close();
		//int ageInYears = (int)age;
		
		System.out.println("User's Age in years:"+ age);
		

	}

}

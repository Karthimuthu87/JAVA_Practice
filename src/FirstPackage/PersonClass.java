package FirstPackage;

import java.util.ArrayList;
import java.util.List;

public class PersonClass {
	
	
	String name;
	int age;
	String address;
	int Zipcode;
	
	public PersonClass(String name,int age,String address,int Zipcode) {
		super();
		this.name= name;
		this.age= age;
		this.address= address;
		this.Zipcode= Zipcode;
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
              List<PersonClass>    li = new ArrayList<>();
			PersonClass person1 = new PersonClass("aarthi", 32, "USA", 37647);
			PersonClass person2 = new PersonClass("karthi", 35, "Stockholm", 12742);
	        PersonClass person3 = new PersonClass("Sharanya", 36, "Australia", 7477);
	        PersonClass person4 = new PersonClass("Vanitha", 37, "Japan", 56383);
	        
	        li.add(person1);
	        li.add(person2);
	        li.add(person3);
	        li.add(person4);
	        
	        for (PersonClass personClass : li) {
	        	
	        	System.out.println(personClass.name);
	        	System.out.println(personClass.age);
	        	System.out.println(personClass.address);
	        	System.out.println(personClass.Zipcode);
	        }
		}
		
}


package FirstPackage;
import java.util.ArrayList;
import java.util.List;

public class PersonClassCollection implements Comparable<PersonClassCollection>{
	
	@Override 
	
		String name;
		Integer age;
		String address;
		int Zipcode;
		
		public PersonClassCollection(String name,int age,String address,int Zipcode) {
			super();
			this.name= name;
			this.age= age;
			this.address= address;
			this.Zipcode= Zipcode;
			
		}
		
		
		public Integer compareTo(T o) {
			if (this.age > o.age)
			{
			return -1;
			} else if (this.age < o.age) 
			{
				return 1;
			}else
				
				return 0;
				
		}
		
		@Override
		
		//String
		
		public String compareTo1(T o) {
			this.name.compareTo(o.name);
			
			
		}
		
		
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
	              List<PersonClassCollection>    li = new ArrayList<>();
				PersonClassCollection person1 = new PersonClassCollection("aarthi", 32, "USA", 37647);
				PersonClassCollection person2 = new PersonClassCollection("karthi", 35, "Stockholm", 12742);
		        PersonClassCollection person3 = new PersonClassCollection("Sharanya", 36, "Australia", 7477);
		        PersonClassCollection person4 = new PersonClassCollection("Vanitha", 37, "Japan", 56383);
		        
		        li.add(person1);
		        li.add(person2);
		        li.add(person3);
		        li.add(person4);
		        li.sort(null);
		        
		        for (PersonClassCollection personClass : li) {
		        	
		        	System.out.println(personClass.name);
		        	System.out.println(personClass.age);
		        	System.out.println(personClass.address);
		        	System.out.println(personClass.Zipcode);
		        }
			}


			@Override
			public int compareTo(PersonClassCollection o) {
				// TODO Auto-generated method stub
				return 0;
			}

			

			
			
	}

	
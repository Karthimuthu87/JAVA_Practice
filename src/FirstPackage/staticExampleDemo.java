package FirstPackage;

public class staticExampleDemo {
	
	public static void main (String[] args) {
		
		System.out.println(staticExample.x);
		staticExample.x = 200;
		
		staticExample.m2();
		
		staticExample obj2 = new staticExample();
		System.out.println(obj2.x);
		
		System.out.println(staticExample.x);
		
	}

}

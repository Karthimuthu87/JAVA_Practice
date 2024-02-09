package FirstPackage;

public class Stringfunctions {

	public static void main(String[] args) {
	
		String fname = "Mugil";
		String lname = "Nilan";
		String space = " ";
		
		//Concat
		String fullname = fname.concat(space).concat(lname);
		System.out.println(fullname);
		
		//Concat with Operator
		String fullname2 = fname+space+lname;
		System.out.println(fullname2);
		
		//To Uppercase
		String fullnameuppcase = fname.toUpperCase();
		System.out.println(fullnameuppcase);
		
		//To Lowercase
		String Lastnameuppcase = fname.toLowerCase();
		System.out.println(Lastnameuppcase);
		
		//Length()
		int fullname1 = fname.length();
	    System.out.println(fullname1);
	    
	    //CharAt
		char Lastnamechar = lname.charAt(4);
		System.out.println(Lastnamechar);
		
		//Trim
	    String firstnametrim = fname.trim();
        System.out.println(firstnametrim);
        
        //indexOf() and lastIndexOf()
        int lastnameindex = lname.indexOf('N');
        System.out.println(lastnameindex);
        
        int lastnamelastindex = lname.lastIndexOf('n');
        System.out.println(lastnamelastindex);
         
       //replace
        
        String firstnamereplace = fname.replace('g', 'k');
        System.out.println(firstnamereplace);
        
        
	}

}

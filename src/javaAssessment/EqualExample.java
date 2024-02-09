package javaAssessment;

public class EqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1 = "Hello";
         String str2 = "Hell";
         String str3 = new String("Hello");
         String str4 = new String("Hel");
         
         boolean  result1 = str1 == str2;
         boolean  result2 = str3.equals(str4);
         
         System.out.println(result1);
         System.out.println(result2);
         
        		 
 
	}

}

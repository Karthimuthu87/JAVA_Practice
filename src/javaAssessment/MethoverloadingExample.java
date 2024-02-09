package javaAssessment;

public class MethoverloadingExample {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public double add(double a, double b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethoverloadingExample calc = new MethoverloadingExample();
		
		double Result1 = calc.add(2.5, 3.6);
		int Result2 = calc.add(54, 54);
		int Result3 = calc.add(4,5,6);
		
		System.out.println("Result1: "+ Result1);
		System.out.println("Result2: "+ Result2);
		System.out.println("Result3: "+ Result3);
		
		
	}

}

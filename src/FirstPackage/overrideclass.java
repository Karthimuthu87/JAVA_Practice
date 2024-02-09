package FirstPackage;

public class overrideclass extends Methodoverriding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overrideclass obj = new overrideclass();
		
		System.out.println(obj.sum(56, 38));
		System.out.println(obj.mul(2, 4));
		
	}
	@Override
	public int sum(int a, int b) {
		
		System.out.println("Sub class");
		return a+b;
	}
	

}

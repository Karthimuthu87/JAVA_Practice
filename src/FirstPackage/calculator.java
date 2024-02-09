package FirstPackage;

public class calculator extends calci{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      calculator obj = new calculator();
      System.out.println(obj.add(10, 20));
      System.out.println(obj.sub(100,50));
      System.out.println(obj.mul(10, 45));
      System.out.println(obj.div(60, 20));
	}

	@Override
	public int add(int num1, int num2) {
		return num1+num2;	
}

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		return num1/num2;
	}

}

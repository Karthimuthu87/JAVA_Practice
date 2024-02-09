package FirstPackage;

public class InterfacePolymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashPayment ca = new CashPayment();
		ca.pay();
		
			
		Payment cr = new CashPayment();
		cr.pay();
		
		cr =new CreditPayment(); 
		cr.pay();
		
		CreditPayment ce = new CreditPayment();
		ce.pay();

	}

}

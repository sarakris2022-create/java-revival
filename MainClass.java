
public interface MainClass {

	public void makePayment(double amount);
	public void generateReceipt(String invoiceID);
}

class CashPayment implements MainClass{

	@Override
	public void makePayment(double amount) {
		System.out.println("Amount:" +amount);
	}

	@Override
	public void generateReceipt(String invoiceID) {
		System.out.println("InvoiceID:" +invoiceID);
		
	}
	
}
class OnlinePayment implements MainClass{

	@Override
	public void makePayment(double amount) {
		System.out.println("Amount:" +amount);
	}

	@Override
	public void generateReceipt(String invoiceID) {
		System.out.println("InvoiceID:" +invoiceID);
		
	}
	
}
class Main{
	public static void main(String args[]) {
		CashPayment obj = new CashPayment();
		obj.makePayment(123456789);
		obj.generateReceipt("1234");
		OnlinePayment obj1 = new OnlinePayment();
		obj1.makePayment(1234.6789);
		obj1.generateReceipt("56789");
	}
}












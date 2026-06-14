 class Invoice {
	double amount;
	String cusName, invoiceID;
	public void display(){
		System.out.println(amount + " " +cusName + " " +invoiceID );
	}
		
	public Invoice(double amount, String cusName,String invoiceID) {
		this.amount = amount;
		this.cusName = cusName;
		this.invoiceID = invoiceID;
		
	}
}

 public class AccrualInvoice extends Invoice{
	String accDate;
	
	public AccrualInvoice(double amount, String cusName, String invoiceID, String accDate) {
		super(amount, cusName, invoiceID);
		this.accDate = accDate;
	}
	public void display(){
		System.out.println(amount + " " +cusName + " " +invoiceID +" " +accDate);
	}
	public static void main(String[] args) {
		
		Invoice obj = new AccrualInvoice(6123, "Petronas", "123456789", "12345");
		obj.display();
	}

}
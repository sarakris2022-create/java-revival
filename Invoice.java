
public class Invoice{
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

	public static void main(String[] args) {
		
		Invoice obj = new Invoice(6123, "Petronas", "123456789");
		obj.display();
	}

}

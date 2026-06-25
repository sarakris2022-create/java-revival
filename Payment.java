
public abstract class Payment {
	double amount;
	abstract void processPayment(); 
	public void show() {
		System.out.println("This is implemented");
	}
}
class ProcessPayment extends Payment{
	public ProcessPayment(double amount) {
		super();
		this.amount = amount;
	}
	@Override
	void processPayment() {
		System.out.println("Cash payment processed for: " + amount);
	}
	@Override
	public void show() {
		super.show();
	}
}
class OnliPayment extends Payment{
	public OnliPayment(double amount) {
		super();
		this.amount = amount;
	}
	@Override
	void processPayment() {
		System.out.println("Online payment processed for: " + amount);
	}
}
class Main2{
	public static void main(String args[]) {
		ProcessPayment obj = new ProcessPayment(123456789);
		obj.processPayment();
		obj.show();
		OnliPayment obj1 = new OnliPayment(1234.6789);
		obj1.processPayment();
	}
}
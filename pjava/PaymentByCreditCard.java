package pjava;
public class PaymentByCreditCard extends Payment{

	@Override
	public int getPayment() {
		System.out.println("Payment is done through credit card");
		return (1000*2);
	}

}
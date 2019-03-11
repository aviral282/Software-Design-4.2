
public class childCustomer extends Customer{

	public childCustomer(String n, int a, double p) {
		super(n, a, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double readPrice() {
		// TODO Auto-generated method stub
		return price * 0.5;
	}

}

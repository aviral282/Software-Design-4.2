
public class CustomerFactory {

	public Customer getCustomer(String name, int age, double origPrice) {
		// TODO Auto-generated method stub
		if(age<17)
			return new childCustomer(name, age, origPrice);
		else
			return new regularCustomer(name, age, origPrice);
	}

	
}



public class heavyBook extends Book {

	public heavyBook(String t, String i, double p) {
		super(t, i, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	double readNetPrice() {
		// TODO Auto-generated method stub
		return price + 3.25;
	}

}

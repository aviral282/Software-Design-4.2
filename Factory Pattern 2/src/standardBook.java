

public class standardBook extends Book {

	public standardBook(String t, String i, double p) {
		super(t, i, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	double readNetPrice() {
		// TODO Auto-generated method stub
		return price + 2.25;
	}

	
}

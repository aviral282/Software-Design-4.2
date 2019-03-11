
public abstract class Book {
	String Title;
	String isbn;
	double price;
	
	public Book(String t,String i, double p) {
		Title = t;
		isbn = i;
		price= p;
		
	}
	public void printDetails() {
	}
	
	public double readPrice(double p) {
		return p;
		
	}
	
	public void resetPrice(double p) {
		price = 0;
	}
	
	abstract double readNetPrice();
}

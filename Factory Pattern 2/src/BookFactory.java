
public class BookFactory {

	public Book getBook(String title, String isbn, double p, int w) {
		// TODO Auto-generated method stub
		if(w<300)
			return new standardBook(title, isbn, p);
		else
			return new heavyBook(title, isbn, p);
	}

}

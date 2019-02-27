
public class Decorator extends Counter {

	protected Counter counter;
	
	public Decorator(Counter cc) {
		super();
		counter = cc;
	}
}

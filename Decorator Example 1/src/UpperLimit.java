
public class UpperLimit extends Decorator {

	public UpperLimit(Counter cc) {
		super(cc);
		// TODO Auto-generated constructor stub
	}
	


	public void increment()
	{
		if(counter.readValue() >= 10)
		{
			System.out.println(" \nLimit 10 reached");
		}
		else
			counter.increment();
			
	}

	public void decrement()
	{
		
			counter.decrement();
	}

	public int readValue(){
		return   counter.readValue();
	}
}

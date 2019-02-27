
public class LowerLimit extends Decorator {

	public LowerLimit(Counter cc) {
		super(cc);
		// TODO Auto-generated constructor stub
	}


	public void increment()
	{
		
			counter.increment();
			
	}

	public void decrement()
	{
		
		if(counter.readValue() <= 0)
		{System.out.println("\nLimit 0 reached");
		}
		else
			counter.decrement();
	}

	public int readValue(){
		return   counter.readValue();
	}
}

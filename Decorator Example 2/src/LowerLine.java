
public class LowerLine extends Decorator {

	

	public LowerLine(Display dd) {
		super(dd);
		// TODO Auto-generated constructor stub
	}

	public void update(String n)
	{
	
		dis.update(n);
	}

	public void print()
	{
		
		dis.print();
		System.out.println("***********");
	}
}

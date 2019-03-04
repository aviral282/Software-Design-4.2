
public class UppperLine extends Decorator {


	
	public UppperLine(Display dd) {
		super(dd);
		// TODO Auto-generated constructor stub
	}

	public void update(String n)
	{
		dis.update(n);
	}

	public void print()
	{
		System.out.println("***********");
		dis.print();
	}

}

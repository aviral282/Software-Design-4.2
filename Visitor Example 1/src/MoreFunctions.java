
public class MoreFunctions implements Visitor {
	
	private Counter cc;
	

	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		cc = (Counter) v;
	}
	
	 public void increment()
		{
		 int currentVal = cc.readValue();
		currentVal+=1;
		cc.setValue(currentVal);
		}

}

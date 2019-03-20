
public class MoreFunction implements Visitor {
	private Outing oo;

	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		oo = (Outing) v;
		
	}
	public void booknew() {
		 int v=0;
		 v = oo.readCount();
		v = v+1;
		oo.setCount(v);
		
	}
	
	public void cancel() {
		int z = 0;
		oo.setCount(z);
	}

}

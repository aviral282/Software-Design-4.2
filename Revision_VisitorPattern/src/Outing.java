	
	interface Visitor {	
		public void visit(Visitable v);
	}


	interface Visitable {
		public void accept(Visitor v);
	}

class Outing implements Visitable
	{
		protected int count;
		public Outing(int count)
		{
			this.count = count;
			}

		public boolean cancel()
		{ if (count>0){
			this.count--;
			return true;}
		  else
		    return false;
		}

       public int readCount(){return count;}
       public void setCount(int c){count=c;}
		public void print_details()
		{
			System.out.println();
			System.out.println("Outing Details:");
			System.out.println("Number on Outing: "+count);
		}

		@Override
		public void accept(Visitor v) {
			// TODO Auto-generated method stub
			v.visit(this);
		}
}
	

	
	
	//    void book()  & void reset() to be implemented using Visitor pattern
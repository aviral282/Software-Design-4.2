




class Octo implements Iterator,Container
{
	
    private int v1,v2,v3,v4,v5,v6,v7,v8;
    int length=8;
    int index=0;
	int[] list ;
    public Octo(int[] li) { v1 = li[0]; v2 = li[1]; v3 = li[2];
                              v4 = li[3]; v5 = li[4]; v6 = li[5];
                              v7=li[6]; v8=li[7];}

    public String printList()
    {
        return "["+v1+","  +v2 + "," + v3 + "," + v4 +","+ v5+","+ v6+","+v7+","+v8+  "]";
    }
    public void gotoFirst() { index = 0; }
   
    public int[] toArray(){
    	return new int[]{v1,v2,v3,v4,v5,v6,v7,v8};
    	
    }

	@Override
	public Iterator iterator1() {
		// TODO Auto-generated method stub
		int []list = this.toArray();
		return new Octo(list);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		int []list = this.toArray();
		return index<list.length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		int []list = this.toArray();
		int res = list[index++];
		return res;
	}



    
    
}

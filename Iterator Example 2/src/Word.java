

class Word implements Iterator,Container
{
    private String value;
    private int index;


    public Word(String v)
    {
        value = v; index = 0;
    }

    public String readWord()
    {
        return value;
    }

    public void update(String v)
    {
        value = v;
    }

	@Override
	public Iterator iterator1() {
		// TODO Auto-generated method stub
		return new Word(value);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<value.length();
	}

	@Override
	public Object next() {
		char x = value.charAt(index++);
		return x;
}
		
         
}   

	
    
    













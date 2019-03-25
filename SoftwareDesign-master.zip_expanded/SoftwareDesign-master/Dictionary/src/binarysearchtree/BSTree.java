package binarysearchtree;

import java.io.Serializable;
import java.util.Scanner;


class Node {
	int key;
	String  name;
	Node left;
	Node right;
	Node(int k, String nm, Node ll, Node rr)
		{ key = k;
		  name = nm;
		  left = ll; right = rr; }
        public String readName(){return name;}
	}

public class BSTree implements Serializable{   
	private      Node head;
    private      Node tail;
	public
	BSTree()  { tail = new Node(0, null, null, null);
			  head = new Node(-1, null, null, tail);}

	void  insert(int k, String nm)
				{
					Node  p, x;
					p = head; x = head.right;
					while (x!=tail)
						{ 	p = x;
		  					x = (k < x.key) ? x.left : x.right;}
					x = new Node (k, nm, tail, tail);
					if (k < p.key) p.left = x;
	          			else           p.right = x;
					}

	void   display_tree()
		{
		  System.out.println( "\nComplete Tree : ");
		  Node t = head.right;
		  traverse(t);
		 }

	void    traverse(Node t)
		{
		  if (t != tail)
			{
			traverse(t.left);
			visit(t);
                        traverse(t.right); }
		}
	Node   search(int k)
	{
	    Node   x= head.right;
                tail.key=k;
                boolean found=false;
				while (x!=tail && found==false)
					{ 	if (k==x.key) found=true;
	  					else if (k < x.key)     x= x.left ;
                             else               x= x.right;
                    }
				if (x==tail)       return null;
          		else               return   x;
			}
	

	void     visit(Node t)
		{
		  System.out.println( " Node: " + t.key + "  " + t.name);
		  }

	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
    String arr[] = new String[100];

		BSTree t1=new BSTree();
		t1.insert(5, "peter");
		t1.insert(2, "john");
		t1.insert(10, "martin");
		t1.insert(0, "sean");
		t1.insert(12, "liam");
		t1.insert(7, "mick");
		t1.insert(6, "brian");
		t1.display_tree(); 
		
		int choice = 1;
		while(choice!=5)
			{
			System.out.println("\nMenu");
			System.out.println("==============");
			System.out.println("1.Display Tree");
			System.out.println("2.Insert New Element");
			System.out.println("3.Search for element");
			System.out.println("4.Add meaning");
			System.out.println("5.Exit");

			System.out.print("Please enter a value-->");
			choice =sc.nextInt();
		
			if(choice==1)
			{
				t1.display_tree();
			}
			else if(choice==2)
			{
				System.out.print("Enter a new key value(1-100 not already in list:)");
				int k =sc.nextInt();
				System.out.print("Please enter a new name-->");
				String n =sc.next();
				t1.insert(k, n);
			}
			else if(choice==3)
			{
				System.out.print("Please enter a new key value-->");
				int k =sc.nextInt();
				try
				{
					System.out.println("Value found= "+t1.search(k).readName());
					System.out.println("Meaning is:"+arr[k]);
				}
				catch(Exception e)
				{
					System.out.println("Value Not found");
				}
				
			}
			else if(choice == 4)
			{
				System.out.println("Please enter key value -->");
				int k = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				try
				{
					String n = t1.search(k).readName();
					if(n.equals(name))
					{
						System.out.println("Match");
						System.out.println("Enter meaning");
						String meaning = sc.next();
						arr[k] = meaning;
					}
					
				}
				catch(Exception e)
				{
					
				}
			}
			}  // end while
		
        


}
		}

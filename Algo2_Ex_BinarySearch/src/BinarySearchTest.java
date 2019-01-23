import java.awt.Graphics;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;

public class BinarySearchTest  {
	
	public static boolean search(int[] list,int target){
		boolean res =false;
		int LI=0;
		int UI=list.length-1;
		int LOC= (UI+LI)/2;

		while(res==false && UI>=LI)
		{
			if(list[LOC]==target) {
				res=true;
			}
			else if(target < list[LOC]) {
				UI =LOC-1;
			}
			else {
				LI=LOC+1;
			}
			LOC=(UI+LI)/2;
		}
	        return   res;
}

public static void main(String[] args)
{		Scanner sc = new Scanner(System.in);
			int[] list={1,3,5,6,7,9,11,17};
			
			System.out.print("Enter Target:");
			int target =sc.nextInt();
			boolean res=search(list,target);
			System.out.println("Target Found: "+res);
			}
}

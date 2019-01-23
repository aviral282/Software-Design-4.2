import java.awt.Graphics;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;

public class BinarySearchTest  {
	
	public static boolean search(int[] list,int target){

	        return   false;
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

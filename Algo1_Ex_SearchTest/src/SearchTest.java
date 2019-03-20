import java.util.Scanner;
 

public class SearchTest {

public static boolean search(int[] list, int target){
	boolean res= false;
	for(int i = 0;i<list.length; i++) {
		if(list[i] == target)
			res = true;
	}
	
	return res;
}

public static void main(String[] args)
{
			int[] list={4,1,3,8,5,2,11,21,6};
                        Scanner sc = new Scanner(System.in);

			System.out.print("Enter Target: ");
			int target =sc.nextInt();

			boolean res=search(list,target);
			System.out.println("Target Found: "+res);
			}
}

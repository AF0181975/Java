package executor;

import java.util.ArrayList;
import java.util.Collections;

public class Reversearray {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(9);
		a.add(8);
		a.add(7);
		a.add(6);
		a.add(2);
		a.add(1);
System.out.println("The elements are:");
a.add(3,5);
System.out.println("The Original elements are:"+a);
System.out.println("The elements after reverse order:");
Collections.sort(a);
System.out.println(a);

	}

}

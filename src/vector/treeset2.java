package vector;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet();
		   t.add(4544);
		   t.add(123);
		   t.add(34);
		   //t.first();
		   //t.tailSet(123455);
		  // t.descendingIterator();
		   System.out.println(t);
		   Iterator i=t.iterator();
		   while (i.hasNext()) {
			   System.out.println(i.next());
		   }

	}

}

package vector;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h=new HashSet();
h.add(123);
h.add("hello");
//h.clear();
//h.clone();
h.contains("ert");
h.equals(1234);
h.isEmpty();
h.iterator();
h.size();
//h.remove(2);
h.toArray();
System.out.println(h);
Iterator i=h.iterator();
while (i.hasNext()) {
	System.out.println(i.next());
}



	}

}

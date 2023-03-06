package vector;

import java.util.Iterator;
import java.util.Vector;

public class vectDemo {
public static void main(String arg[])
{
	 Vector v=new Vector();
	 v.addElement(123);
	 //v.addAll(v);
	 v.capacity();
	 //v.clear();
	 v.clone();
	// v.remove();
	 
	 System.out.println(v);
	 Iterator i=v.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
}
}
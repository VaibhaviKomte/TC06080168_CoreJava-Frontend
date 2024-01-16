package sessiondec;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.Serializable;
import java.util.RandomAccess;

public class LinkedlistDemo {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.add("Vaibhavi");
		l.add(40);
		l.add(null);
		l.add(40);
		
		System.out.println(l);
		
		l.set(0,"Mrudu");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(70);
		System.out.println(l);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
		
		
		
	}

}

package sessiondec;
import java.util.*;
public class ArrayListDemo {
	
	public static void main(String args[]) {
		int no = 30;
		Integer i = new Integer (no); // boxing - primitive to wrapper 
		int a = i.intValue(); // autoboxing - wrapper to primitive
		int b = 100;
		Integer m = b;//auto boxing 
		int c = m; // auto unboxing
		
	
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		//l.add("ABC");
		l.add(10);
		l.add(78);
		l.add(98);
		//l.add('a');
		l.add(null);
		System.out.println(l);
		l.add(2,56);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.contains(100));
		List l1 = Collections.synchronizedList(l);
		
		
		
		
	}

}

/*public class ArrayListDemo{
	int i;
	public static void main(String args[]) {
		ArrayListDemo t ;
		System.out.println(t.i);
	}
}*/












// why null?
//->
//nullPointerExceptionos occurs when there nothing to fetch and still we try
import java.util.*;

/**
 * 
 */

/**
 * @author saifahmad
 *
 */
public class LearnGenerics extends LearnCollections {
	
	
	public void start() {
		System.out.println("Start Generics");
		
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(10);
		System.out.println(iList);
		
	}
	
	
	public <M> void myMethod(M arrList, M item) { 
		System.out.println("myMethod Call..");
		System.out.println(arrList);
		System.out.println(item);
		
	}
	
	public static <T> int countAllOccurrences(T[] list, T item) {
	   int count = 0;
	   if (item == null) {
	      for ( T listItem : list )
	         if (listItem == null)
	            count++;
	   }
	   else {
	      for ( T listItem : list )
	         if (item.equals(listItem))
	            count++;
	   }
	   return count;
	}  

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learning sessions for Java Collections\n");
		LearnGenerics learn = new LearnGenerics();
		learn.learnArrayList();
		
		learn.start();
		
		GenericClass<String> genObj = new GenericClass<String>();
		genObj.set("Java Generics");
		System.out.println(genObj.get());
		
		GenericClass<Integer> genObj2 = new GenericClass<Integer>();
		genObj2.set(90);
		System.out.println(genObj2.get());
		
		learn.myMethod(learn.arrNumList, 10);
		learn.myMethod(learn.arrStrList, "Saif");
		
	}
}


class GenericClass<D> {
	private D iVar;
	
	public void set(D tVar) {
		this.iVar = tVar;
	}
	
	public D get() {
		return this.iVar;
	}
}

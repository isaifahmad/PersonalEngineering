/**
 * 
 */
package workone;

class Above {
	
	public void showMe() {
		System.out.println("Show Above");
	}
	
	@Deprecated
	public void next() {
		System.out.println("Show next");
	}
}


/**
 * @author saifahmad
 *
 */
public class First extends Above {

	@Override
	public void showMe() {
		System.out.println("Show First");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First hai!");
		
		First firstObj = new First();
		
		firstObj.showMe();

		

	}

}



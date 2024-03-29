/**
 * 
 */
package workone;

import java.lang.annotation.Annotation;

/**
 * @author saifahmad
 *
 */
@CustomeAnnotation(custome_type = "PROTOCAL", no_of_types = 4)
class UpperClass {
	public void upperMe() {
		System.out.println("This is upperMe of UpperCustome");
	}
	
	public void show() {
		System.out.println("UpperClass");
	}
}


@CustomeAnnotation
public class UseCustomeAnnotation extends UpperClass {

	/**
	 * @param args
	 */
	
	@Override
	public void show() {
		System.out.println("UseCustomeAnnotation");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Applying custome annotation");
		UseCustomeAnnotation obj = new UseCustomeAnnotation();
		obj.show();
		
		UpperClass ins = new UseCustomeAnnotation();
		ins.show();
		
		Class cObj = obj.getClass();
		Annotation anObj = cObj.getAnnotation(CustomeAnnotation.class);
		CustomeAnnotation custObj = (CustomeAnnotation)anObj;
		System.out.println(custObj.custome_type());
		
		Class classObj = obj.getClass();
		Annotation annObj = classObj.getAnnotation(CustomeAnnotation.class);
		CustomeAnnotation customeObj = (CustomeAnnotation)annObj;
		System.out.println(customeObj.no_of_types());
		
		UpperClass upperObj = new UpperClass();
		Class classObj2 = upperObj.getClass();
		
		Annotation annObj2 = classObj2.getAnnotation(CustomeAnnotation.class);
		CustomeAnnotation  custObj2 = (CustomeAnnotation)annObj2;
		System.out.println(custObj2.custome_type());
		

	}

}

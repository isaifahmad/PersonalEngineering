/**
 * 
 */
package workone;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
/**
 * @author saifahmad
 *
 */
@Target(ElementType.TYPE)
public @interface WorkAnnotation {
	
	String name() default "Hacking";
	int count() default 786;

}

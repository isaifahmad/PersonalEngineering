/**
 * 
 */
package workone;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@Inherited	
/**
 * @author saifahmad
 *
 */
public @interface CustomeAnnotation {
	String custome_type() default "Network"; 
	int no_of_types() default 10;
}

/**
 * 
 */
package hello;

/**
 * @author Anjali
 *
 */


import org.springframework.beans.factory.annotation.Value;

public class PlaceForAnnotation {
	@Value("USA")
	private String place;

	@Override
	public String toString() {
		return "PlaceForAnnotation [place=" + place + "]";
	}
	

}

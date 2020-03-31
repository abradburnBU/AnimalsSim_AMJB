/**
 * This is used when the user inputs coordinates that are less than 0. Informs the user that information is incorrect.
 * @author imaus
 *
 */
public class InvalidCoordinateException extends RuntimeException{

	InvalidCoordinateException(String message){
		super(message);
		
	}//ends Exception
	
}//ends class

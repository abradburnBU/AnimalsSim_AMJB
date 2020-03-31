/**
 * Exception that occurs when the SimID isn't an integer greater than 0
 * @author imaus
 *
 */
public class InvalidSimIDException extends RuntimeException{

	InvalidSimIDException(String message){
	
		super(message);
		
	}
	
}//ends InvalidSimIDException

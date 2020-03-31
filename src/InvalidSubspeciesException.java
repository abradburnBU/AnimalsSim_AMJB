/**
 * This is called to print a message when an invalid subspecies has been entered by a user
 * @author imaus
 *
 */
public class InvalidSubspeciesException extends RuntimeException{

	InvalidSubspeciesException(String message){
		super(message);
		
	}
	
}//ends InvalidSubspeciesException

/**
 * This Exception is used when a user inputs a wingspan that is not between the specified dimensions
 * @author imaus
 *
 */
public class InvalidWingspanException extends RuntimeException{

	InvalidWingspanException(String message){
		super(message);
		
	}
	
}//ends InvalidWingspanException

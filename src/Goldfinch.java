/**
 * The Goldfinch class is used to create/handle the specific traits that are exclusive to the Goldfinch in comparison to other classes under the Animal parent
 * @author imaus
 *
 */

public class Goldfinch extends Animal{

	private double wingSpan; //The wingspan variable is used to determine the Goldfinch's wingspan and is later checked to remain with a range of 5.0 to 11.0
	
	/**
	 * The empty-argument constructor is used to initialize the variables for the Goldfinch class
	 */
	
	public Goldfinch() {
		
		simID=0;
		Location l = new Location();
		l.setxCoord(0);
		l.setyCoord(0);
		full=false;
		rested=true;
		wingSpan=9.0;
		
	}//ends empty-argument constructor

	/**
	 * The preferred constructor sets the currently executing variables to what they are equal to in the Goldfinch class except for the wingSpan variable that has to be
	 * between the double values of 5.0 and 11.0
	 * @param simID
	 * @param location
	 * @param wingSpan
	 */
	
	public Goldfinch(int simID, Location location, double wingSpan) {
		this.simID=simID;
		this.location=location;
		InvalidWingspanException iwe = new InvalidWingspanException("The Wingspan must be between 5.0 and 11.0 cm!");
		try{
			if(wingSpan>5.0 && wingSpan<11.0){
			this.wingSpan=wingSpan;
			}else{
				throw iwe;
			}//ends else
		}catch(InvalidWingspanException i){
			System.out.println(i.getMessage());
		}//ends catch
		full=false;
		rested=true;
	}
	
	/**
	 * The Flyable and Walkable interfaces should be called to have them move the appropriate amount based on the Goldfinch's current location and where it is trying to move
	 * to, however I couldn't figure out how to get these to work properly.
	 */
	
	public void Flyable(){
		
	}//Calls and uses the interface "Flyable"
	
	public void Walkable() {
		
	}//Calls and uses the interface "Walkable"
	
	//GETTERS AND SETTERS
	
	protected double getWingSpan() {
		return wingSpan;
	}

	protected void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	
}//ends Goldfinch
